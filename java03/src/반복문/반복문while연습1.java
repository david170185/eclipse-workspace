package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���while����1 {

	public static void main(String[] args) {
		// ���߾�� �ϴ� ���� 55, ���� �Է¶� 44
		// String data = t1.getText();, int data2 = Integer.parselnt(data);
		// ������ �ƴմϴ�. X�׸�, �����Դϴ�. O�׸�
		// ���亸�� �������Դϴ�. ���亸�� ū���Դϴ�.
		// ������� ���߾����� üũ
		
          int target = 55;
	      int count = 0;
	      
	      while (true) {
	         String data = JOptionPane.showInputDialog("�����Է�");
	         int data2 = Integer.parseInt(data);
	         count++;
	         if (data2 == target) {
	            System.out.println("���ϵ帳�ϴ�.");
	            System.out.println("�����Դϴ�.");
	            System.out.println("�� �õ�Ƚ���� " + count + "ȸ");
	            break;
	         }else {
	            System.out.println("������ �ƴմϴ�.");
	            if (data2 > target) {
	               System.out.println("���亸�� ũ��.");
	            } else {
	               System.out.println("���亸�� �۴�.");
	            }
	         }
	      }

	   }

	}