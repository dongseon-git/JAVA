package com.pcwk.ed02;

public class EX07_Break {

	public static void main(String[] args) {
		int sum = 0; // 합계

		int i = 0;// 증가

		for (i = 0; true; i++) {
			sum += i;
			if (sum >= 100) {
				break;
			}
		}
		System.out.println("sum:" + sum);
		System.out.println("i:" + i);
	}

}
