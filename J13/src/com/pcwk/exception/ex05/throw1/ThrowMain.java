package com.pcwk.exception.ex05.throw1;

import com.pcwk.cmn.LoggerManager;

public class ThrowMain implements LoggerManager {

	public static void main(String[] args) {

		try {
			LOG.debug("1");
			Exception except = new Exception("예외 발생 시키기(고의) ");
			throw except;
			// LOG.debug("2"); Unreachable code
		} catch (Exception e) {

			LOG.debug("3.예외 발생!");
			LOG.debug("3.1Exception:" + e.getMessage());

		}

		LOG.debug("프로그램 종료");

	}

}
//세로 편집: Alt + shift + A
