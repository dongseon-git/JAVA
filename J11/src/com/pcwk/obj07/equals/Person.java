package com.pcwk.obj07.equals;

public class Person {

	long id;

	public Person(long id) {
		this.id = id;

	}

	public boolean equals(Object obj) {
		// Person의 id값으로 비교
		if (null != obj && obj instanceof Person) {
			return this.id == ((Person) obj).id;
		} else {
			return false;
		}

	}

}
