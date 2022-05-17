package com.pcwk.ed01;

public class EX02_Operator {
//논리연산자(&&,||)
	public static void main(String[] args) {
		int age01 = 10;
		int age02 = 13;
		// true && true
		boolean flag = (age01 > 0) && (age02 > 0);
		System.out.println("(age01>0) && (age02>0):" + flag);// true

		flag = (age01 > 0) || (age02 < 0);
		System.out.println("(age01>0) || (age02<0):" + flag);
	}

}
