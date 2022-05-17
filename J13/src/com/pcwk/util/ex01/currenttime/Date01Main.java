package com.pcwk.util.ex01.currenttime;

import com.pcwk.cmn.LoggerManager;

public class Date01Main implements LoggerManager {
//현재 운영체제의 시각을 long타입으로 반환
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		LOG.debug("시작시간:" + start);

		for (int i = 1; i < 10000000; i++) {
			for (int j = 1; j < 10000000; j++) {
			}
		}

		long end = System.currentTimeMillis();
		LOG.debug("종료시간:" + end);
		LOG.debug("경과시간:" + (end - start) + "ms");

	}

}
