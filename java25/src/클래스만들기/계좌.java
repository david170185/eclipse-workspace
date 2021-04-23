package 클래스만들기;

public class 계좌 {
		//계좌.java
		//멤버변수 : 이름,통장종류, 금액
		//멤버메서드 : 예금하다, 출금하다.
		//예금하다(이름, 통장종류, 금액)
		//예금하다(이름, 금액)
		//출금하다(금액)
	public String name;
	public String field;
	public int money;
	
	public void 입금하다(String name, String field, int money) {
		System.out.println(name + " " + money );
	}
	public void 입금하다(String name, int money) {
		System.out.println(name + " " + money);
	}
	public void 출금하다(int money) {
		System.out.println(money);
	}
	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + "]";
	}
	

}
