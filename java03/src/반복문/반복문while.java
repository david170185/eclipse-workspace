package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���while {

	public static void main(String[] args) {
			
			int iu = 0; //�ʱⰪ(0)�� �־�� ��. ������ �ʱ�ȭ�� ���� �־�� �Ѵ�.
			int you = 0;
			int park = 0;
			
			while (true) {
			String data = JOptionPane.showInputDialog("0)������, 1)���缮, 2)�ڸ��, 3)����");
			if(data.equals("3")) {
				System.out.println("��ǥ �ý����� �����մϴ�.");
				System.out.println("������ : " + iu + "ǥ");
				System.out.println("���缺 : " + you + "ǥ");
				System.out.println("�ڸ�� : " + park + "ǥ");
				break;
			}
			
			switch (data) {
			case "0":
				System.out.println("������ ����");
				iu++; //����������, iu = iu + 1;
				break;			
			case "1":
				System.out.println("���缮 ����");
				you++;
				break;			
			case "2":
				System.out.println("�ڸ�� ����");
				park++;
				break;
			default:		
				System.out.println("�ش� �������� �����ϴ�.");
				break;
			
			
		}


		}
		

	}

}