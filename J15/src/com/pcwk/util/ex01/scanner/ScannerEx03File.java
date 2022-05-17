package com.pcwk.util.ex01.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx03File {
	// 100,100,100 한줄을 읽는다. 100,100,100->100 100 100
	// 200,200,200
	// 300,300,300
	// 400,400,400
	// 500,500,500

	public static void main(String[] args) {

		try {
			Scanner scanner = new Scanner(new File(
					"/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J15/src/com/pcwk/util/ex01/scanner/data99array"));
			int totalSum = 0;
			int cnt = 0;

			while (scanner.hasNextLine()) { // 데이가 있는 라인이 있으면 true, 그렇지 않으면 false
				String line = scanner.nextLine();
				// System.out.println(line);
				// 데이터를 "," 기준으로 자르기
				Scanner sc02 = new Scanner(line).useDelimiter(",");
				int sum = 0;
				while (sc02.hasNextInt() == true) {
					sum += sc02.nextInt();

				} // --while inner
				System.out.println("sum(Line) :" + sum);
				totalSum += sum;
				cnt++;// 읽은Line수

			} // while outer

			System.out.println("Line :" + cnt);
			System.out.println(", 총합:" + totalSum);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		System.out.println("file read 성공");

	}

}
