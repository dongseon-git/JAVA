package com.pcwk.ex06.file;

import java.io.File;

public class FileDirectoryEx02 {

	public static void main(String[] args) {

		if (args.length != 1) {// param이 없으면 종료
			System.out.println("파라메터를 입력하세요.");
			System.exit(0);

		}
		// "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex06/file99"
		System.out.println("param:" + args[0]);

		File dir = new File(args[0]);
		// 디렉토리가 아니면 종료 or 존재하지 않으면 종료
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);

		}
		File[] files = dir.listFiles();// 디렉토리 내부에 파일 정보 file[] return

		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}

}
