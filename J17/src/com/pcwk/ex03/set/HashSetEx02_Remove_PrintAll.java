package com.pcwk.ex03.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx02_Remove_PrintAll {

	public static void main(String[] args) {
		// 추가
		// 삭제
		// 제체 출력
		HashSet<String> lectureSet = new HashSet<>();
		lectureSet.add("C");
		lectureSet.add("JAVA");
		lectureSet.add("WEB");
		lectureSet.add("SPRING");

		HashSet<String> lectureCpSet = new HashSet<>(lectureSet);

		System.out.println("lectureSet:" + lectureSet);

		// 삭제
		lectureSet.remove("C");
		System.out.println("lectureSet:" + lectureSet);

		// 다건 삭제
		lectureSet.removeAll(Arrays.asList("JAVA", "WEB"));
		System.out.println("lectureSet:" + lectureSet);

		// 전체 삭제
		lectureSet.clear();
		System.out.println("lectureSet:" + lectureSet);
		System.out.println("---------전체출력---------");
		System.out.println(lectureCpSet);

		// for-each loop
		for (String lec : lectureCpSet) {
			System.out.print(lec + ", ");
		}
        System.out.println();
		// using iterator
		Iterator<String> iter = lectureCpSet.iterator();

		while (iter.hasNext()) {// element가 있으면 true
			System.out.print(iter.next() + ", ");
		}

	}

}
