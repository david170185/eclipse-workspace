package 형변환;

public class 기본형형변환3 {

	public static void main(String[] args) {
		double sum = 333; // 확실하게 정수로 사용하지 않을 경우
		// 8바이트 <--- 4바이트, 큰것으로 자동현변환
		// 333.0 <--- 333
		int count = 5;
		double avg = sum / count;
		System.out.println(avg);

	}

}
