package ���;

import javax.swing.JOptionPane;

public class ������ {

	public static void main(String[] args) {
		// ������ ��������
        // �Է�>> ����� ��̴� ����, ����� �������� ���ֵ�
		// ó��>> ����� ���ֵ��� ������ ��ⷯ ����.
		// ���>> ó���� ���� ���
		
	      // �Է�
	      String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
	      
	      // ó��
	      String result = name + "�� ȯ���մϴ�.";
	      
	      // ���
	      JOptionPane.showMessageDialog(null, "���� ���� ��� ����ϴ� �� " + result);

	   }

	}