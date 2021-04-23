	package 반복문;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 반복문while연습 {

	public static void main(String[] args) {
		// 무한반복, 점수를 입력하세요(종료 0) : 88, 최종결과 시스템을 종료합니다.
		// 60점 미만:3명, 60점 이상:3명, 70점 이상:2명, 80점 이상:1명, 90점 이상:3명
		// 총 12명의 평균은 76점 => sum = sum + num
		
		int count90 = 0;
		int count80 = 0;
		int count70 = 0;
		int count60 = 0;
		int count60down = 0;
		int count = 0; //횟수
		int sum = 0; //입력 점수 누적
				
		while (true) {
			//입력을 받아서, 0이면 무한루프를 끝낸다.
			String data = JOptionPane.showInputDialog("점수 입력 : 종료 0");
			if(data.equals("0")) {
				System.out.println("시스템 종료!!");
				break; // while문의 break;
			}
			
			int data2 = Integer.parseInt(data);
			sum = sum + data2; //점수 누적 계산
			if (data2 >= 90) {
				count90++;
			}else if (data2 >= 80) {
				count80++;
			}else if (data2 <= 70) {
				count70++;
			}else if (data2 <= 60) {
				count60++;					
			}else {
				count60down++;
			}//else
		}//while
		
		//while문 끝내고, 프린트를 해봅시다.!
		System.out.println("60점미만: " + count60down);
		System.out.println("60점이상: " + count60);
		System.out.println("70점이상: " + count70);
		System.out.println("80점이상: " + count80);
		System.out.println("90점이상: " + count90);
		count = count90 + count80 + count70 + count60 + count60down;
		System.out.println("전체 횟수는" + count + "회");
		System.out.println("평균은" + sum/(double)count + "점");	
		
	}//main	

	
}//class