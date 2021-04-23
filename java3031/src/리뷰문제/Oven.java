package 리뷰문제;

public class Oven extends House {
	int temp;

	public void 달구다() {
		System.out.println("달구다.");
	}

	@Override
	public String toString() {
		return "Oven [temp=" + temp + ", size=" + size + ", color=" + color + "]";
	}

}
