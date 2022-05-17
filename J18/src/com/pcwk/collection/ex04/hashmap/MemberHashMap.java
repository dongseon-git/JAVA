package com.pcwk.collection.ex04.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.pcwk.collection.ex03.hashmap.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> memberHash;

	public MemberHashMap() {
		memberHash = new HashMap<>();

	}

	public void addMember(Member member) {
		memberHash.put(member.getMemberId(), member);

	}

	public boolean removeMember(int memberId) {
		if (memberHash.containsKey(memberId)) {
			memberHash.remove(memberId);
			return true;
		}
		System.out.println(memberId + "존재 하지 않습니다.");
		return false;
	}

	// map에 있는 모든 데이터 출력
	public void showAllMember() {

		Set<Integer> keyset = memberHash.keySet();
		Iterator<Integer> iter = keyset.iterator();

		while (iter.hasNext()) {

			int key = iter.next();
			Member member = memberHash.get(key);
			System.out.println(key + ", " + member.toString());
		}
	}
}
