package �迭;

public class �迭�����3 {

	public static void main(String[] args) {
		//1. ���� 5�� ũ���� �迭�� ���� 10,20,30,40,50�� ������� �ִ´�. ù��°���� ����° ���� ���ؼ� ����Ʈ
		//2. ��Ʈ�� 3�� ũ���� �迭�� ���� �ڹ�, ������, JSP�� ������� �ִ´�.=>"�ڹ� ���ٴ� ������"�� ���
		// int[] num = new int[3]; => int�� �ְڴٴ� ���, ���� Ÿ�Ը� ���� �� �ִ�. => ������ ũ�⸦ ������(ũ�Ⱑ ���� �Ұ���)
		
		//1������
		int[] num = new int[5];
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		num[3] = 40;		
//		num[4] = 50;
		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 10;
		}
		
			System.out.println(num[0] + num[2]);
		
		//2������
		String[] x = new String[3];
		x[0] = "�ڹ�";
		x[1] = "������";
		x[2] = "JSP";
			System.out.println(x[0] + "���ٴ�" + x[1]);
			
		}
		
}
