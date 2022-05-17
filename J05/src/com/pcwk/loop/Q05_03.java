package com.pcwk.loop;



public class Q05_03 {
//Q1. 두 수를 입력받아 사칙 연산을 수행하는 프로그램을 작성하세요					
//입력은 int 로 받으세요	switch 문으로)		
	public static void main(String[] args) {

		for (int i = 2; i < 10; i += 2) {
			for (int j = 1; j < 10; j++)
				System.out.println(i + "x" + j + "=" + i * j);
			System.out.println();//단수 띄우
		}
		
	}

}
