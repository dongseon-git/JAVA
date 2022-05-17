package com.pcwk.ed02;

public class EX04_For02 {

	public static void main(String[] args) {
		// 1-10까지 누적

		int sum = 0;// 합계
    //초기화:for문 내에서 초기화
	// 조건식이 생략되면 : ture
		for (int i = 1,j=10;; i++,j--) {
			sum = sum + i;
			System.out.println("i="+i);//위로
			System.out.println("j="+j);//아래로
			if (i == 11)
				break;
		}
		System.out.println("1~10까지 합: " + sum);
	}

}
