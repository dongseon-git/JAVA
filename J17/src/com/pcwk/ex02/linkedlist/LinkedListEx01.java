package com.pcwk.ex02.linkedlist;

import java.util.LinkedList;

public class LinkedListEx01 {
//linkedlist나 arraylist 사용 방법은 동일
	public static void main(String[] args) {
		LinkedList<String> linkedList01 = new LinkedList<>();

		linkedList01.add("JAVA");
		linkedList01.add("ORACLE");
		linkedList01.add("WEB");
		System.out.println("linkedList01:" + linkedList01);

		// 특정위치에 추가
		linkedList01.add(0, "C");
		System.out.println("linkedList01:" + linkedList01);
		linkedList01.set(0, "B");
		System.out.println("linkedList01:" + linkedList01);
	}

}


