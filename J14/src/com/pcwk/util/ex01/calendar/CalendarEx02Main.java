/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx02Main.java
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

import java.io.ObjectInputStream.GetField;
/**
 * @author gimdongseon
 *
 */
import java.util.*;

import com.pcwk.cmn.LoggerManager;

public class CalendarEx02Main implements LoggerManager {

	// Calendar 사용
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar today = Calendar.getInstance();

		// 년도
		int year = today.get(Calendar.YEAR);
		// 월:0~11(0=1월)
		int month = today.get(Calendar.MONTH) + 1;

		// 일
		int date = today.get(Calendar.DATE);
		LOG.debug("이 해의 년도:" + year);
		LOG.debug("월(0~11):" + month);
		LOG.debug("해당월의 일:" + date);

		LOG.debug("=======================");
		LOG.debug(year + "년" + month + "월" + date + "일");

		// 요일: 1(일요일)~7(토요일)
		int week = today.get(Calendar.DAY_OF_WEEK);
		LOG.debug("요일:1(일요일)~7(토요일):" + week);

		// 오전,오후
		// (오전:0,오후:1)

		LOG.debug("(오전:0,오후:1)" + today.get(Calendar.AM_PM));

		// 시간(0~11)
		LOG.debug("시간(0~11):" + today.get(Calendar.HOUR));
		// 시간(0~23)
		LOG.debug("시간(0~23):" + today.get(Calendar.HOUR_OF_DAY));
		// 분
		LOG.debug("분(0~59):" + today.get(Calendar.MINUTE));
		// 초
		LOG.debug("초(0~59):" + today.get(Calendar.SECOND));
		// 1000분의 1초
		LOG.debug("1000분의 1초:" + today.get(Calendar.MILLISECOND));

		LOG.debug(
				today.get(Calendar.HOUR_OF_DAY) + ":" + today.get(Calendar.MINUTE) + ":" + today.get(Calendar.SECOND));

	}

}
