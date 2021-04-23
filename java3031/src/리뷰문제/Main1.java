package 리뷰문제;

public class Main1 {

	public static void main(String[] args) {
		Truck t = new Truck();
		t.color = "Orange";
		t.name = "Poter";
		t.weight = 1000;

		t.타다();
		t.싣다();
		t.운반하다();
		System.out.println(t);
		
		Sedan s = new Sedan();
		s.color = "Red";
		s.name = "Aston Martin";
		s.speed = 300;

		s.타다();
		s.싣다();
		s.달리다();
		System.out.println(s);

	}

}
