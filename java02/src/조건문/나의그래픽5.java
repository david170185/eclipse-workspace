package ���ǹ�;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ���Ǳ׷���5 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t6;
	private static JTextField t5;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uBA39\uACE0\uC2F6\uC740 \uC74C\uC2DD");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel.setBounds(40, 15, 178, 54);
		f.getContentPane().add(lblNewLabel);
		
		t3 = new JTextField();
		t3.setBackground(Color.YELLOW);
		t3.setBounds(270, 15, 166, 45);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
		btnNewButton.setFont(new Font("����", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1������
				// �԰���� ������ �Է¹޾� ���� ���� ���ϱ�
				String s3 = t3.getText(); //t3 �ؽ�Ʈ ���ڿ��� �Է¹޾Ƽ� s3 ���ڿ� ������ ����
				
				// s1�� �����͸� ���ϴ� ���� ���ؼ� ��/�������� ��
				// s3�� �Էµ� �����ʹ� ���ڿ��̱� ������ �⺻ �������������� �񱳸� �ϴ� �� �����ڴ� ����� �Ұ�
				// ���ڿ��� �� �� �� �ֵ��� �ϴ� equals()�Լ��� �̿��ؼ� ��/���� �Ǻ�
				if (s3.equals("«��")) {
					// �Ǻ��� ���� ���ϰ�� �Ʒ� �ڵ� ����
					// �Ʒ� �ڵ�� f��� ������ ���� '�߱������� ����!'��� �޼����� �� �޼���â�� �����
					JOptionPane.showMessageDialog(f, "�߱������� ����!");
				} else if (s3.equals("�쵿")) {
					JOptionPane.showMessageDialog(f, "�Ͻ������� ����!");
		        } else if (s3.equals("���")) {
			        JOptionPane.showMessageDialog(f, "�н������� ����!");
		        } else {
					JOptionPane.showMessageDialog(f, "�׳� ������ ����!");
				}				
			}
		});
		btnNewButton.setBounds(16, 69, 421, 49);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294?");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel_1.setBounds(41, 127, 178, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBackground(Color.PINK);
		t4.setBounds(271, 127, 166, 45);
		f.getContentPane().add(t4);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC758 \uB0B4\uB144 \uB098\uC774\uB294?");
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t4�� �Էµ� �����͸� s4��� ���ڿ� ������ ����
				String s4 = t4.getText();
				
				// s4�� ����� ���ڿ� �����͸� Interger.parseInt() ����� �̿��ؼ� ������(int)�� ĳ������ age�� ����
				int age = Integer.parseInt(s4);
				// ���ϴ� ���� ������ �����̱� ������ age ������ ������ 1�� ���ؼ� ageNext ������ ����
				int ageNext = age + 1;
				
				// f ������ ���� ���� ���̿� ���� �޼����� �־� �޼��� â�� ���
				JOptionPane.showMessageDialog(f, "����� ���̴�" + ageNext + "�� �Դϴ�.");				
			}
		});
		btnNewButton_1.setBounds(16, 178, 421, 49);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(41, 325, 178, 54);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBackground(Color.CYAN);
		t6.setBounds(271, 325, 166, 45);
		f.getContentPane().add(t6);
		
		JButton btnNewButton_1_1 = new JButton("\uB450\uACFC\uBAA9 \uC810\uC218\uC758 \uD3C9\uADE0\uC740?");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t5, t6�� �Էµ� ���ڿ� �����͸� s5, s6�� ���� ����
				String s5 = t5.getText();
				String s6 = t6.getText();
				
				// s5, s6�� ����� ���ڿ� �����͸� ���������� ĳ������ kor, math��� ������ ������ ����
				int kor = Integer.parseInt(s5);
				int math = Integer.parseInt(s6);
				
				// ����� ���ϱ� ���ؼ� kor, math �� ������ ������ ���Ѵ�.
				int sum = kor + math;
				// ����� �Ǵ� �� ������ �� �ϳ��� double�̸� ����� double�� ���ȴ�.
				// �츮�� ���ϴ� ���� ����� double�� �Ǽ��� �������̴�.
				// '����� ���ϴ� �� �������� �� / �������� ������ ����' �� �� �ϳ��� �Ǽ��� ĳ�������� ���ش�.
				// sum �̶�� ������ ������ �Ǽ������� ���� ĳ����
				// ���� ���� avg ��� �Ǽ��� ������ ����
				double avg = (double)sum / 2;
				
				// f ��� ������ ���� �ڿ� �Է��� �޼����� ���� �޼���â�� ����ݴϴ�.
				JOptionPane.showMessageDialog(f, "�ΰ����� �����" + avg + "�� �Դϴ�." );				
			}
		});
		btnNewButton_1_1.setFont(new Font("����", Font.BOLD, 24));
		btnNewButton_1_1.setBounds(16, 380, 421, 49);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("����", Font.BOLD, 24));
		lblNewLabel_1_1_1.setBounds(41, 265, 178, 54);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBackground(Color.CYAN);
		t5.setBounds(271, 265, 166, 45);
		f.getContentPane().add(t5);
		f.setSize(500, 500);
		f.setVisible(true);

	}
}
