package test02;

import java.util.Random;
//import 자동완성 : 컨트롤 + 쉬프트 + o(영문)
public class test02 {

	public static void main(String[] args) {
		// 배열을 사용하는 경우
		// 1.배열을 만드는순간 데이터를 모르는 경우
		// 공간을 만들어 두었다가 나중에 넣는다
	    int[] num = new int[10];
	    Random r = new Random(10); //씨드 값 설정
	    for (int i = 0; i < num.length; i++) {
	       num[i] = r.nextInt(50); //0~49
	    }
	    int sum = 0; // 변수 생성 시 초기값 설정

	    for (int x : num) {
	       sum = x + sum;
	    }
	    System.out.println("랜덤값 10개의 총합은" + sum);
	    System.out.println("랜덤값 10개의 평균은" + sum/(double)10);
	      


	}

}
