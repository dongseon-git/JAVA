package com.pcwk.time.ex01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateGet {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("============");

		System.out.println("today:" + today);
//년,월,일:get()
		int year = today.getYear();
		System.out.println("year:" + year);

		int months = today.getMonthValue();
		System.out.println("months:" + months);

		int day = today.getDayOfMonth();
		System.out.println("day:" + day);

		System.out.println("============");

		LocalTime time = LocalTime.now();// 현재 시간
		System.out.println("time:" + time.toString());

		time.getHour();
		int hour = time.getHour();
		int minutes = time.getMinute();
		int second = time.getSecond();
		System.out.println("hour:" + hour);
		System.out.println("minutes:" + minutes);
		System.out.println("second:" + second);

		// zone
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = LocalDate.now().atStartOfDay(zid);

		System.out.println(zdt);// 2022-02-24T00:00+09:00[Asia/Seoul]
		// 현재 시간대의 뉴욕
		ZoneId nyId = ZoneId.of("America/New_York");
		ZonedDateTime nyZdt = ZonedDateTime.now().withZoneSameInstant(nyId);
		System.out.println(nyZdt);// 2022-02-24T00:00-05:00[America/New_York]

	}

}
