package com.demo.classes;

import java.io.IOException;

public class Examples {

	void testThrowKeyword() throws IOException {

		throw new IOException("Device error");

	}

	void testException() throws IOException{

		this.testThrowKeyword();

	}

	void test() {

		try {

			this.testException();

		} catch (IOException e) {

			System.out.println("IOException handled");

		} catch (Exception e) {
			
			System.out.println("Exception handled");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Examples examples = new Examples();
		examples.test();
		
	}

}
