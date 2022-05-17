package com.pcwk.ex01.reader;

import java.io.*;

import com.pcwk.cmn.LoggerManager;

public class FileReaderEx01 implements LoggerManager {

	public static void main(String[] args) {
		// LOG.debug("log4j");
		String filePath = "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex01/reader/reader";
		//2byte단위로 읽어서 한글,한자등 꺠어지지 않음
		try (FileReader fr = new FileReader(filePath);) {

			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			LOG.debug("================");
			LOG.debug(e.getMessage());
			LOG.debug("===============");
		}
		System.out.println("프로그램 종료");
	}

}
