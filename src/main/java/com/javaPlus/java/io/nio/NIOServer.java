package com.javaPlus.java.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;


/**
 * NIO Server Demo
 */
public class NIOServer {

    public static void main(String[] args) throws IOException {
        //创建一个channel通道
        ServerSocketChannel channel = ServerSocketChannel.open();
        //让这个channel监听8080端口
        channel.socket().bind(new InetSocketAddress(8080));
        //设置为非阻塞模式
        channel.configureBlocking(false);
        //创建一个选择器
        Selector selector = Selector.open();
        //ServerSocketChannel注册到Selector上,监听ACCEPT事件
        channel.register(selector, SelectionKey.OP_ACCEPT);
        //初始化一个1M大小的缓存
        Handle handler = new Handle(1024);
        //轮询channel
        while (true) {
            //等待请求,每次等待阻塞3秒
            if (selector.select(3000) == 0) {
                System.out.println("请求等待超时");
                continue;
            }
            System.out.println("处理请求");
            //获取selector的key
            Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
            while (keyIterator.hasNext()) {
                //获取channel的key
                SelectionKey key = keyIterator.next();
                try {
                    //接收到连接请求
                    if (key.isAcceptable()) {
                        handler.handleAccept(key);
                    }
                    //如果channel有数据可读
                    if (key.isReadable()) {
                        handler.handleRead(key);
                    }
                } catch (IOException e) {
                    keyIterator.remove();
                    continue;
                }
                //处理完请求后,将待处理的selectedKeys中移除当前的key
                keyIterator.remove();
            }
        }
    }

    private static class Handle {
        //设置缓冲区的大小
        private int bufferSize = 1024;

        //设置编码格式
        private String localCharset = "UTF-8";

        public Handle(int bufferSize) {
            this(bufferSize, null);
        }

        public Handle(String localCharset) {
            this(-1, localCharset);
        }

        public Handle(int bufferSize, String localCharset) {
            if (bufferSize > 0) {
                this.bufferSize = bufferSize;
            }
            if (localCharset != null) {
                this.localCharset = localCharset;
            }
        }

        //接收请求控制函数
        public void handleAccept(SelectionKey key) throws IOException {
            SocketChannel socketChannel = ((ServerSocketChannel)key.channel()).accept();
            socketChannel.configureBlocking(false);
            //将新接入的客户端注册到Selector上,监听读操作
            socketChannel.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(bufferSize));
        }

        //读数据控制函数
        public void handleRead(SelectionKey key) throws IOException {
            //获取channel
            SocketChannel socketChannel = (SocketChannel) key.channel();
            //获取buffer并重置
            ByteBuffer buffer = (ByteBuffer) key.attachment();
            buffer.clear();
            if (socketChannel.read(buffer) == -1) {
                socketChannel.close();
            } else {
                //将buffer转换为读状态
                buffer.flip();
                String receivedString = Charset.forName(localCharset).newDecoder().decode(buffer).toString();
                System.out.println("received from client:" + receivedString);
                String sendString = "received from client:" + receivedString;
                buffer = ByteBuffer.wrap(sendString.getBytes(localCharset));
                socketChannel.write(buffer);
                socketChannel.close();
            }
        }
    }
}
