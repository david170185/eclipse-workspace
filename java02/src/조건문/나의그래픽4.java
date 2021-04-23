package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽4 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(241, 71, 166, 27);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(243, 128, 166, 27);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. 입력한 t1, t2값을 가지고 와야한다.
				//외부에서 입력한 데이터의 타입은 모두 String!!
				String s1 = t1.getText(); //"200"
				String s2 = t2.getText(); //"100"
				//2. 내가 지정한 id/pw와 동일한지 확인!
				System.out.println(s1 + s2);
				//자바에서는 +연산자 사용시 하나라도 String이면 결합의 의미!
				//String -> int로 바꾸어 주어야 함.
				//부품		기본형 간에 cpu가 하는 캐스팅은 불가능!
				//바꾸어주는 부품을 써야한다.
				int n1 = Integer.parseInt(s1);//"200" -> 200
				int n2 = Integer.parseInt(s2);//"200" -> 200
				System.out.println(s1 + s2);
				
				System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		
				
				
	    	}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(77, 265, 302, 70);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC790 1 :");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(78, 77, 118, 21);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7902 : ");
		lblNewLabel_1.setBounds(79, 131, 113, 21);
		f.getContentPane().add(lblNewLabel_1);
		f.setVisible(true);

	}
}
