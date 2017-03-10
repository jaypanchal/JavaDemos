package com.demo.networking;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

public class MyServer {

	public static void main(String[] args) {
				
		MyServer myServer = new MyServer();
		myServer.DemoServerSocketMessaging();
	}
	
	public void DemoServerSocketMessaging(){
		
		try{
	
			URL url = new URL("http://www.javatpoint.com/URLConnection-class");
			
			URLConnection urlConnection = url.openConnection();
			
			InputStream inputStream = urlConnection.getInputStream();
			
			int i;
			
			while((i = inputStream.read()) != -1){
				System.out.print((char)i);
			}
			
		}catch(Exception exception){
			System.out.println(exception);
		}
	}

}
