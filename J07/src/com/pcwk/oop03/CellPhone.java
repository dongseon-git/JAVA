package com.pcwk.oop03;

public class CellPhone {

	String model;// 모델
	String color;// 색상
	int capacity;// 용량

	// default 생성
	public CellPhone() {
	}

//생성자의 역할
//멤버변수 초기화
//생성자 오버로딩
	public CellPhone(String paramModel, String parColor, int parCapacity) {
		model = paramModel;
		color = parColor;
		capacity = parCapacity;

	}

}
