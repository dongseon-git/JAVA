package com.pcwk.time.ex03.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalMain {

	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998;

		System.out.println(a + b);

		
		
		//실수-정수*10의 -n
		BigDecimal num01 = new BigDecimal(String.valueOf(b));
		BigDecimal num02 = new BigDecimal(String.valueOf(a));
		
		System.out.println(num01.add(num02));
	}

}
