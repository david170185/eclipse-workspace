package 정리문제;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 계산기그래픽 {
	private static JTextField t2;
	private static JTextField t1;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel.setBounds(25, 33, 136, 48);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1.setBounds(25, 95, 136, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 18));
		t2.setBounds(173, 95, 252, 50);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 18));
		t1.setColumns(10);
		t1.setBounds(173, 33, 252, 50);
		f.getContentPane().add(t1);
		
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 20));
		t3.setForeground(Color.RED);
		t3.setBackground(Color.YELLOW);
		t3.setColumns(10);
		t3.setBounds(25, 172, 400, 50);
		f.getContentPane().add(t3);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼 클릭됨.");
				String s1 = t1.getText();
				String s2 = t1.getText();
				System.out.println(s1);
				System.out.println(s2);
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.add(i1, i2);
				t3.setText("더한값은" + result);
			}
		});
		btnNewButton.setBounds(25, 236, 77, 215);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("빼기");
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼 클릭됨.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.minus(i1, i2);
				t3.setText("뺀값은" + result);
			}
		});
		btnNewButton_1.setBounds(133, 236, 77, 215);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("곱하기");
		btnNewButton_1_1.setBackground(Color.ORANGE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("곱하기 버튼 클릭됨.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.mul(i1, i2);
				t3.setText("곱한값은" + result);
			}
		});
		btnNewButton_1_1.setBounds(244, 236, 77, 215);
		f.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("나누기");
		btnNewButton_1_1_1.setBackground(Color.GREEN);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나누기 버튼 클릭됨.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				계산기 cal = new 계산기();
				int result = cal.div(i1, i2);
				t3.setText("나눈값은" + result);				
			}
		});
		btnNewButton_1_1_1.setBounds(348, 236, 77, 215);
		f.getContentPane().add(btnNewButton_1_1_1);
		
		
		
		
		
		
		
		f.setVisible(true);

	}

}
