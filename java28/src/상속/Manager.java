package 상속;

public class Manager extends Employee {
	//private는 접근제어자 : 해당 클래스 안에서만 사용 가능
	int bonus = 100; // final, private 마지막/내부만 사용

	public void test() {
		System.out.println(bonus + "만원 받으며 관리감독 하다.");
	}

}
