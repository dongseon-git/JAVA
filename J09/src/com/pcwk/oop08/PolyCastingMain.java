package com.pcwk.oop08;

public class PolyCastingMain {

	public static void main(String[] args) {

		// 형제간의 관계:형변환 불가
		// FireEngine f = new FireEngine();
		// Ambulance a = new Ambulance();

		Car car = null;
		FireEngine fe01 = new FireEngine();
		FireEngine fe02 = new FireEngine();
		car = fe01;// ok
		car.drive();
		// car.water(); -> 컴파일 오류
		fe02 = (FireEngine) car;
		fe02.water();// water!

	}

}
