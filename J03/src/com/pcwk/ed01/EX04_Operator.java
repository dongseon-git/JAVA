package com.pcwk.ed01;

public class EX04_Operator {

	public static void main(String[] args) {
		int num01 = 10;
		int i = 2;
		// 논리곱(&&) 은 두 항이 모두 true 일 때만 결과가 true
		// 앞 항이 false 이면 뒤항의 결과를 평가하지 않아도 false
		// false false && true
		// 앞 항이 false이므로 뒤 연산은 수행 하지 않
		boolean flag = ((num01 = num01 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println("flag =" + flag);
		System.out.println("num01 =" + num01);
		System.out.println("i =" + i);
        //논리합(||) 은 두항이 모두 false 일때만 결과가 false
		// 앞 항이 true 이면 뒤항의 결과를 평가하지 않아도 true임
		flag = ((num01 = num01 + 10) >= 10) || ((i = i + 2) < 10);

		System.out.println("flag:" + flag);
		System.out.println("num01:" + num01);
		System.out.println("i:" + i);

	}

}
