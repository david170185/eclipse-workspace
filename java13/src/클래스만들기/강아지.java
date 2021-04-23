package 클래스만들기;

public class 강아지 { 
	//멤버변수 => 성질
	//멤버변수는 객체 생성할 때 마다 복사가 된다.
	//public 미사용시 다른 패키지에서 사용 불가
	public String color;
	public String type;
	
	//멤버메서드 => 동작
	//복사 불가
	public void bark() {
		System.out.println("멍멍 짖다!");		
	}
	public void walk() {
		System.out.println("산책 가다!");
	}
	
	
}
