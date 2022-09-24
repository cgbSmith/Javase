package com.cgb.api;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author cgb
 * @version 1.0
 */
public class API {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = Inet4Address.getLocalHost();
        System.out.println(localHost);
    }
}
