package com.demo.classes;

class MyThread extends Thread{
	public void run(){
		System.out.println("Shutdown hook task completed.");
	}
}

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String s) {
		this.message = s;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " (Start) Message = " + message);

		processMessage();

		System.out.println(Thread.currentThread().getName() + " end");

	}

	private void processMessage() {

		try {

			Thread.sleep(2000);

		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();

		}

	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		
		runtime.addShutdownHook(new MyThread());
		
		System.out.println("Main thread is sleeping now...");
		
		try{
			Thread.sleep(3000);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
