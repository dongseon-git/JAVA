package com.pcwk.ex02.datainputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("sample.dat");
				DataOutputStream dos = new DataOutputStream(fos);) {

			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("DataOutPutStream");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (FileInputStream fis = new FileInputStream("sample.dat"); DataInputStream dis = new DataInputStream(fis);) {
			System.out.println(dis.readChar());
			System.out.println(dis.read());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("종료");

	}

}
