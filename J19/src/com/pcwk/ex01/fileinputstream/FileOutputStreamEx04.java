package com.pcwk.ex01.fileinputstream;

import java.io.*;

public class FileOutputStreamEx04 {
	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("outout02.txt", true);) {

			fos.write(97); // a
			fos.write(98); // b
			fos.write(99); // c

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("종료");
	}
}