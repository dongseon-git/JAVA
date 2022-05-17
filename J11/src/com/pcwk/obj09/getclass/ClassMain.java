package com.pcwk.obj09.getclass;

public class ClassMain {

	public static void main(String[] args) {
		Card c01 = new Card("HEART", 3);
		System.out.println(c01);
		// Class cObj = card.class
		try {
			Card c02 = Card.class.newInstance();// default 생성자를 통해 객체 생성!

			System.out.println(c02);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c01);

		Class cObj = c01.getClass();

		System.out.println(cObj.getName());
		System.out.println(cObj.toString());
	}
}