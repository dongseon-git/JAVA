package com.pcwk.exception.ex01;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import com.pcwk.cmn.LoggerManager;

public class CheckedExceptionMain implements LoggerManager {

	public static void main(String[] args) {
		LOG.debug("==================");
		// checked 예외
		// 예외 처리를 하지 않으면 compile 오류
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {

			// getMessage(): 발생한 예외클래스의 인스턴스에 저장된 메세지를 얻을 수 있다.

			LOG.debug("getMessage:" + e.getMessage());
			// e.printStackTrace();
		}

	}

}
