package �迭����;

import javax.swing.JOptionPane;

public class �����������Է� {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է�"); //100 �Է�('string')
			// num[i] = data; // �⺻���� �������� ĳ���� �Ұ�, int<--String : Integer.parseInt
			int data2 = Integer.parseInt(data); //data �Է°� 100<-"100"
			num[i] = data2;
			
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		int sum = 0; // ���� ���� ó������ �־��ִ� ��=>�ʱ�ȭ!
		// �ʱ�ȭ���� ���� ������ ���� : �����Ⱚ�� ����ִ� ����!
		// => �����ν� �� �� ���� ����!
		//���� ���鶧 �ʱ�ȭ�� �� ���־�� �Ѵ�.
		
		for (int x : num) {
			sum = x + sum;
		}
		System.out.println(String.format("%.2f", sum / (double)num.length)); //�Ҽ��� �ݿø� : String.format("%.2f",)

	}

}