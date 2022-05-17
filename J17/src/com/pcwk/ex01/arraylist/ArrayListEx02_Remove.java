package com.pcwk.ex01.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx02_Remove {

	public static void main(String[] args) {
		// C,JAVA,ORACLE,WEB,SPRING,C
		// 데이터 중복 허용
		ArrayList<String> lectureList = new ArrayList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));

		System.out.println("lectureList:" + lectureList);

		// 데이터 삭제
		String removeLecture = lectureList.remove(0);

		System.out.println("removeLecture:" + removeLecture);
//데이터 삭제
		lectureList.remove("C");
		System.out.println("lectureList:" + lectureList);

		lectureList.clear();
		System.out.println("lectureList:" + lectureList);

	}

}
