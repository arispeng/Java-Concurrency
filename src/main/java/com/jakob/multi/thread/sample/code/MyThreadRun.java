package com.jakob.multi.thread.sample.code;

public class MyThreadRun {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();

		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();

		/**Common Pitfall: Calling run() Instead of start() **/
		Thread newThread = new Thread(myRunnable);
		newThread.run();  //should be start();

		/** thread names helps you distinguish different threads **/

		Thread thread2 = new Thread("New Thread2") {
			public void run(){
				System.out.println("run by: " + getName());
			}
		};


		thread2.start();
		System.out.println(thread2.getName());

		MyRunnable runnable = new MyRunnable();
		Thread thread3 = new Thread(runnable, "New Thread3");

		thread3.start();
		System.out.println(thread3.getName());



	}
}
