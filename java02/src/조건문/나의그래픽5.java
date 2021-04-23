package 조건문;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 나의그래픽5 {
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
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel.setBounds(40, 15, 178, 54);
		f.getContentPane().add(lblNewLabel);
		
		t3 = new JTextField();
		t3.setBackground(Color.YELLOW);
		t3.setBounds(270, 15, 166, 45);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton btnNewButton = new JButton("\uC5B4\uB514\uB85C \uAC08\uAE4C?");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1번문제
				// 먹고싶은 음식을 입력받아 어디로 갈지 정하기
				String s3 = t3.getText(); //t3 텍스트 상자에서 입력받아서 s3 문자열 변수에 저장
				
				// s1의 데이터를 원하는 값과 비교해서 참/거짓인지 비교
				// s3에 입력된 데이터는 문자열이기 때문에 기본 데이터형만으로 비교를 하는 비교 연산자는 사용이 불가
				// 문자열을 비교 할 수 있도록 하는 equals()함수를 이용해서 참/거짓 판별
				if (s3.equals("짬뽕")) {
					// 판별된 것이 참일경우 아래 코드 실행
					// 아래 코드는 f라는 프레임 위에 '중국집으로 가자!'라는 메세지가 들어간 메세지창을 띄어줌
					JOptionPane.showMessageDialog(f, "중국집으로 가자!");
				} else if (s3.equals("우동")) {
					JOptionPane.showMessageDialog(f, "일식집으로 가자!");
		        } else if (s3.equals("라면")) {
			        JOptionPane.showMessageDialog(f, "분식집으로 가자!");
		        } else {
					JOptionPane.showMessageDialog(f, "그냥 집으로 가자!");
				}				
			}
		});
		btnNewButton.setBounds(16, 69, 421, 49);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\uB2F9\uC2E0\uC758 \uB098\uC774\uB294?");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 24));
		lblNewLabel_1.setBounds(41, 127, 178, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBackground(Color.PINK);
		t4.setBounds(271, 127, 166, 45);
		f.getContentPane().add(t4);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC758 \uB0B4\uB144 \uB098\uC774\uB294?");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t4에 입력된 데이터를 s4라는 문자열 변수에 저장
				String s4 = t4.getText();
				
				// s4에 저장된 문자열 데이터를 Interger.parseInt() 기능을 이용해서 정수형(int)로 캐스팅해 age로 저장
				int age = Integer.parseInt(s4);
				// 원하는 값이 내년의 나이이기 때문에 age 정수형 변수에 1을 더해서 ageNext 변수에 저장
				int ageNext = age + 1;
				
				// f 프레임 위에 내년 나이에 관한 메세지를 넣어 메세지 창을 띄움
				JOptionPane.showMessageDialog(f, "당신의 나이는" + ageNext + "세 입니다.");				
			}
		});
		btnNewButton_1.setBounds(16, 178, 421, 49);
		f.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC218\uD559\uC810\uC218");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 24));
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
				// t5, t6에 입력된 문자열 데이터를 s5, s6에 각각 저장
				String s5 = t5.getText();
				String s6 = t6.getText();
				
				// s5, s6에 저장된 문자열 데이터를 정수형으로 캐스팅해 kor, math라는 정수형 변수에 저장
				int kor = Integer.parseInt(s5);
				int math = Integer.parseInt(s6);
				
				// 평균을 구하기 위해서 kor, math 두 정수형 변수를 합한다.
				int sum = kor + math;
				// 계산이 되는 두 데이터 중 하나라도 double이면 결과가 double로 계산된다.
				// 우리가 원하는 값인 평균은 double인 실수형 데이터이다.
				// '평균을 구하는 두 데이터의 합 / 합해지는 데이터 갯수' 둘 중 하나를 실수형 캐스팅으로 해준다.
				// sum 이라는 정수형 변수를 실수형으로 강제 캐스팅
				// 계산된 값을 avg 라는 실수형 변수에 저장
				double avg = (double)sum / 2;
				
				// f 라는 프레임 위에 뒤에 입력한 메세지를 넣은 메세지창을 띄어줍니다.
				JOptionPane.showMessageDialog(f, "두과목의 평균은" + avg + "점 입니다." );				
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.BOLD, 24));
		btnNewButton_1_1.setBounds(16, 380, 421, 49);
		f.getContentPane().add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uAD6D\uC5B4\uC810\uC218");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.BOLD, 24));
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
