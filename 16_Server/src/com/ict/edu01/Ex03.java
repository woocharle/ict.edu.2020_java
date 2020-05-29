package com.ict.edu01;

import java.net.ServerSocket;
import java.net.Socket;

public class Ex03 implements Runnable {
	ServerSocket ss = null;
	
	public Ex03() {
		try {
			ss = new ServerSocket(7777);
			System.out.println("서버 대기중....");
			
			new Thread(this).start();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println(Thread.currentThread().getName());
				Socket s = ss.accept();
				System.out.println("ip: " + s.getInetAddress().getHostAddress());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		new Ex03();
		System.out.println(Thread.currentThread().getName());
	}
	
}
