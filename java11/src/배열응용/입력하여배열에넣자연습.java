package �迭����;

import javax.swing.JOptionPane;
import javax.xml.soap.SAAJResult;

public class �Է��Ͽ��迭�����ڿ��� {

	public static void main(String[] args) {
		String[] s = new String[3]; // {null, null, null}
		
		//�Է¹޾� ����
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("������� ��� �Է�");
			
		}
		//���� �� �ϳ��� ������ ���
		for (String x : s) {
			System.out.println(x + " ");
			
		}
		//�迭�ȿ� ���ֵ��� �ִ��� Ȯ���ϰ� ����
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("���ֵ�")); // == �⺻�� �������� ���, ���� ������ ��� �Ұ�
			//���������� ==�� ���� �ּҸ� ��!
			//�ּҰ� ����Ű�� ���� ���ϰ� ������ �� ��ǰ���� �����ϴ� ��ɾ ������ ����.
			//string �̶�� equals()�� ����Ѵ�.
			System.out.println("���ֵ��� ����");
			System.out.println("��ġ��" + i);
			
			}
		
		}
		

}
