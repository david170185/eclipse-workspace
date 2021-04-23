package 복습;

import javax.swing.JOptionPane;

public class 순차문예제 {

	public static void main(String[] args) {
		// 1. 어떤 입력을 받아서, 1-2개 입력받음.
		// 2. 간단한 처리
		// 3. 처리 결과를 출력
		
		//입력
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요. ");
		String gender = JOptionPane.showInputDialog(null, "성별을 입력하세요. ");
		
		//처리
		String result = name + "님 환영합니다. ";
		
		//출력
		JOptionPane.showMessageDialog(null, result);
		

	}

}
