package 리뷰문제;

public class 증가스레드 extends Thread {

	int count = 0;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			count++;
			System.out.println("증가 " + count);
			
		}
	}
	
	
}
