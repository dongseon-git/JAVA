package com.pcwk.ex04.thread;

public class ThreadMain {

	public static void main(String[] args) {
		MyThread thread01 = new MyThread();
		thread01.start();
		MyRunnable thread02 = new MyRunnable();
		Thread t = new Thread(thread02);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main() 함수 진행중: " + i);
		}
	}

}
