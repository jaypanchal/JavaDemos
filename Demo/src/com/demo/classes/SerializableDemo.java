package com.demo.classes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class SerializableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerializableDemo serializableDemo = new SerializableDemo();
		serializableDemo.perfromSerialization();
		
		serializableDemo.performDeserialization();
		
	}

	public void perfromSerialization() {
		Student student = new Student(10, "Test");

		try {

			FileOutputStream fileOutputStream = new FileOutputStream("C:\\Test\\test.log");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(student);

			objectOutputStream.flush();
			objectOutputStream.close();

			System.out.println("Done!");

		} catch (Exception exception) {
			System.out.println(exception);
		}
	}

	public void performDeserialization(){
		
		try{
			
			FileInputStream fileInputStream = new FileInputStream("C:\\Test\\test.log");
			
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Student student = (Student)objectInputStream.readObject();
			
			System.out.println("ID : " + student.id +", Name : " + student.name);
						
		}catch(Exception exception){
			System.out.println(exception);
		}
		
	}
}
