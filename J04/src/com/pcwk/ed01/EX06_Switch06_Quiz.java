package com.pcwk.ed01;

import java.util.Scanner;

/*100점~90점 A	
89점~80점 B	
79점~70점 C	
69점~60점 D	
60점 이하는 F	*/
public class EX06_Switch06_Quiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요(1~100)");

		Scanner scanner = new Scanner(System.in);
		//95점 이상이면 +를 붙여준다.
	    
		int score = scanner.nextInt();// 점수
		char plus = ' ';
		char grade = ' ';// 학점
		switch (score / 10) {
		case 10:
		case 9:
			if(score>=95) {
				plus = '+';
			}
			grade = 'A';
			break;
		case 8:
			if(score>=85) {
				plus = '+';
			}
			grade = 'B';
			break;
		case 7:
			if(score>=75) {
				plus = '+';
			}
			grade = 'C';
			break;
		case 6:
			if(score>=65) {
				plus = '+';
			}
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;

		}
		System.out.println("점수는:" + score);
		System.out.println("성적은:" + grade+plus);

	}

}
