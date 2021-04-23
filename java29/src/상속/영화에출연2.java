package 상속;

public class 영화에출연2 {

	public static void main(String[] args) {
		원더우먼 wWomon = new 원더우먼();
		wWomon.name = "원더우먼";//사람
		wWomon.age = 30000;//사람
		wWomon.speed = 1000;//우먼
		wWomon.jump = true;//원더우먼
		
		wWomon.자다();//사람
		wWomon.달리다();//우먼
		wWomon.높이뛰다();//원더우먼
		System.out.println(wWomon);
	}

}
