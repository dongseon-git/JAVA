package com.pcwk.ed02;

public class EX04_IF_ELSEIF {
	// 100점~90점 A
	// 89점~80점 B
	// 79점~70점 C
	// 69점~60점 D
	// 60점 이하는 F
	public static void main(String[] args) {
		int score = 50; // 점수
		char grade = ' '; // 학점
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("점수는: " + score);

		System.out.println("성적은: " + grade);

	}

}
