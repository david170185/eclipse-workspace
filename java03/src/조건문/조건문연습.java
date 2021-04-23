package 조건문;

import javax.swing.JOptionPane;

public class 조건문연습 {

	public static void main(String[] args) {
		// String food = "분식";
		// 분식일 경우 "길건너로"
		// 양식인 경우 "왼쪽으로"
		// 한식인 경우 "오른쪽으로"
		// 아니면 "집에서"
		
		String food = "분식";
		switch (food) {
		case "분식":
			System.out.println("길건너로");
			break;			
		case "양식":
			System.out.println("왼쪽으로");
			break;			
		case "한식":
			System.out.println("오른쪽으로");
			break;
		default:			
			System.out.println("집에서");
			break;
		}

	}

}
