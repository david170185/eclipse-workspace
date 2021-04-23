package 리뷰문제;

public class Sedan extends Car {
	int speed;
	
	public void 달리다() {
		System.out.println("달리다.");
	}

	@Override
	public String toString() {
		return "Sedan [speed=" + speed + ", name=" + name + ", color=" + color + "]";
	}
	

}
