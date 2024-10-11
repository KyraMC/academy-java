package com.bptn.course._21_MultiThreading;

// We use threads if we want things to run simultaneously rather than in order

public class MultiThreadindDemo {

	public static void main(String[] args) throws InterruptedException {
		// Extending thread is done in the conventional way of creating objects
		MyThread t1 = new MyThread();
		t1.start();

		// Because we are implementing thread we need to create it like this
		Thread t2 = new Thread(new MyRunnable());
		t2.start();

		MyThread t3 = new MyThread();

		t1.sleep(1000);
		t1.join();

		System.out.println("Thread Completed");

	}

}
