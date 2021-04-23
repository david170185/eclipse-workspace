package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		동시프로그램3 t3 = new 동시프로그램3();
		동시프로그램4 t4 = new 동시프로그램4();
		동시프로그램5 t5 = new 동시프로그램5();		
		//cpu한테 스레드 2개 만든것 스레드 등록
		t3.start();
		t4.start();
		t5.start();		
	}

}
