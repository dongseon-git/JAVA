package com.pcwk.collection.ex03.hashmap;

import java.util.*;

//순서 보장되지 않음
public class MemberHashMain {

	public static void main(String[] args) {

		// Map map = new HashMap<>(); //map인터페이스 통한 객체 생성
		HashMap map = new HashMap<>();
		map.put("김자바", new Member(100, "김자바"));
		map.put("이자바", new Member(200, "이자바"));
		map.put("박자바", new Member(300, "박자바"));
		map.put("김자바", new Member(400, "김자바"));// key중복은 없음

		// 데이터 가져오기
		// System.out.println(map.get("김자바"));

		Set set = map.keySet(); // key값을 set형태로 return
		Iterator iter = set.iterator();
//key에 해당되는 value() 추출
		while (iter.hasNext()) {
			System.out.println( map.get(iter.next()));
		}

		// System.out.println(map);

	}

}