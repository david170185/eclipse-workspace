package ����;

public class �����Ѱ����Ǻ� {

	public static void main(String[] args) {
		// 1. ������ ��ȣ�� p / �Է��� ��ȣ�� q, ��ȣ�� �´� ��� pass ��� / ���� �ʴ� ��� ���Է� ���
		// 2. ������ ������ ������ ��ȭ�� 2.2, ��ȭ�� 2���� ũ�ٸ� ���̾�Ʈ ����!
		// 3. �Է��� ��ȣ�� �¾Ұ�, ������ ��ȭ�� 2���� ũ�� ������ ����! �ƴϸ� ���� �ٽ� ����!
		
		// 1������
		// �ѱ����̸� char�� ����ϴ� ���� ����.
		char pw1 = 'p';
		char pw2 = 'q';
		// �񱳿����ڴ� �⺻���� �� �� ����.
		if (pw1 == pw2) {//true
			System.out.println("PASS");						
		} else {//false
			System.out.println("���Է�");
			
		// 2������
		double change = 2.2;
		if (change >= 2) {
			System.out.println("���̾�Ʈ ����");
		
		// 3������
		if (pw1 == pw2 && change >= 2) {
			System.out.println("������ ����!");
		} else {
			System.out.println("���� �ٽ� ����!");

		} // else end
		}
	} // main end

}  //class
}
