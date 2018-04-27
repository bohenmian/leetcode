package com.javaPlus.java.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * BIO Client Demo
 */
public class Client {

    private static final int PORT = 8080;
    private static final String MESSAGE = "Client Data";
    private static final String LOCALHOST = "127.0.0.1";

    public static void main(String[] args) {
        try {
            //监听本机8080端口
            Socket socket = new Socket(LOCALHOST, PORT);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            //向服务端写数据
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            printWriter.print(MESSAGE);
            printWriter.flush();

            //接收服务端返回的数据
            String line = reader.readLine();
            System.out.println(line);

            reader.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
