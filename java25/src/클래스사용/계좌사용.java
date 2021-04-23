package 클래스사용;

import 클래스만들기.계좌;

public class 계좌사용 {
	//계좌를 3개 만들어서 전체 계좌의 멤버변수값들 출력하고
	//두개의 예금하다 와 출금하다를 각각 사용해보세요
	public static void main(String[] args) {
		계좌 a1 = new 계좌();
		a1.name = "박길동";
		a1.field = "적금";
		a1.money = 1000;
		System.out.println(a1);
		a1.입금하다("김길동", 2000);
		a1.입금하다("김길동", "적금", 3000);
		a1.출금하다(2000);
	}

}
