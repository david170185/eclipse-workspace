package ������;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class �������������� {

	public static void main(String[] args) {
		// ppt 65p
		// 1. int money = 5000;
		// �����׸� : ����/���/Ŀ��, ����� vip �Դϱ�? yes/no
		// ���ڶ�� ������̱���! ����̸� �����̱���! �װ͵� �ƴϸ� ������ �򱺿�
		// vip�̸�, ���űݾ׿��� 1000���� �����Ͽ� ����, �ƴϸ� ���űݾ� ��� ����

		// 2. 88���ε�, 90�� �̻� A, 80�� �̻� B, 70�� �̻� C, �ƴϸ� D

		// 1������
		int money = 5000;
		String item = JOptionPane.showInputDialog("�����׸��� �Է��ϼ���. ");
		String vip = JOptionPane.showInputDialog("yes/no");

		String comment = "";
		String comment1 = "";

		if (item.equals("����")) {
			comment = "����̱���! ";

		} else if (item.equals("���")) {
			comment = "�����̱���! ";

		} else {
			comment = "������ �򱺿�!";

		}

		if (vip.equals("yes")) {
			money = money - 1000;
			comment1 = "1000�� �����Ͽ� ���� �Ǿ����ϴ�.";

		} else {
			comment1 = "���� �ص帮�ڽ��ϴ�. ";

		}
		JOptionPane.showConfirmDialog(null, "�����ݾ���" + money + "won" + comment + comment1);

		// 2������
		int score = 88;
		String grade = "";

		if (score >= 90) {
			JOptionPane.showMessageDialog(null, "A���");
		} else if (score >= 80) {
			JOptionPane.showMessageDialog(null, "B���");
		} else if (score >= 70) {
			JOptionPane.showMessageDialog(null, "c���");
		} else {
			JOptionPane.showMessageDialog(null, "D���");
		}

	}

}
