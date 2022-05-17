package com.pcwk.ex04.inputstreamreader;

import java.io.*;

import com.pcwk.cmn.LoggerManager;

public class InputStreamReaderEx01 implements LoggerManager {

	public static void main(String[] args) {
		String filePath = "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex01/reader/reader";

		try (FileInputStream fis = new FileInputStream(filePath); InputStreamReader isr = new InputStreamReader(fis);

		) {

			int i = 0;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			LOG.debug("===============");
			LOG.debug(e.getMessage());
			LOG.debug("================");

		}

		LOG.debug("프로그램 종료");
	}
}
