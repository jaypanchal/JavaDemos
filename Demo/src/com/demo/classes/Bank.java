package com.demo.classes;

class RBIBank{
	
	String name = "Reserve Bank of India";
	
}

class SBIBank extends RBIBank{
	
	String name = "State Bank of India";
	
	void printName(){
		
		System.out.println(name);
		System.out.println(super.name);
		
	}
}

class Bank {

	public static void main(String arg[]){
		
		SBIBank sbiBank = new SBIBank();
		sbiBank.printName();
		
	}		
}
