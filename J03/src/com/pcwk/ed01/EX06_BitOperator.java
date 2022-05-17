package com.pcwk.ed01;

public class EX06_BitOperator {

	public static void main(String[] args) {
		// 좌 shift
		int num1 = 5;
		int result = num1 << 2;
		System.out.println("num1<<2=" + result);
		// 우 shift
		int num2 = 10;
		result = num2 >> 2;
		System.out.println("num2>>2=" + result);
		// 부호화 우 shift
		num2 = 10;
		result = num2 >>> 2;
		System.out.println("num2>>>2=" + result);

	}

}
