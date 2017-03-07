package com.demo.classes;

interface Drawable{
	void print();
	
	default void draw(){
		System.out.println("Hello");
	}
}

abstract class Bike{
	
	abstract void run();
	
	void draw(){
		System.out.println("Hi");
	}
}

public class FourWheeler extends Bike{
	@Override
	void run() {
		
		// TODO Auto-generated method stub
		System.out.println("Demo");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike = new FourWheeler();
		bike.run();
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	public void draw(){
		
	}
}
