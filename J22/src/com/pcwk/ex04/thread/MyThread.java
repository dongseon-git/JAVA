package com.pcwk.ex04.thread;

public class MyThread extends Thread {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread 진행중: " + i);
		}
	}

}
