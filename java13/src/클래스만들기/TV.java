package 클래스만들기;

public class TV {
	//클래스 이름을 대문자로 시작해야함.
	//낙타표기법을 지켜야함.
	//class는 성질과 동작 포함
	//성질(속성, property, attribute)
	//=>멤버변수로 표현(멤버:선택의 의미)
	//멤버변수는 선언만 해준다.!
	//멤버변수는 자동초기화됨.
	String color; //참조형은 무조건 null
	int size; //기본형은 0으로 초기화
	
	//동작(함수, 기능처리, 명령어)
	//=>메서드로 표현(함수=메서드 method :어떤 기능을 처리하기 위한 방법을 정의)
	public void on() {
		//함수 이름은 소문자로 시작
		System.out.println("TV를 켜다.");
	}

	public void off() {
		System.out.println("TV를 끄다.");
	}

	public void ch() {
		System.out.println("TV 채널을 바꾸다.");
	}
}
