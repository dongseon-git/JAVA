package com.pcwk.array;

import java.util.Arrays;

public class EX03_Array {

	public static void main(String[] args) {
		// 시험점수의 평균을 구해보자
		int[] student = { 100, 95, 90, 88, 93 };
		int sum = 0; // 합계
		for (int i = 0; i < student.length; i++) {
			sum += student[i];
		}

		// 배열에 있는 내용 출력하

		System.out.println(Arrays.toString(student));
		System.out.println("합계:" + sum);
		System.out.println("평균:" + sum / (float) student.length);

	}

}
