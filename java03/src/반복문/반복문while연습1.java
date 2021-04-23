package 반복문;

import javax.swing.JOptionPane;

public class 반복문while연습1 {

	public static void main(String[] args) {
		// 맞추어야 하는 정답 55, 정답 입력란 44
		// String data = t1.getText();, int data2 = Integer.parselnt(data);
		// 정답이 아닙니다. X그림, 정답입니다. O그림
		// 정답보다 작은값입니다. 정답보다 큰값입니다.
		// 몇번만에 맞추었는지 체크
		
          int target = 55;
	      int count = 0;
	      
	      while (true) {
	         String data = JOptionPane.showInputDialog("숫자입력");
	         int data2 = Integer.parseInt(data);
	         count++;
	         if (data2 == target) {
	            System.out.println("축하드립니다.");
	            System.out.println("정답입니다.");
	            System.out.println("총 시도횟수는 " + count + "회");
	            break;
	         }else {
	            System.out.println("정답이 아닙니다.");
	            if (data2 > target) {
	               System.out.println("정답보다 크다.");
	            } else {
	               System.out.println("정답보다 작다.");
	            }
	         }
	      }

	   }

	}