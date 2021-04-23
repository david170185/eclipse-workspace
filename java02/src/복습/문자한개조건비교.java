package 복습;

public class 문자한개조건비교 {

	public static void main(String[] args) {
		// 1. 설정한 암호는 p / 입력한 암호는 q, 암호가 맞는 경우 pass 출력 / 맞지 않는 경우 재입력 출력
		// 2. 어제와 오늘의 몸무게 변화는 2.2, 변화가 2보다 크다면 다이어트 성공!
		// 3. 입력한 암호도 맞았고, 몸무게 변화도 2보다 크면 오늘은 성공! 아니면 내일 다시 도전!
		
		// 1번문제
		// 한글자이면 char를 사용하는 것이 좋다.
		char pw1 = 'p';
		char pw2 = 'q';
		// 비교연산자는 기본형만 쓸 수 있음.
		if (pw1 == pw2) {//true
			System.out.println("PASS");						
		} else {//false
			System.out.println("재입력");
			
		// 2번문제
		double change = 2.2;
		if (change >= 2) {
			System.out.println("다이어트 성공");
		
		// 3번문제
		if (pw1 == pw2 && change >= 2) {
			System.out.println("오늘은 성공!");
		} else {
			System.out.println("내일 다시 도전!");

		} // else end
		}
	} // main end

}  //class
}
