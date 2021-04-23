package 조건문;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLUE);
		f.setSize(500, 500);
		
		JButton b1 = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694!");
		b1.setToolTipText("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(f, "버튼을 누르셨군요");
				String s1 = b1.getText();//"홍길동"
				JOptionPane.showMessageDialog(f, "당신의 입력값은" + s1);
			}
		});
		b1.setBackground(new Color(255, 255, 255));
		f.getContentPane().add(b1, BorderLayout.NORTH);
		
		JButton b2 = new JButton("\uBAA9\uB85D");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(b2, BorderLayout.WEST);
		f.setVisible(true);

	}

}
