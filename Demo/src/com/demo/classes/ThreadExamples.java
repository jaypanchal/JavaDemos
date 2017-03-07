package com.demo.classes;

class Table {
	synchronized static void printTable(int n) {

		for (int i = 1; i <= 5; i++) {

			System.out.println(i * n);

			try {

				Thread.sleep(400);

			} catch (Exception exception) {

				System.out.println(exception);
			}
		}
	}
}

class MyThreadOne extends Thread {

	Table table;

	public MyThreadOne(Table table) {

		this.table = table;
	}

	public void run() {

		Table.printTable(5);
	}
}

class MyThreadTwo extends Thread {

	Table table;

	public MyThreadTwo(Table table) {

		this.table = table;
	}

	public void run() {

		Table.printTable(10);
	}
}

class MyThreadThree extends Thread {

	Table table;

	public MyThreadThree(Table table) {

		this.table = table;
	}

	public void run() {

		Table.printTable(100);
	}
}

class MyThreadFour extends Thread {

	Table table;

	public MyThreadFour(Table table) {

		this.table = table;
	}

	public void run() {

		Table.printTable(1000);
	}
}

public class ThreadExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table table = new Table();

		MyThreadOne myThreadOne = new MyThreadOne(table);
		MyThreadTwo myThreadTwo = new MyThreadTwo(table);

		MyThreadThree myThreadThree = new MyThreadThree(table);
		MyThreadFour myThreadFour = new MyThreadFour(table);

		myThreadOne.start();
		myThreadTwo.start();
		myThreadThree.start();
		myThreadFour.start();

	}
}
