package 리뷰문제;

public class Main4 {

	public static void main(String[] args) {
		증가스레드 t1 = new 증가스레드();
		감소스레드 t2 = new 감소스레드();

		t1.start();
		t2.start();

	}

}
