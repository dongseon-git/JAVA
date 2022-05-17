package com.pcwk.util.ex03.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeEx01 {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();

		System.out.println("today:" + today.toString());
		System.out.println("time:" + time);

		LocalDate localD = today.minusYears(2).plusMonths(3).minusDays(3);
		System.out.println("localD:" + localD);
		// 주 더하기

		LocalDate localD02 = today.plusWeeks(1);
		System.out.println("localD02:" + localD02);
	}

}
