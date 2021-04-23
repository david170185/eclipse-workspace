package 제어문;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 순차문 정리문제
        // 입력>> 당신의 취미는 골프, 당신의 여행지는 제주도
		// 처리>> 당신은 제주도로 골프를 즐기러 간다.
		// 출력>> 처리한 내용 출력
		
	      // 입력
	      String name = JOptionPane.showInputDialog("이름을 입력하세요");
	      
	      // 처리
	      String result = name + "님 환영합니다.";
	      
	      // 출력
	      JOptionPane.showMessageDialog(null, "나는 실행 결과 출력하는 곳 " + result);

	   }

	}