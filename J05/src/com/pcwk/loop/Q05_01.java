package com.pcwk.loop;

import java.util.Scanner;

public class Q05_01 {
//Q1. 두 수를 입력받아 사칙 연산을 수행하는 프로그램을 작성하세요					
//입력은 int 로 받으세요	(if문으로)		
	public static void main(String[] args) {
		System.out.println("num1을 입력하세요>>");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		System.out.println("num2을 입력하세요>>");
		int num2 = scanner.nextInt();
		String operator = " "; // 연산자
		double result = 0; // 연산결과
		System.out.println("연산기호를 입력하세요 >>");
		operator = scanner.next();
		
		if ("+".equals(operator)) {
			result = num1 + num2;
		} else if ("-".equals(operator)) {
			result = num1 - num2;
		} else if ("*".equals(operator)) {
			result = num1 * num2;
		} else if ("/".equals(operator)) {
			result = num1 / (double) num2;
		} else {
			System.out.println("연산자를 확인하세요.");
			return;
		}

		System.out.println(num1 + ("" + operator) + num2 + "=" + result);

	}

}
