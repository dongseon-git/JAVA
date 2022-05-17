package com.pcwk.array;

public class EX09_Q01 {
//int[] score = {100,88,100,100,90}에 총합과 평균을 구하여
	public static void main(String[] args) {
		int[] score = { 100, 88, 100, 100, 90 };
		int sum = 0;// 총점
		float avg = 0.0f;// 평균

		for (int num : score) {
			sum += num;
		}
		System.out.println("합계:" + sum);
		avg = sum / (float) score.length;
		System.out.println("평균:" + avg);

		// int total = (score[0]+score[1]+score[2]+score[3]+score[4]);
//System.out.println("점수 총합 =" +(score[0]+score[1]+score[2]+score[3]+score[4]));
//System.out.println("점수 평균 =" +total/score.length );
		// 내가 만든 코드

	}

}
