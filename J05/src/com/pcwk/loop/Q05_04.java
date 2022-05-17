package com.pcwk.loop;

//구구단 중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들어보세요.

public class Q05_04 {

	public static void main(String[] args) {
       System.out.println("구구단 중 단보다 곱하는 수가 작거나 같은 경우까지만 출력하라");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j <= i; j++)
		    //if(i>=j)  -> 효율이 떨어진다.
			System.out.println(i + "x" + j + "=" + i * j);
			System.out.println();// 단수 띄우기
		}

	}

}
