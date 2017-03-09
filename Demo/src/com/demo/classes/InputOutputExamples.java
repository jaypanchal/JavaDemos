package com.demo.classes;

import java.io.BufferedOutputStream;
import java.io.Console;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilePermission;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.security.PermissionCollection;
import java.util.Enumeration;
import java.util.Vector;

public class InputOutputExamples {

	private DataInputStream dataInputStream;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputOutputExamples inputOutputExamples = new InputOutputExamples();
		//inputOutputExamples.DemoSequenceInputStream();
		
		//inputOutputExamples.DemoDataInputStream();
		
		//inputOutputExamples.DemoConsoleClass();
		
		//inputOutputExamples.DemoFilePermissions();
		
		inputOutputExamples.DemoFileWriter();
		
	}
	
	public void DemoFileWriter(){
		
		try{
			
			FileWriter fileWriter = new FileWriter("C:\\Test\\test.log");
			fileWriter.write("Helll");
			
			fileWriter.flush();
			fileWriter.close();
			
		}catch(Exception exception){
			System.out.println(exception);
		}
		
	}
	
	public void DemoFilePermissions(){
		
		String fileLocation = "C:\\Test\\test.log";
		
		FilePermission filePermission = new FilePermission("C:\\Test\\-", "read");
		
		PermissionCollection permissionCollection = filePermission.newPermissionCollection();
		
		permissionCollection.add(filePermission);
		
		FilePermission filePermission2 = new FilePermission(fileLocation, "write");
		
		permissionCollection.add(filePermission2);
		
		if(permissionCollection.implies(new FilePermission(fileLocation, "read,write"))){
		
			System.out.println("RW Permission is granted for path : "+ fileLocation);
			
		}else{
			
			System.out.println("No RW Permission is granted for path : "+ fileLocation);
		}
		
	}
	
	public void DemoConsoleClass(){
		
		Console console = System.console();
		
		System.out.println("Enter name : ");
		
		String name = console.readLine();
		
		System.out.println("Welcome " + name);		
		
	}
	
	public void DemoFilterOutputStream(){
		
		try{
			
			File file = new File("C:\\Test\\test.log");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
			
			String data = "HELLO";
			
			byte[] bytes = data.getBytes();
			
			fileOutputStream.write(bytes);
			filterOutputStream.flush();
			filterOutputStream.close();
			
			
			
		}catch(Exception exception){
			
		}
		
	}

	public void DemoDataInputStream() {

		try {

			InputStream inputStream = new FileInputStream("C:\\Test\\test.log");
			dataInputStream = new DataInputStream(inputStream);

			int count = inputStream.available();

			byte[] byteArray = new byte[count];

			dataInputStream.read(byteArray);

			for (byte byteElement : byteArray) {

				char character = (char) byteElement;

				System.out.print(character + "-");

			}

		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

	public void DemoByteArrayOutputStream() {

	}

	public void DemoFileOutputStream() {

		try {

			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Test\\test.log");

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			String data = "Welcome to the Java";

			bufferedOutputStream.write(data.getBytes());
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
			fileOutputStream.close();

			System.out.println("Success");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Test\\test.log");

			int i = 0;

			while ((i = fileInputStream.read()) != -1) {

				System.out.print((char) i);

			}

			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void DemoSequenceInputStream() {

		try {
			FileInputStream fileInputStream1 = new FileInputStream("C:\\Test\\test.log");
			FileInputStream fileInputStream2 = new FileInputStream("C:\\Test\\test.log");
			FileInputStream fileInputStream3 = new FileInputStream("C:\\Test\\test.log");
			FileInputStream fileInputStream4 = new FileInputStream("C:\\Test\\test.log");

			Vector<FileInputStream> vector = new Vector<FileInputStream>();

			vector.add(fileInputStream1);
			vector.add(fileInputStream2);
			vector.add(fileInputStream3);
			vector.add(fileInputStream4);

			Enumeration<FileInputStream> enumeration = vector.elements();

			SequenceInputStream inputStream = new SequenceInputStream(enumeration);

			int i = 0;

			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (Exception exception) {
			System.out.println(exception);
		}

	}
}
