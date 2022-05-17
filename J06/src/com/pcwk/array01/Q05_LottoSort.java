package com.pcwk.array01;

import java.util.Arrays;

public class Q05_LottoSort {

	public static void main(String[] args) {
		//1. 숫자 1~45를 할당
		//2. shuffle 6개 추출
		
		int ball[] = new int[45];
		// 01.
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1; // 0부터 시작 안하게 하기
		}
		System.out.println(Arrays.toString(ball));
		// 02.
		for (int i = 0; i < 6; i++) {
			// 0<=x<45의 변수 할당해야함.
			// 0.0<=x<1.0
			// 0.0<=x<45.0 *45
			// 0<=x<45(int)
			int n = (int) (Math.random() * 45);
			// System.out.println(n);
			int tmp = ball[i]; // ball[i]와 ball[n]의 자리 교환
			ball[i] = ball[n];
			ball[n] = tmp;
		}
		// 중복되지 않는 6개 숫자
		// System.out.println(Arrays.toString(ball));
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + ",");
		}
		System.out.println();
		//--------------------------------------------
		//sort
		//--------------------------------------------
		// 1. ball에 있는 배열 0번지부터 6개 copy
		int []sortBall = new int[6]; //6개
		System.arraycopy(ball, 0, sortBall, 0, sortBall.length);
		System.out.println("sortBall"+Arrays.toString(sortBall));
		
		// 2. sort
		for(int i=0;i<sortBall.length-1;i++) {
			for(int j=0;j<sortBall.length-1-i;j++) { //비교대상을 뺀다.
				
				if(sortBall[j]>sortBall[j+1]) {
					int tmp     = sortBall[j];
					sortBall[j] = sortBall[j+1];
					sortBall[j+1] = tmp;
				}
			}
		}//for i
		
		System.out.println("sort Looto =>"+Arrays.toString(sortBall));
		
	}
}