package com.pcwk.exception.ex07.userexception;

import com.pcwk.cmn.LoggerManager;

public class UserExceptionMain implements LoggerManager {

	public static void ticketing(int age) throws AgeException {
		if (age < 0) {
			LOG.debug("ticketing():" + age);
			throw new AgeException("나이를 확인하세요.\n나이는 >0");

		}
	}

	public static void main(String[] args) {
		try {
			ticketing(-9);
		} catch (AgeException e) {
			LOG.debug("main AgeException");
			LOG.debug("getMessage:" + e.getMessage());

			// e.printStackTrace();
		}

	}

}
