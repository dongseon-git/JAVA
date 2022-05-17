package com.pcwk.ex02.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {
	// 순차적인 추가/삭제 : ArrayList
	// 중간에 추가/ 삭제 : LinkedList
	// 뒤에서 추가/삭제 : removeArrayList
	public static void main(String[] args) {
		// 순차적인 추가
		// ArrayLis VS LinkedList : ArrayLis
		ArrayList<String> arrayList = new ArrayList<>(1_000_000);
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println("순차적인 추가");
		System.out.println("ArrayList:" + addsequential(arrayList));
		System.out.println("LinkedList:" + addsequential(linkedList));

		// 중간에 추가
		// ArrayLis vs LinkedList : LinkedList
		System.out.println("-중간에 추가");
		System.out.println("ArrayList:" + addMiddle(arrayList));
		System.out.println("LinkedList:" + addMiddle(linkedList));

		// **뒤에서부터 삭제
		System.out.println("-뒤에서부터 삭제");
		System.out.println("ArrayList:" + removeArrayList(arrayList));
		System.out.println("LinkedList:" + removeArrayList(linkedList));

	}

	public static long removeArrayList(List<String> list) {

		long start = System.currentTimeMillis();

		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);

		}

		long end = System.currentTimeMillis();

		return end - start;

	}

	public static long addMiddle(List<String> list) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < 1_00_000; i++) {
			list.add(999, String.valueOf(i)); // i+"" 와 String.valueOf(i) 동일

		}

		long end = System.currentTimeMillis();
		return end - start;

	}

	/**
	 * 순차적인 추가
	 * 
	 * @param list
	 * @return long
	 */
	public static long addsequential(List<String> list) {

		long start = System.currentTimeMillis();
		// 천단위 구분자
		// 1000000->1_000_000
		for (int i = 0; i < 1_000_000; i++) {
			list.add(i + "");

		}
		long end = System.currentTimeMillis();
		return end - start;

	}
}