package com.pcwk.ex02.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListEx02 {
	public static void main(String[] args) {

		LinkedList<String> lectureList = new LinkedList<>(Arrays.asList("C", "JAVA", "ORACLE", "WEB", "SPRING", "C"));

		System.out.println("lectureList:" + lectureList);

		// 데이터 삭제;index

		String removeLecture = lectureList.remove(0);
		System.out.println("lectureList:" + lectureList);
		System.out.println("removelecture:" + removeLecture);

		// 데이터로 삭제
		boolean flag = lectureList.remove(removeLecture);
		System.out.println("삭제유무:" + flag);
		System.out.println("lectureList:" + lectureList);

		// 데이터 모두 삭제
		lectureList.clear();
		System.out.println("lectureList:" + lectureList);
	}
}