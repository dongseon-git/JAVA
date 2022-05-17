package com.pcwk.ed01;

public class EX05_Switch04 {

	public static void main(String[] args) {
		String medal = "Bronze";
        medal = medal.toUpperCase(); // 모두 대문자로 변환(command+shift+X)
        System.out.println("medal:"+ medal);
		switch (medal) {
		case "GOLD":
			System.out.println("금메달입니다.");
			break;
		case "SILVER":
			System.out.println("은메달입니다.");
			break;
		case "BRONZE":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("no메달입니다.");
			break;
		}

	}

}
