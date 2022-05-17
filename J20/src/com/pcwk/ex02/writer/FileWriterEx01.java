package com.pcwk.ex02.writer;

import java.io.FileWriter;
import java.io.IOException;

import com.pcwk.cmn.LoggerManager;

public class FileWriterEx01 implements LoggerManager {

	public static void main(String[] args) {

		// 특수문자
		// \n : 라인 스킵
		// /r ; zpflwl return
		// \t : tab 문자
		// ' ' : space 문자
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('B');
			char[] buf = { ' ', 'g', 'o', 'o', 'd', 'm', 'o', 'r', 'n', 'i', 'n', 'g' };
			fw.write(buf);

			String msg = "\n 좋은 아침!";
			fw.write(msg);
			fw.write("\n");
			fw.write(buf, 1, 10);

		} catch (IOException e) {
			LOG.debug("==============");
			LOG.debug(e.getMessage());
			LOG.debug("==============");

		}
		LOG.debug("프로그램 종료!");
	}

}
