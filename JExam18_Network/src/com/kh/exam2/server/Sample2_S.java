package com.kh.exam2.server;

import java.io.*;
import java.net.*;

public class Sample2_S {

	public static void main(String[] args) {
		try {
			String recv = "";
			char[] buffer = new char[512];
			
			// 서버 소켓 생성 -> 포트 바인딩 -> TCP LISTEN 상태
			// 네트워크 통신
			//		IP 주소, Port 번호(0 ~ 65535)
			ServerSocket sSocket = new ServerSocket(51000);
			
			// 클라이언트의 접속 요청이 올 때 까지 대기
			// 접속 요청이 오면 승인하고 새로운 소켓을 생성
			Socket sock = sSocket.accept();
			
			
			// 통신용 입출력 스트림 생성
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				while(sockIn.ready()) {
					int len = sockIn.read(buffer);
					recv = new String(buffer, 0, len);
					System.out.println("[" + sock.getInetAddress() + ":" + sock.getPort() + "]"
							+ recv);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
