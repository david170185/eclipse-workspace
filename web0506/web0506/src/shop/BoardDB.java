package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDB {

	public BoardVO read(String id) throws Exception { 
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("1. 커넥터 사용 설정 성공. <br>");

	String url = "jdbc:mysql://localhost:3306/shop";
	Connection con = DriverManager.getConnection(url, "root", "1234");
	System.out.println("2. db 연결 성공. <br>");

	String sql = "select*from board where id = ?"; 
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id); 
	System.out.println("3. sql문을 만들기 성공. <br>");

	ResultSet rs = ps.executeQuery();
	System.out.println("4. sql문을 mysql서버로 전송 성공. <br>");

	BoardVO bag = new BoardVO();
	if (rs.next()) {
		String id3 = rs.getString("id");
		String title = rs.getString(2);
		String content = rs.getString(3);
		String writer = rs.getString(4);
		bag.setId(id3);
		bag.setTitle(title);
		bag.setContent(content);
		bag.setWriter(writer);
		
	}
	return bag;
	}
}
