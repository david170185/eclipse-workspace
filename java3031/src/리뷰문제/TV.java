package 리뷰문제;

public class TV extends House {
	int weight;

	public void 보다() {
		System.out.println("보다.");
	}

	@Override
	public String toString() {
		return "TV [weight=" + weight + ", size=" + size + ", color=" + color + "]";
	}

}
