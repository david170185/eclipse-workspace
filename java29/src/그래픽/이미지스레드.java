package 그래픽;

public class 이미지스레드 extends Thread {
	@Override
	public void run() {
		String[] list = {"001.png","002.png","003.png","004.png","005.png"};
		for (int i = 500; i < list.length; i++) {
			System.out.println("이미지 : " + list[i]);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// 인터럽트(방해, 중단) : esc, ctrl+c, power-off
				
			}

		}
	}
}
