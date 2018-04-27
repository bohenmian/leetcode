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
 * Use NIO achieve Http Server
 */

public class HttpServer {

    public static void main(String[] args) throws IOException {
        //创建一个channel
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //
        serverSocketChannel.bind(new InetSocketAddress(8080));

        //设置为非阻塞模式
        serverSocketChannel.configureBlocking(false);

        //创建一个选择器
        Selector selector = Selector.open();
        //将serverSocketChannel注册到selector上,并监听ACCEPT事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);

        while (true) {
            //等待请求,每次阻塞3秒
            if (selector.select(3000) == 0) {
                continue;
            }
            //获取等待的SelectionKey
            Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();

                keyIterator.remove();

            }
        }
    }

    private static class HttpHandler implements Runnable {

        private int bufferSize = 1024;
        private String localCharset = "UTF-8";
        private SelectionKey key;

        public HttpHandler(SelectionKey key) {
            this.key = key;
        }

        //接收数据函数
        public void handleAccept() throws IOException {
            SocketChannel socketChannel = ((ServerSocketChannel) key.channel()).accept();
            socketChannel.configureBlocking(false);
            socketChannel.register(key.selector(), SelectionKey.OP_READ, ByteBuffer.allocate(bufferSize));
        }

        //读取数据函数
        public void handleRead() throws IOException {
            SocketChannel socketChannel = (SocketChannel) key.channel();
            ByteBuffer buffer = (ByteBuffer) key.attachment();
            buffer.clear();
            //读取缓冲区的数据,如果没读到则关闭
            if (socketChannel.read(buffer) == -1) {
                socketChannel.close();
            } else {
                //将buffer转换为读状态
                buffer.flip();
                String received = Charset.forName(localCharset).newDecoder().decode(buffer).toString();
                String[] message = received.split("\r\n");
                for (String s : message) {
                    System.out.println(s);
                    if (s.isEmpty()) {
                        break;
                    }
                }
                String[] firstLine = message[0].split(" ");
                System.out.println();
                System.out.println();
                System.out.println("Method:\t" + firstLine[0]);
                System.out.println("url:\t" + firstLine[1]);
                System.out.println("HTTP Version:\t" + firstLine[2]);
                System.out.println();
                //返回客户端

                StringBuilder sendString = new StringBuilder();
                sendString.append("HTTP/1.1 200 0K\r\n");
                sendString.append("Content-Type:text/html;charset = " + localCharset + "\r\n");
                sendString.append("\r\n");
                sendString.append("<html><head><title>显示报文</title></head><body>");
                sendString.append("请求的报文是: <br/>");
                for (String s : message) {
                    sendString.append(s + "<br/>");
                }
                sendString.append("</body></html>");
                buffer = ByteBuffer.wrap(sendString.toString().getBytes(localCharset));
                socketChannel.write(buffer);
                socketChannel.close();
            }
        }

        @Override
        public void run() {
            try {
                if (key.isAcceptable()) {
                    handleAccept();
                }
                if (key.isReadable()) {
                    handleRead();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
