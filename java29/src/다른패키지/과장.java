package 다른패키지;

import 상속.Employee;

public class 과장 extends Employee {
	public void print() {
		System.out.println(name + " " + salary);
		//접근 제어자
		//public : 아무곳에서나 접근 가능
		//protected : 같은 패키지 + 상속 받을때만 다른 패키지에서 접근 가능
		//default(x) : 같은 패키지에서만 접근 가능
		//private : 해당 클래스 안에서만 접근 가능
		//public으로 설정해놓아야 다른 패키지에서도 접근 가능
	}
}
