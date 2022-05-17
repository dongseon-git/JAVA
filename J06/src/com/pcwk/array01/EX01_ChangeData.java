package com.pcwk.array01;

public class EX01_ChangeData {

	public static void main(String[] args) {
		// x,y 값 교환(자리바꾸기, shuffle)
		int x = 10;
		int y = 20;
		int tmp;
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("=================");
		System.out.println("X:" + x);
		System.out.println("Y:" + y);
	}

}
