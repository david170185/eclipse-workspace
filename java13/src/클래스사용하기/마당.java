package 클래스사용하기;

import 클래스만들기.강아지;

public class 마당 {

	public static void main(String[] args) {
		강아지 dog1 = new 강아지(); // 변수 3개가 생성(dog1, 멤버변수 color, type), dog1안에 color, type을 가르키고 있는 주소가 저장됨.
		강아지 dog2 = new 강아지(); // 변수 3개 추가 생성, new 할때마다 3개씩 만들어진다.
		//dog1.color dog2에는 주소가 들어가 있음(참조형)
		
		dog1.color = "갈색"; // public으로 선언하지 않으면 다른 패키지에서는 invisible
		dog1.type = "진돗개";
		dog1.bark();

		dog2.color = "흰색";
		dog2.type = "비숑";
		dog2.walk();

	}

}
