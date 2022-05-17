package com.pcwk.util.ex02.date;

import java.util.Calendar;
import java.util.Date;

public class DateEx02 {
//date 와 calendar 간의 변환
//calendar -> date
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		Date d01 = new Date(cal.getTimeInMillis());
		System.out.println("d01:" + d01);

		// date -> Calendar
		Date d02 = new Date();
		Calendar cal02 = Calendar.getInstance();

		cal02.setTime(d02);

	}

}
