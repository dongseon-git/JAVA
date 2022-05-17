package com.pcwk.ed01;

import java.util.Scanner;

public class EX01_NestedIF {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력 하세요.");
		String userId = scanner.nextLine();
		System.out.println("userId:" + userId);
		// userId: java,passwd:1234
		if (userId.equals("java")) {
			System.out.println("id일치");
			System.out.println("비밀번호를 입력하세요");
			String passwd = scanner.nextLine();
			if (passwd.equals("1234")) {
				System.out.println("비번 일치");

				// -----if----------------------
			} else {
				System.out.println("비밀 번호를 확인하세요.");
			}
		}
	}
}
