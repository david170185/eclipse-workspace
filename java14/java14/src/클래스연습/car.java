package 클래스연습;

public class car { //main도 하나의 메서드로 또다른 메서드를 정의(기능 정의)할 수 없음.main x
//성질 : 색(멤버변수)
	String color;
	
//동작 : 달리다, 속도를 높이다.(멤버메서드)
	public void run() {
		System.out.println("자동차가 달리다.");
	}
	public void up() {
		System.out.println("자동차의 속도를 높이다.");
	}
}
