package com.javaPlus.java.io.nio;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * NIO Client Demo
 */
public class NIOClient {

    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = null;
        Selector selector = null;
        try {
            socketChannel = SocketChannel.open(new InetSocketAddress(InetAddress.getLocalHost(), 8080));
            socketChannel.configureBlocking(false);
            selector = Selector.open();
            socketChannel.register(selector, SelectionKey.OP_CONNECT);
            while (true) {
                if (selector.select(3000) == 0) {
                    System.out.println("time out");
                }
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    if (key.isConnectable()) {
                        socketChannel.finishConnect();
                        socketChannel.register(selector, SelectionKey.OP_WRITE);
                    }
                    if (key.isWritable()) {

                    }
                }
            }
        } catch (IOException e) {
            e.getMessage();
        } finally {
            socketChannel.close();
            selector.close();
        }
    }
}
