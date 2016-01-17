package com.ibm.developer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App
{
 public static void main(String[] args) throws IOException { 
        int port = Integer.parseInt(System.getenv("VCAP_APP_PORT")); 
        ServerSocket ss = new ServerSocket(port); 
        while (true) { 
            Socket s = ss.accept(); 
            s.getOutputStream() 
                    .write(("HTTP/1.1 200 OK\nContent-Type:text/html; charset=utf-8\nContent-Length: 2\n\n" +
		veryComplicatedMethod()) .getBytes()); 
        } 
    } 

    public static int veryComplicatedMethod() { 
        return 42; 
    } 

}
