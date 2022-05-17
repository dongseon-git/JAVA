package com.pcwk.exception.ex08.userexception;

import com.pcwk.cmn.LoggerManager;

/**
 * @author gimdongseon
 *
 */
public class IDFormatExceptionMain implements LoggerManager {
	private String userID;

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 * @throws IDFormatException
	 */
	public void setUserID(String userID) throws IDFormatException {
//		id == null 예외 발생.
		if (null == userID) {
			throw new IDFormatException("아이디는 null 일수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20 자 이하로 사용하세요.");
		}
//		!(8 <= id <= 20)
		this.userID = userID;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IDFormatExceptionMain idFormat = new IDFormatExceptionMain();
		String id = "a123";

		try {
			idFormat.setUserID(id);
		} catch (IDFormatException e) {
			LOG.debug("IDFormatException : " + e.getMessage());
//			e.printStackTrace();
		}
		LOG.debug("프로그램 종료.");
	}

}