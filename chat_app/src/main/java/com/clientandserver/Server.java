package com.clientandserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class Server implements Runnable{
@Override
	public void run() {
//		SpringApplication.run(Server.class, args);
		try {


			System.out.println("Waiting for clients.......");
			ServerSocket serverSocket = new ServerSocket(9806);
			Socket socket = serverSocket.accept();
			System.out.println("Connection established");
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = in.readLine();
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println("Server says: "+str);
			Thread.sleep(100);
		}catch (Exception e){
			e.printStackTrace();
		}
	}

}
