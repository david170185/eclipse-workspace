package pack03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookDAO {
	// CRUD 기능
	public void create(BookVO bag) throws Exception { // 입력값 추가
		// 1. 커넥터 연결
		Class.forName("com.mysql.jdbc.Driver"); 
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결
		String url = "jdbc:mysql://localhost:3306/mega";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기
		String sql = "insert into book values (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, bag.getId()); // ps로 맵핑(입력값 가지고올떄)
		ps.setString(2, bag.getTitle());
		ps.setString(3, bag.getStory());
		ps.setString(4, bag.getCompany());
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}
	// create 복사 후 3번항만 변경하면 적용 가능
	public void delete(String id) throws Exception {
		// 1. 커넥터 연결
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 사용 설정 성공. <br>");

		// 2. db 연결
		String url = "jdbc:mysql://localhost:3306/mega";
		Connection con = DriverManager.getConnection(url, "root", "1234");
		// con = 참조형 변수(주소를 가진 변수), 3단계에서 사용
		System.out.println("2. db 연결 성공. <br>");

		// 3. SQL문 만들기(SQL문을 만들다.)
		String sql = "delete from book where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); // ps로 맵핑(입력값 가지고올떄)
		System.out.println("3. sql문을 만들기 성공. <br>");

		// 4. 전송(SQL문을 mysql 서버로 전송함.)
		ps.execute();
		System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	}	
	
	
	

}
