package com.pcwk.ex02.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystemNotFoundException;

public class PersonMain {

	public static void main(String[] args) {
		Person person01 = new Person("홍길동","의적");
		Person person02 = new Person("이상무","개발자");
		//객체 직열화
		try(FileOutputStream fis = new FileOutputStream("serial.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				
				
				) {
			
		oos.writeObject(person01);
		oos.writeObject(person02);
			
		}catch(FileSystemNotFoundException e) {
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
System.out.println("파일생성 완료!");
	}

}
