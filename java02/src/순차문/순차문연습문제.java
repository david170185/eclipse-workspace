package 순차문;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class 순차문연습문제 {

	public static void main(String[] args) {
		// ppt 65p
		// 1. int money = 5000;
		// 구매항목 : 과자/라면/커피, 당신은 vip 입니까? yes/no
		// 과자라면 어린아이이군요! 라면이면 성인이군요! 그것도 아니면 뭔가를 샀군요
		// vip이면, 구매금액에서 1000원을 할인하여 결제, 아니면 구매금액 모두 결제

		// 2. 88점인데, 90점 이상 A, 80점 이상 B, 70점 이상 C, 아니면 D

		// 1번문제
		int money = 5000;
		String item = JOptionPane.showInputDialog("구매항목을 입력하세요. ");
		String vip = JOptionPane.showInputDialog("yes/no");

		String comment = "";
		String comment1 = "";

		if (item.equals("과자")) {
			comment = "어린아이군요! ";

		} else if (item.equals("라면")) {
			comment = "성인이군요! ";

		} else {
			comment = "뭔가를 샀군요!";

		}

		if (vip.equals("yes")) {
			money = money - 1000;
			comment1 = "1000원 할인하여 결제 되었습니다.";

		} else {
			comment1 = "결제 해드리겠습니다. ";

		}
		JOptionPane.showConfirmDialog(null, "결제금액은" + money + "won" + comment + comment1);

		// 2번문제
		int score = 88;
		String grade = "";

		if (score >= 90) {
			JOptionPane.showMessageDialog(null, "A등급");
		} else if (score >= 80) {
			JOptionPane.showMessageDialog(null, "B등급");
		} else if (score >= 70) {
			JOptionPane.showMessageDialog(null, "c등급");
		} else {
			JOptionPane.showMessageDialog(null, "D등급");
		}

	}

}
