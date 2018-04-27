package com.javaPlus.java.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BIO Server Demo
 */
public class Server {

    private static final int PORT = 8080;

    public static void main(String[] args) {
        try {
            //服务端监听8080端口
            ServerSocket server = new ServerSocket(PORT);
            //接收客户端的请求
            Socket socket = server.accept();

            //用来接收Client发送过来的消息
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //打印出Client发送给服务端的消息
            String line = reader.readLine();
            System.out.println("received data from client" + " " + line);

            reader.close();
            socket.close();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
