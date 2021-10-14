package com.neosoft.sessiontasks;



class Thread1 extends Thread {

	String str;

	public Thread1(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println("2 seconds:Wait ");
			int n = str.length();
			
			char[] temp = new char[n];

			for (int i = 0; i < n; i++) {
				temp[i] = str.charAt(i);
			}
			Thread.sleep(2000);
			System.out.println(String.copyValueOf(temp));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Thread2 extends Thread {
	String str;

	public Thread2(String str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		try {
			System.out.println(" 1 second delay in between. ");
			int n = str.length();

			
			char[] temp = new char[n];

			for (int i = 0; i < n; i++) {
				temp[i] = str.charAt(i);
			}
			Thread.sleep(1000);
			System.out.println(String.copyValueOf(temp)); // j v s n c
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class S6_MultiThreading {

	public static void main(String[] args) {
		Thread1 th1 = new Thread1("Java Multithreading : Thread 1");
		th1.start();
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();

		Thread2 th2 = new Thread2("Java MultiThreading : Thread 2");
		th2.start();
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}