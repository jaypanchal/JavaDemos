package com.demo.classes;

class Vehicle {

	void run(){
		System.out.println("Run method of Vehicle class");
	}	
}

public class Demo extends Vehicle{
	
	void run(){
		System.out.println("Run method of Demo class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo demo = new Demo();
		demo.run();
		
	}
}
