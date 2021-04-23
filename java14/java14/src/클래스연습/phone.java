package 클래스연습;

public class phone {
	//phone class 생성 후 멤버변수2, 멤버메서드2
	//전화기를 만들어 사용
	String color;
	int size;
	
	public void call(String x, int y, String z) {
		System.out.println(x + "와 " + z + y + "시간 " + " 전화하다.");
	}
	public void text(String x, String y, int z) {
		//x, y, z가 파라메터, 매개변수
		//매게변수는 개수, 타입, 순서가 모두 일치해야 인식!
		System.out.println(x +"에게" + y + "이라고" + z + "시에 전화기로 문자하다.");
	}

}
