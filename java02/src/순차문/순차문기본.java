package ������;

import javax.swing.JOptionPane;

public class �������⺻ {

	public static void main(String[] args) {
		// �Է� -> ó�� -> ���
		//���� �տ��� ������ Ÿ��(string, int ��) ���� �ʿ�
		String food = JOptionPane.showInputDialog("�԰���� ���� �޴���? ");//"�Է°�"
		
		//ó�����ִ� �κ�
		//if ~ elase if ~ else���� true�� ��� �����ϰ� �ű⼭ break!
		String result = "";
		if (food.equals("«��")) {
			result = "�߱�������";
		}else if (food.equals("�쵿")) {
			result = "�Ͻ�������";			
		}else if (food.equals("���")) {
			result = "�н�������";
		}else {
			result = "������";			
		} 		
		//������ִ� �κ�
		JOptionPane.showMessageDialog(null, result);
		{
			
		}

	}		
		
}
