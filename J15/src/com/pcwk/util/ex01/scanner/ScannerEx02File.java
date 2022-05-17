/**
* <pre>
* com.pcwk.util.ex01.scanner
* Class Name : ScannerEx02File.java
* Description:
* Author: gimdongseon
* Since: 2022/02/23
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/23 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ScannerEx02File {
//Scanner통해 파일 읽기
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("src/data99.txt"));

			int sum = 0;// 합계
			int cnt = 0;// 읽은 라인수
			// scanner.hasNextInt() == data 가 있으면 true, 더이상 데이터가 없으면 false

			while (scanner.hasNextInt()) {
				sum += scanner.nextInt();
				cnt++;

			}
			System.out.println("sum:" + sum);
			System.out.println("cnt:" + cnt);
			System.out.println("avg:" + (sum / (double) cnt));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
