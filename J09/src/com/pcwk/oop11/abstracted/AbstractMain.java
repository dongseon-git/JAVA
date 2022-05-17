package com.pcwk.oop11.abstracted;

//import com.pcwk.oop02.inter.Pikachu;
//import com.pcwk.oop02.inter.Squirtle;

public class AbstractMain {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu();
		System.out.println("이 포켓몬은 : " + pikachu.getName());
		pikachu.sound();
		pikachu.attack();

		Squirtle squirtle = new Squirtle();
		System.out.println("이 포켓몬은 :" + squirtle.getName());

		squirtle.sound();
		squirtle.attack();

	}

}
