package com.pcwk.ed01;

import java.util.Scanner;

/*100점~90점 A	
89점~80점 B	
79점~70점 C	
69점~60점 D	
60점 이하는 F	*/
public class EX06_Switch05_Quiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요(1~100)");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();// 점수
		char grade = ' ';// 학점
		switch (score / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;

		}
		System.out.println("점수는:" + score);
		System.out.println("성적은:" + grade);

	}

}
