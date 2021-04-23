package 네트워크;

import java.io.PrintWriter;
//import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP날짜시간서버 {

	public static void main(String[] args) throws Exception {
		int count = 0;
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는중...");
		while (true) {
			Socket socket = server.accept();
			count++;
			System.out.println("서버가" + count + "개의 클라이언트 요청을 승인함");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			//밖으로 내보내는 스트림을 통해 내보내기
			Date date = new Date();; //Date 변수 생성
			out.print(date); //date 변수 프린트
			out.close();
			socket.close();
		}

	}

}
