package com.pcwk.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.DataInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.net.UnknownHostException;


public class Client1 {

	public static void main(String[] args) {
		String num= "안녕하세";
		Scanner scanner = new Scanner(System.in); 
		num = scanner.next(num);
		ServerSocket serverSocket = null;
		int port = 1234;
		try {
			System.out.println(getTime() + "서버가 준비되었습니다.");
			serverSocket = new ServerSocket(port);
			// 서버소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 기다린다.
			Socket socket = serverSocket.accept();
			System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청이 들어왔습니다.");

	      InputStream out = socket.getInputStream();
			DataInputStream dis = new DataInputStream(out);

			dis.readUTF();
			System.out.println(getTime() + "데이터를 전송 했습니다.");
			dis.close();
			socket.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("[hh.mm.ss]");
		return sdf.format(new Date());

	}

}
