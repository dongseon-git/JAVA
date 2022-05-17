package com.pcwk.util.ex02.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx03SimpleFormat {

	public static void main(String[] args) {
		SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS"); // HH 24시, hh 12시.
//		mm-dd,yyyy ( 미국 형식 )
		SimpleDateFormat sdf02 = new SimpleDateFormat("mm-dd-yyyy");
//		yy년 mmm월 dd일 e요일. 
		SimpleDateFormat sdf03 = new SimpleDateFormat("yy년 MM월 dd요일 E요일");
		Date today = new Date();
		System.out.println("yyyy-mm-dd HH:mm:ss.SSS : " + sdf01.format(today));
		System.out.println("mm-dd-yyyy : " + sdf02.format(today));
		System.out.println(sdf03.format(today));
	}

}