package ����;

import javax.swing.JOptionPane;

public class ���������� {

	public static void main(String[] args) {
		// 1. � �Է��� �޾Ƽ�, 1-2�� �Է¹���.
		// 2. ������ ó��
		// 3. ó�� ����� ���
		
		//�Է�
		String name = JOptionPane.showInputDialog(null, "�̸��� �Է��ϼ���. ");
		String gender = JOptionPane.showInputDialog(null, "������ �Է��ϼ���. ");
		
		//ó��
		String result = name + "�� ȯ���մϴ�. ";
		
		//���
		JOptionPane.showMessageDialog(null, result);
		

	}

}
