package com.kh.exam2.client;

import java.io.*;
import java.net.*;
import java.util.*;

public class Sample2_C {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			String recv = "", send = "";
			String serverIp = "127.0.0.1";
			// 서버 접속용 소켓 생성 -> 포트 바인딩 -> 접속 요청
			// 네트워크 통신
			//		IP 주소, Port 번호(0 ~ 65535)
			//		클라이언트는 서버와의 연결이 필요하기 때문에 서버의 정보가 사용된다.
			Socket sock = new Socket(serverIp, 51000);
			
			// 통신용 입출력 스트림 생성
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				System.out.print("Client > ");
				send = sc.nextLine();
				
				// 출력 스트림을 사용하여 서버에 메세지 전송
				sockOut.write(send);
				
				// 버퍼에 쌓여 있는 문자열을 즉시 전송하기 위해 사용.
				sockOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
