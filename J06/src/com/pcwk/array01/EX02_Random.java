package com.pcwk.array01;

public class EX02_Random {

	public static void main(String[] args) {
		/*
		 * 0~9 사이 난수 
		 * Math.random() 
		 * 0.0<=x<1 
		 * 0.0<=x<10 
		 * (int) 0<=x<10
		 */

		// System.out.println("난수" + Math.random() );

		System.out.println("난수=" + (int) (Math.random() * 10));
	}

}
