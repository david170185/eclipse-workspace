package ����;

public class �⺻������Ȯ�ι��� {

	public static void main(String[] args) {
		// �⺻������ Ȯ�ι���
		// 1. 1�б� ���� : ü�� 66��, ����77��, ����88��, ����99�� ��� ������ ����, ����� �����ּ���.
		// 2. pi = 3.14, ������ 2.2 => ���� ������ �����ּ���. ������ ���ϴ� ���� = pi(����)*r(������)^2

		//1������
		int ü�� = 66;
		int ���� = 77;
		int ���� = 88;
		int ���� = 99;
		
		int sum = ü�� + ���� + ���� + ����;
		System.out.println("�հ��" + sum + "��");
		// �ڹٴ� int��  int����� ����� �׻� int!
		// age = sum / 4; => 82
		int count = 4;
		// �ڹٴ� �ϳ��� double�̸� ������ �����  �׻� double(ĳ����)!		
		double avg = (double)sum / count;
		System.out.println("�����" + avg + "��");
		// ������ Ÿ���� ���� ���ϴ� Ÿ������ �������ִ°��� ĳ����!
		// ram���� ���� Ÿ���� �״�� �ְ�,
		// cpu�� ram�� ����ִ� �����͸� �����ٰ� ���� ĳ������.
		//(�����ϰ��� �ϴ� Ÿ�Ը�)���� => (double)sum
		
		//2������
		final double PI = 3.14; // final : ���(���� �Ұ����� ��), �빮�ڷ� �ۼ�
		double r = 2.2;
		double mul = PI * r * r;
		System.out.println("���Ǹ�����" + mul);
		
		// �߻���(abstract) : ��Ȯ���� �ʰ� �ָŸ�ȣ��, ������ �ҿ���
		// ����(implement) : ��Ȯ�ϰ� �����ϰ� ����� ��
		//ex) public abstract class


	}

}