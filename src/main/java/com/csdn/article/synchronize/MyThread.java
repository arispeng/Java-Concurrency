package com.csdn.article.synchronize;

final class MyThread extends Thread {
	private int val;

	public MyThread(int v) {
		val = v;
	}
	// this is not thread safe
	public synchronized void print1(int v) {
		for (int i = 0; i < 100; i++) {
			System.out.print(v);
		}
	}

	public void print2(int v) {
		// thread safe
		synchronized (MyThread.class) {
			for (int i = 0; i < 100; i++) {
				System.out.print(v);
			}
		}
	}

	public void run() {
		//print1(val);
		 print2(val);
	}
}