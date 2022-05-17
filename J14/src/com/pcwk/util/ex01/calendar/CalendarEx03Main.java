/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx03Main.java
* Description:
* Author: gimdongseon
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.calendar;

import java.util.Calendar;

public class CalendarEx03Main {

	public static void main(String[] args) {
		// 요일 배열(1(일요일)~7)
		final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

		Calendar data01 = Calendar.getInstance();// 금일
		Calendar data02 = Calendar.getInstance();// 변경일
		if (data01.equals(data02)) {
			System.out.println("같다");

		}
		// 2022년
		// 6월 => 7월
		// 12일
		// 수료일

		data02.set(2022, 6, 12);

		System.out.println("data02은" + toString(data02) + "\n요일:" + DAY_OF_WEEK[data02.get(Calendar.DAY_OF_WEEK)]);
		// 금일
		System.out.println("data01은:" + toString(data01) + "\n요일:" + DAY_OF_WEEK[data01.get(Calendar.DAY_OF_WEEK)]);

		// 두 날짜간의 차이:단위 통일
		// 초단위 차이
		long difference = (data02.getTimeInMillis() - data01.getTimeInMillis()) / 1000;
		System.out.println("오늘부터 수료일까지:" + difference + "초가 남았습니다.");
		// 60초, 60분,24시
		// 일로 변경(60*60*24)

		System.out.println("오늘부터 수료일까지:" + (difference / (60 * 60 * 24)) + " 남았습니다.");
	}

	public static String toString(Calendar today) {
		// 년도
//			int year = today.get(Calendar.YEAR);
		// 월:0~11(0=1월)
//			int month = today.get(Calendar.MONTH) + 1;

		// 일
//			int date = today.get(Calendar.DATE);
		return today.get(Calendar.YEAR) + "년" + (today.get(Calendar.MONTH) + 1) + "월" + today.get(Calendar.DATE) + "일";
	}
}
