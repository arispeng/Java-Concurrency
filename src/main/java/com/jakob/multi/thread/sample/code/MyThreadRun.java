package com.jakob.multi.thread.sample.code;

public class MyThreadRun {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();
	}
}
