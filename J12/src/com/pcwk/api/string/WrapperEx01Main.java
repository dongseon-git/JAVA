package com.pcwk.api.string;

import org.apache.log4j.Logger;

public class WrapperEx01Main {
	final static Logger LOG = Logger.getLogger(WrapperEx01Main.class);

	public static void main(String[] args) {

		Integer iValue = new Integer(100);
		int myValue = iValue.intValue();
		LOG.debug("myValue:" + myValue);
		String num01Str = "100";
		int num01 = Integer.parseInt(num01Str);
		LOG.debug("num01:" + num01);

		Integer i01 = new Integer(100);
		Integer i02 = new Integer(100);
		System.out.println("i01 == i02=" + (i01 == i02));
		System.out.println("i01.equals(i02)=" + i01.equals(i02));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("SIZE:" + Integer.SIZE + "bit");
		System.out.println("BYTES:" + Integer.BYTES + "BYTES");

	}

}
