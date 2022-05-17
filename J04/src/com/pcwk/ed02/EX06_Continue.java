package com.pcwk.ed02;

public class EX06_Continue {
	/*
	 * continue문 현재의 반복을 뛰어 넣고 반복을 진행한다. 1~100까지 홀수만 더하기
	 */
	public static void main(String[] args) {

		int total = 0;
		int num;
		// continue 만나면 for문에 증감식으로 간다.
		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0) {// 짝
				continue;

			}
			System.out.println(num);
			total += num;

		}
		System.out.println("1부터 100까지 홀수 합:" + total);
	}

}
