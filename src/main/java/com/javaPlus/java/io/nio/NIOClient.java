package com.javaPlus.java.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class NIOClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8080);
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        //向服务端写数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        printWriter.print("Client Data");
        printWriter.flush();

        //接收服务端返回的数据
        String line = reader.readLine();
        System.out.println(line);

        reader.close();
        printWriter.close();
    }
}
