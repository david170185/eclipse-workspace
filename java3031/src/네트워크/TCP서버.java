package 네트워크;

import java.io.PrintWriter;
//import java.lang.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCP서버 {

	public static void main(String[] args) throws Exception {
		int count = 0;
		//클라이언트의 요청을 승인해주기 위한 소켓
		ServerSocket server = new ServerSocket(9000);
		System.out.println("서버 소켓 시작됨.");
		System.out.println("클라이언트의 요청을 기다리는중...");
		while (true) {
			Socket socket = server.accept();
			count++; //count = count + 1; => 증감연산자
			System.out.println("서버가" + count + "개의 클라이언트 요청을 승임함");
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			//밖으로 내보내는 스트림을 통해 내보내기
			String data = "i am a java programmer!!";
			out.print(data);
			out.close();
			socket.close();
		}
		
		//1. 소켓이란?
		// TCP를 사용하여 응용 프로그램끼리 통신을 하기 위한 연결 끝점(end point)
		//2. 소켓프로그래밍이란?
		// 서버에서 소켓 생성 - 클라이언트에서 소켓 생성 후 연결 요청 - 서버에서 조건이 맞으면 연결 승인 - 
		// 클라이언트의 메세지 전송 - 서버에서 메세지 수신 후 클라이언트로 전송
		//3. TCP/IP 4단계는 무언인가 4가지를 쓰시오
		// 응용 계층, 전송 계층, 네트워크 계층, 네트워크 접속 계층
		//4. TCP/IP 4단계를 각각 설명하시오.
		// 1) 네트워크 접속 계층 : 하드웨어 적인 요소와 관련된 모든 것을 지원하는 계층 (이더넷)
		// 2) 네트워크 계층 : 통신 노드 간의 IP패킷 전송 및 라우팅 기능 담당 (IP, ICMP 등)
		// 3) 전송 계층 : 호스트간의 연결 제어 및 데이터의 송수신 담당 (TCP, UDP)
		// 4) 응용 계층 : 파일전송, 메일서비스 등을 할 수 있도록 표준 인터페이스 제공 (HTTP, DNS, FTP, SMTP)
		//5. 나는 프로그래머입니다. 나는 TCP/IP의 4단계 중 어느 계층에 속합니까?
		// 응용계층
		//6. TCP/IP 중 전송계층의 2가지는?
		// TCP, UDP
		//7. TCP/IP 중 전송계층의 2가지를 비교 설명?
		// TCP는 정확한 전송이 필요한 경우, UDP는 정확한 전송보다 빠른 속도의 전송이 필요한 경우 사용함
		//8. TCP/IP 중 전송계층의 2가지 중 하나는 연결형 또 하나는 비연결형이다. 왜그런가?
		// 비연결형으로 연결하지 않고 빠르게 메세지를 전송하는 UDP프로토콜과
	    // 가상의 연결을 지원하고 에러처리를 실행하여 신뢰성 있게 전송하는 TCP프로토콜로 목적에 따라 나뉜다.
		//9. 네트워크 연결시 필요한 2가지는?
		// 클라이언트와 서버
		//10. TCP 전송계층 프로그램 절차는?
		// 서버생성-클라이언트 서버 접속 요청-서버가 클라이언트의 요청 수신-
		// 클라이언트의 서버 접속 - 클라이언트가 서버에 필요한 정보나 일련의 작업 요청-
		// 받은 정보나 작업을 구현하여 사용자에게 전달
		//11. 네트워크 프로그램시 반드시 해주어야 하는 처리는? 2가지 방식
		// 메인 함수를 예외처리하도록 예외사항으로 던져주거나 TRY - CATCH문 사용
		// 서버가 계속 작동하도록 WHILE문을 적용하여 무한루프 사용
		//12. dns란? ip는 무엇의 약자? dns와 ip와의 관계
		// DNS : Domain Name System, 기호를 사용하여 서버의 이름을 주소 형식으로 나타냄
		// IP : Interner Protocol, 인터넷을 사용하기 위한 일련의 통신 규약
		// 관계 : 클라이언트가 일련의 ip번호를 가지고 dns 주소에 접속(dns:잠금장치로 잠긴 공간, ip 번호키)
		//13. url은 무엇의 약자? 무엇인가?
		// Uniform Resource Locator, 인터넷상의 우베사이트, 파일, db에 접속하기 위한 일련의 주소를 지정하는 방법으로
		// 주소창에 url을 입력하면 해당 url에 대응되는 웹사이트, 파일, db에 접속 가능
		//14. html문서 전달용 프로토콜은? 기본 포트는? 파일 전송용 프로토콜은?		
		//    telnet과 ssh에 대해 간단히 설명하시오.
		// html문서 전달용 프로토콜(Hyper Text Transfer Protocol), 기본포트 : 80
		// 파일전송용 프로토콜 : ftp(File Transfer Protocol)
		// Telnet : 원격 접속 서비스, 원격 컴퓨터를 이용할 수 있는 계정 필요
		// SSH : Secure shell, 원격 접속한 후 일련의 행위에 대해 암호화하여 안전성을 보장해주는 프로토콜
		//15. TCP 방식에서 클라이언트측 프로그래밍에서 다음 코드가 의미하는 바는?
		//    Socket socket = new Socket("210.125.88.1",5555)
		// 서버에 연결된 통로인 소켓 생성, ip번호 210.125.88.1, 포트번호 5555

	}

}
