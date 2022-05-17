package com.pcwk.oop02;

public class StaticTest02Class {

	void instanceMethod() {
	}// 인스턴스 메서드

	static void staticMethod() {
	}// static메서드

	void instanceMethod02() {// 인스턴스메서드
		instanceMethod();// 다른 인스턴스 메서드 호출 가능
		staticMethod();// 다른 static 메서드
	}

	static void staticMethod02() {// 인스턴스메서드
		// instanceMethod();//다른 인스턴스 메서드 호출 가능
		staticMethod();// 다른 static 메서드
	}
}
