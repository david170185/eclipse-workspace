package 그래픽;

public class count extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i < 0; i++) {
			System.out.println("count : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// 인터럽트(방해, 중단) : esc, ctrl+c, power-off
				
			}

		}
	}
}
