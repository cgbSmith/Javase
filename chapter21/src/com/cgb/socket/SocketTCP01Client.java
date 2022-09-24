package com.cgb.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author cgb
 * @version 1.0
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回="+socket);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello server".getBytes());
        outputStream.close();
        socket.close();
    }

}
