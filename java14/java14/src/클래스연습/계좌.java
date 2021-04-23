package 클래스연습;

public class 계좌 {
	//우리가족 계좌정보
	//이름 (홍길동,박길동), 계좌이름(튼튼적금), 금액(1000,2000)
	//입금하다, 출금하다. => 아버지는 입금하다, 딸은 출금하다.
	
	//계좌를 사용하기 위해서 필요한 속성값
	String name; //이름
	String aName; //계좌이름
	int amount; //금액
	//자바에서의 변수는 언제 만들어지나요?
	//타입 변수명'(선언)
	//선언할 떄 변수가 만들어진다.
	//선언의 변수가 사용할 수 있는 범위
	//클래스 아래에서 선언됨.
	//클래서 전체 영역에서 사용 가능
	//전역변수, 글로벌 변수
	//전역변수는 자동초기화됨.
	
	public void 입금하다(int x) {//5000
		System.out.println(amount + x + "원");
		System.out.println("은행에 입금하다.");
	}
	public void 출금하다(int x) {
		System.out.println(amount - x + "원");
		System.out.println("은행에서 출금하다.");		
		
	}
	
	

}
