package 클래스연습;

public class 계산기2 {
	//메서드(기능) 중심!
	public void add(int x, int y) {
		//메서드의 입력값이 있는 경우,
		//입력되는 값의 타입과 수에 따라 변수를 만들어주어야
		//전달되는 값을 받아서 저장해두었다가
		//꺼내서 계산할 수 있다.
		System.out.println("두수의 합은 : " + (x + y));
		System.out.println("계산기로 더하다.");
	}
	public void minus(int x, int y) {
		//x, y를 중간에 값을 전달받은 변수라고 해서
		//매게체 역할을 해주는 변수 : 매개변수, parameter(파라메터)
		//전달받은 값이 2개이면, 매개변수를 2개 만들어 주어야함.
		//전달받은 값이 순서대로 매개변수에 저장됨.
		//이렇게 저장된 값을 가지고 메서드 내에서 처리하게 됨.
		System.out.println("두수의 빼기는 :" + (x - y));
		System.out.println("계산기로 빼다.");
	}
	public void mul(int x, int y) {
		System.out.println("두수의 곱은 : " + (x * y));
		System.out.println("계산기로 곱하다.");
	}
	public void div(int x, int y) {
		System.out.println("두수의 나눗셈은 : " + (x / y));
		System.out.println("계산기로 나누다.");
	}

}
