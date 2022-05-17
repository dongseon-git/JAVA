package com.pcwk.ex06.file;

import java.io.File;
import java.io.IOException;

public class FileDirectoryEx01 {

	public static void main(String[] args) throws IOException {
		String filePath = "/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex06/file/FileDirectoryEx01.java.bak";

		// 파일 객체 생성
		//File file = new File(filePath);
//File file = new File("/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex06/file/FileDirectoryEx01.java.bak");
		File dir = new File("/Users/gimdongseon/Documents/DCOM_20220127/01_JAVA/workspace/J20/src/com/pcwk/ex06/file");
		File file = new File(dir,"FileDirectoryEx01.bak");
		
		// 신규파일 생성
		file.createNewFile();
		// file 객체는 파일과 디렉토리를 처리
		System.out.println("파일여부:" + file.isFile());// 파일여부:true
		System.out.println("디렉토리 여부:" + file.isDirectory());// 디렉토리 여부 : false

		System.out.println("경로를 제외한 파일명:" + file.getName());
		System.out.println("파일이 속해 있는 디렉토리:" + file.getParent());
		System.out.println("파일에 절대 경로:" + file.getAbsolutePath());
		// OS 별 pathSeparator
		System.out.println("path Separator:" + file.pathSeparator);
		System.out.println("path separator:" + file.separator);
		System.out.println("파일 read:" + file.canRead());
		System.out.println("파일 write:" + file.canWrite());
		System.out.println("파일 실행 여부:" + file.canExecute());

	}

}
