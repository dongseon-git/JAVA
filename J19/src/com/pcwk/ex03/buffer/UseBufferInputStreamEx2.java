   package com.pcwk.ex03.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UseBufferInputStreamEx2 {

	public static void main(String[] args) {
		String filePath = "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J19/big_outout3.txt";
		System.out.println("filePath:" + filePath);

		long start = System.currentTimeMillis();
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(filePath);
			bis = new BufferedInputStream(fis);
			int data = 0;
			while ((data = bis.read()) != -1) {
				char ch = (char) data;
				System.out.print(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		long end = System.currentTimeMillis();

		System.out.println("=============");
		System.out.println("경과시간:" + (end - start) + " ms");
		System.out.println("종료");
		System.out.println("=============");
	}

}
