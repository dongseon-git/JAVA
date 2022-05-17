package com.pcwk.array01;

public class Q01_MaxMin {
//Q2.최대값과 최소값 구하기
	// 배열의 요소중 제일 큰 값과 제일 작은 값을 찾는다.
	// 1.최대값 변수, 최소값 변수
	// 2.배열요소 1개씩, 최대값과 비교
	// 배열이 최대 값보다 더 크면 max = 비교한 배열을 할당

	public static void main(String[] args) {
		int[] score = { 79, 88, 91, 33, 100, 55, 95 };
		int max = score[0];
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			if (max < score[i]) {
				max = score[i];
			}
			if (min > score[i]) {
				min = score[i];
			}

		}
		System.out.println("배열의 최대값=" + max);
		System.out.println("배열의 최솟값=" + min);
	}
}
