package com.jakob.multi.thread.sample.code;

/**
 * Once you have a reference to the Thread object,
 * you can call methods on it. For instance,
 * you can get the name of the thread currently executing the code like this:
 */
public class CurrentThread {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		String threadName = Thread.currentThread().getName();
		System.out.println("ThreadName: "+ threadName);
	}
}
