package 리뷰문제;

public class 감소스레드 extends Thread {

	int count = 999;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count--;
			System.out.println("감소 " + count);
			
		}
	}
	
	
}
