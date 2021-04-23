package pack04;

public class Computer extends Object {
	// 멤버변수
	int price;
	String color;
	String company;

	// 멤버메서드
	public void on() {
		System.out.println("켜다.");
	}

	public void off() {
		System.out.println("끄다.");
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + ", color=" + color + ", company=" + company + "]";
	}



}
