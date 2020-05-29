package com.ict.edu01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    * 내 서버 주소: 203.236.220.86

	자바통신은 socket 통신
	socket: 읽기 및 쓰기를 위한 interface제공
	port: 내부와 외부를 연결하는 게이트 역할을 한다.
	      0 ~ 65535, 0 - 1024는 사용자가 지정하지 않는다.
	      
	서버: ServerSocket,    클라이언트: Socket
 
  	client는 소켓만 사용.
  	주의.
  	서버가 안 꺼지게하려면 무한 루프를 돌려야한다.
 	Thread: 1 대 多를 담당하기 위해서.
 	
 	com.ict.edu02: Ex03_단톡예시 
 	
 	
 */

public class Ex01 {
	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(7777);
			System.out.println("서버 대기중...");
			
			//client가 접속할 때까지 기다린다.
			//접속을 하면 담당소켓을 하나 만든다.
			
			Socket s = ss.accept();
			//담당 소켓은 접속한 클라이언트의 정보를 가지고 있다.
			
			//클라이언트에 대한 정보 출력.
			String ip = s.getInetAddress().getHostAddress();
			String name = s.getInetAddress().getHostName();
			
			System.out.println("ip : " + ip);
			System.out.println("name : " + name);
			
			System.out.println("Server 수고하셨습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
}
