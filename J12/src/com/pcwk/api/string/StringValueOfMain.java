package com.pcwk.api.string;

import org.apache.log4j.Logger;

public class StringValueOfMain {
	final static Logger LOG = Logger.getLogger(StringValueOfMain.class);

	public static void main(String[] args) {
		String numStr = "100";
		LOG.debug("numStr:" + numStr);
		Integer.parseInt(numStr);
		int num = Integer.parseInt(numStr);
		int num02 = Integer.valueOf(numStr);
		LOG.debug(numStr + 1);// 문자열+1 -> 1001
		LOG.debug(num + 1);// 101
		LOG.debug(num02 + 1);// 101

		String doubleNumStr = "200.1";
		double doubleNum = Double.parseDouble(doubleNumStr);
		double doubleNum02 = Double.valueOf(doubleNum);

		LOG.debug(doubleNum + 1);// 201.1
		LOG.debug(doubleNum02 + 1);// 201.1
	}

}
