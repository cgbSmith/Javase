package com.cgb.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author cgb
 * @version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端在9999端口监听，等待连接");
        Socket accept = serverSocket.accept();

        System.out.println("socket="+accept);

        InputStream inputStream = accept.getInputStream();
        byte[]buf = new byte[1024];
        int readLen=0;
        while((readLen = inputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,readLen));
        }
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
