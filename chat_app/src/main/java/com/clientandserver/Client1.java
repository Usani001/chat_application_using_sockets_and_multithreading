package com.clientandserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client1 implements Runnable{
    @Override
    public void run() {
        try {


            System.out.println("Client started");
            Socket socket = new Socket("localhost", 9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Type your message");
            String str = userInput.readLine();
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(in.readLine());
            Thread.sleep(1000);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
