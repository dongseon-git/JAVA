package com.pcwk.util.ex02.date;

import java.util.Date;

public class DateEx01Main {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today.toString());// Tue Feb 22 11:31:23 KST 2022

		long currDate = System.currentTimeMillis();
		Date today02 = new Date(currDate);

		System.out.println(today02.toString()); // Tue Feb 22 11:31:23 KST 2022

	}

}
