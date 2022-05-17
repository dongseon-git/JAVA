package com.pcwk.ex03.set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetEx01Add {

	// 1. 중복 값을 허용하지 않음
	// 2. 입력한 순서가 보장되지 않음
	// 3. null 값을 허용한다.
	// 중복된 값을 허용하지 않는 특징이 있기 떄문에 값의 존재 유무를 파악할 떄 사용.

	public static void main(String[] args) {
		HashSet<String> hashLec = new HashSet<>();

		hashLec.add("JAVA");
		hashLec.add("ORACLE");
		hashLec.add("WEB");

		System.out.println("hashLec:" + hashLec);
		// WEB 중복
		HashSet<String> otherLec = new HashSet<>(Arrays.asList("WEB", "SPRING", "C"));
		hashLec.addAll(otherLec);
		System.out.println("hashLec:" + hashLec);

	}

}
