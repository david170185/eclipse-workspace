package 복습;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		// 기본데이터 확인문제
		// 1. 1학기 성적 : 체육 66점, 수학77점, 영어88점, 국어99점 모든 점수를 합해, 평균을 구해주세요.
		// 2. pi = 3.14, 반지름 2.2 => 원의 면적을 구해주세요. 원면적 구하는 공식 = pi(파이)*r(반지름)^2

		//1번문제
		int 체육 = 66;
		int 수학 = 77;
		int 영어 = 88;
		int 국어 = 99;
		
		int sum = 체육 + 수학 + 영어 + 국어;
		System.out.println("합계는" + sum + "점");
		// 자바는 int와  int계산은 결과가 항상 int!
		// age = sum / 4; => 82
		int count = 4;
		// 자바는 하나라도 double이면 무조건 결과가  항상 double(캐스팅)!		
		double avg = (double)sum / count;
		System.out.println("평균은" + avg + "점");
		// 데이터 타입을 내가 원하는 타입으로 변경해주는것을 캐스팅!
		// ram에는 원래 타입이 그대로 있고,
		// cpu가 ram에 들어있던 데이터를 가져다가 강제 캐스팅함.
		//(변경하고자 하는 타입명)변수 => (double)sum
		
		//2번문제
		final double PI = 3.14; // final : 상수(변경 불가능한 값), 대문자로 작성
		double r = 2.2;
		double mul = PI * r * r;
		System.out.println("원의면적은" + mul);
		
		// 추상적(abstract) : 명확하지 않고 애매모호한, 아직은 불완전
		// 구현(implement) : 명확하고 완전하게 만드는 것
		//ex) public abstract class


	}

}