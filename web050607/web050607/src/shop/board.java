package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class board {
	public void create(String id, String title, String content, String writer) throws Exception { // 입력값 추가
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db 연결 성공. <br>");

		String sql = "insert into board values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, content);
		ps.setString(4, writer);
		System.out.println("3. sql문을 만들기 성공. <br>");
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}

	public void delete(String id) throws Exception { 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db 연결 성공. <br>");

		String sql = "delete from board where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. sql문을 만들기 성공. <br>");

		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}
	
	public void update(String id, String title, String writer) throws Exception { 
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		String url = "jdbc:mysql://localhost:3306/shop";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		System.out.println("2. db 연결 성공. <br>");

		String sql = "update board set title = ?, writer = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, title);
		ps.setString(2, writer);
		ps.setString(3, id);
		System.out.println("3. sql문을 만들기 성공. <br>");

		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}

}
