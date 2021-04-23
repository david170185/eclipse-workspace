package 배열;

public class 배열만들기3 {

	public static void main(String[] args) {
		//1. 정수 5개 크기의 배열을 만들어서 10,20,30,40,50을 순서대로 넣는다. 첫번째값과 세번째 값을 더해서 프린트
		//2. 스트링 3개 크기의 배열을 만들어서 자바, 스프링, JSP를 순서대로 넣는다.=>"자바 보다는 스프링"로 출력
		// int[] num = new int[3]; => int만 넣겠다는 얘기, 같은 타입만 넣을 수 있다. => 고정된 크기를 가진다(크기가 변경 불가능)
		
		//1번문제
		int[] num = new int[5];
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;		
//		num[4] = 50;
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
		
			System.out.println(num[0] + num[2]);
		
		//2번문제
		String[] x = new String[3];
		x[0] = "자바";
		x[1] = "스프링";
		x[2] = "JSP";
			System.out.println(x[0] + "보다는" + x[1]);
			
		}
		
}
