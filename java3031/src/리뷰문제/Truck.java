package 리뷰문제;

public class Truck extends Car {
	int weight;
	
	public void 운반하다() {
		System.out.println("물건을 운반하다.");
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", name=" + name + ", color=" + color + "]";
	}
	

}
