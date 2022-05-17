package com.pcwk.ex03.net;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 7777;
		try {
			System.out.println(getTime() + "서버가 준비되었습니다.");
			serverSocket = new ServerSocket(port);
			// 서버소켓은 클라이언트의 연결 요청이 올 때까지 실행을 멈추고 기다린다.
			Socket socket = serverSocket.accept();
			System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청이 들어왔습니다.");

			OutputStream out = socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(out);

			dos.writeUTF("[Notice] Test Message1 from Server!");
			System.out.println(getTime() + "데이터를 전송 했습니다.");
			dos.close();
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
