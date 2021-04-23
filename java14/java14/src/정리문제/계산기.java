package 정리문제;

import java.util.Date;

public class 계산기 {
	
	public int getHour() { // int로 변경(return)
		Date date = new Date();
		int result = date.getHours();//12
		return result;
	}
	//add(x 200,y 100)
	public int add(int x, int y) {
		//메서드에서 선언된 변수는 메서드 안에서만 사용 가능(i.e result)
		//메서드 번위 지역안에서만 사용 가능
		//지역변수(로컬변수) <--> 전역변수(글로벌변수)
		//자동초기화x		자동초기화o
		int result = x + y;
		System.out.println(result);
		return result;
	}
	public int minus(int x, int y) {
		int result = x - y;
		System.out.println(result);
		return result;
		
	}
	public int mul(int x, int y) { //반환 시 void = in로 변경
		int result = x * y;
		System.out.println(result);
		return result; //반환시 return result로 변경,  return은 맨 끝줄에!
		
	}
	public int div(int x, int y) {
		int result = x / y;
		System.out.println(result);
		return result;
		
	}

}
