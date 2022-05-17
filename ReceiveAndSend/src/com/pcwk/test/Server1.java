package com.pcwk.test;
import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.net.UnknownHostException;
public class Server1 {

	public static void main(String[] args) {
		//ServerIP,Port
		String serverIp = "127.0.0.1";
		int serverPort = 1234;
		
		//sockket 생성
	 try {
		Socket socket = new Socket(serverIp,serverPort);
		
		//소켓의 input 스트림 생성
	   OutputStream in=socket.getOutputStream();
	   DataOutputStream dos = new DataOutputStream(in);
	   
	   //소켓의 입력을 출력한다.
	   System.out.println("서버로부터 받은 메세지: "+dos.writeUTF());
	   System.out.println("연결을 종료 합니다.");
	   
	   //스트림과 소켓을 닫는다.
	   dos.close();
	   socket.close();
	   System.out.println("연결이 종료 되었습니다.");
	  
		
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
