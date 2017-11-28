package com.csdn.article.synchronize;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread m1 = new MyThread(1);
		MyThread m2 = new MyThread(2);
		m1.start();
		m2.start();
	}
}