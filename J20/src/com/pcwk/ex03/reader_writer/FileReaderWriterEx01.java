package com.pcwk.ex03.reader_writer;

import java.io.*;

import com.pcwk.cmn.LoggerManager;

public class FileReaderWriterEx01 implements LoggerManager {

	public static void main(String[] args) {
		// 특수문자
		// \n : 라인 스킵
		// \t : tab 문자
		// ' ' : space 문자

		String filePath = "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex03/reader_writer/FileReaderWriterEx01.java";

		try (FileReader fr = new FileReader(filePath); FileWriter fw = new FileWriter("convert.java");) {

			int data = 0;
			while ((data = fr.read()) != -1) {
				if ('\n' != data && ' ' != data && '\r' != data && '\t' != data) {
					fw.write(data);
				}
			}

		} catch (IOException e) {
			LOG.debug("==============");
			LOG.debug(e.getMessage());
			LOG.debug("==============");

		}
		LOG.debug("프로그램완료");

	}

}
