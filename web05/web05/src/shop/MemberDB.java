package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//자바에서는 자동 import 컨트롤 + 쉬프트 + o(영문)
public class MemberDB {
	// CRUD 기능
	public void create(String id, String pw, String name, String tel) throws Exception { // 입력값 추가
		// 1. 커넥터 연결(커넥터 사용하겠다고 설정해야함.)
		Class.forName("com.mysql.jdbc.Driver"); // D 대문자 class
		// PringWriter out = new Print Writer();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결(db연결해보자!) - 필요한 데이터 세가지(shop, root, 1234 / db, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop";
		// url 직접써도 되지만 길어서 별도로 작성 / jdbc java db connection
		// jsp에서의 자동 import: click 후 cont + shift + m
		// 포트 확인 : mysql => status, localhost => ip
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.) => 해당 부품을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com"; 스트링으로 인식
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "insert into member values (?, ?, ?, ?)"; // ""중복 불가 , 입력값을 가지고 올때 ? 적용
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // ps로 맵핑(입력값 가지고올떄)
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}

	// create 복사 후 3번항만 변경하면 적용 가능
	public void delete(String id) throws Exception { // 필요한 값은 id 하나 / String 매개변수
		// 1. 커넥터 연결(커넥터 사용하겠다고 설정해야함.)
		Class.forName("com.mysql.jdbc.Driver"); // D 대문자 class
		// PringWriter out = new Print Writer();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결(db연결해보자!) - 필요한 데이터 세가지(shop, root, 1234 / db, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop";
		// url 직접써도 되지만 길어서 별도로 작성 / jdbc java db connection
		// jsp에서의 자동 import: click 후 cont + shift + m
		// 포트 확인 : mysql => status, localhost => ip
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.) => 해당 부품을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com"; 스트링으로 인식
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "delete from member where id = ?"; // ""중복 불가 , 입력값을 가지고 올때 ? 적용
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // ps로 맵핑(입력값 가지고올떄)
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}
	
	public void update(String id, String pw, String tel) throws Exception { // 입력값 추가
		// 1. 커넥터 연결(커넥터 사용하겠다고 설정해야함.)
		Class.forName("com.mysql.jdbc.Driver"); // D 대문자 class
		// PringWriter out = new Print Writer();
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결(db연결해보자!) - 필요한 데이터 세가지(shop, root, 1234 / db, id, pw)
		String url = "jdbc:mysql://localhost:3306/shop";
		// url 직접써도 되지만 길어서 별도로 작성 / jdbc java db connection
		// jsp에서의 자동 import: click 후 cont + shift + m
		// 포트 확인 : mysql => status, localhost => ip
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.) => 해당 부품을 써서 SQL으로 인식하게 해야함.
		// String url = "http://www.naver.com"; 스트링으로 인식
		// URL url = new URL("http://www.naver.com");
		// String file = "test.hwp";
		String sql = "update member set pw = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw); // ps로 맵핑(입력값 가지고올떄)
		ps.setString(2, tel); // 순서대로 기입
		ps.setString(3, id);
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}

}
