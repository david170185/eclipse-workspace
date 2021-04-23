package 클래스사용;

import java.sql.DriverManager;
import java.util.Date;

public class 반환을받아보기 {

	public static void main(String[] args) {
		반환값연습 re = new 반환값연습();
		re.add2();
		//void인 메서드를 호출하는 경우에는 변수에 그 결과값을 넣을 수 없음.
		//String rest = re.add2(); 적용불가
		//System.out.printlnre.add2()); 프린트도 불가
		//메서드를 호출하고 나서 반환값이 있을때만 변수에 그 결과값을 넣을 수 있고 출력도 가능
		
		//System.out.println(re.add(200, 100));
		int sum1 = re.add(200,100);
		System.out.println(sum1);
		
		double sum2 = re.add(33.3, sum1);
		System.out.println(sum2);
		
		String sum3 = re.add("다음시간은", "점심시간");
		System.out.println(sum3);
		
		String sum4 = re.add(100, "은 나의 백넘버");
		System.out.println(sum4);
		
		int[] sum5 = re.add();
		for (int x : sum5) {
			System.out.println(x);
			
		}
		Date d = re.getDate();
		System.out.println(d);
		
		//DriverManager.getConnection(url, user, password);
		
	}

}
