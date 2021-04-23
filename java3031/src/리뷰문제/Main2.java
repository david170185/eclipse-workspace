package 리뷰문제;

public class Main2 {

	public static void main(String[] args) {
		TV t = new TV();
		t.color = "Black";
		t.size = 60;
		t.weight = 20;

		t.요리하다();
		t.자다();
		t.보다();
		System.out.println(t);
		
		Oven o = new Oven();
		o.color = "Red";
		o.size = 30;
		o.temp = 160;

		o.요리하다();
		o.자다();
		o.달구다();
		System.out.println(o);

	}

}
