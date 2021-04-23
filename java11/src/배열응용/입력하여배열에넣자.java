package 배열응용;

import javax.swing.JOptionPane;

public class 입력하여배열에넣자 {

	public static void main(String[] args) {
		// 1. 작년에 가고싶었던 곳 세곳을 입력받아 넣으세요(제주도, 양양, 속초)
		// 2. 올해에 가고싶었던 곳 세곳을 입력받아 넣으세요(제주도, 부산, 울산)
		// 일치하는 항목이 있으면 어디인지 위치를 찾아주세요

		String[] last = new String[3];
		String[] year = new String[3];

		for (int i = 0; i < year.length; i++) {
			last[i] = JOptionPane.showInputDialog("작년에 가고 싶었던 곳");
			year[i] = JOptionPane.showInputDialog("올해에 가고 싶었던 곳");
		}
		for (int i = 0; i < year.length; i++) {
			System.out.println(last[i] + " " + year[i]);
		}
		int count = 0;
		for (int i = 0; i < year.length; i++) {
			if (last[i].equals(year[i])) {
				count++;
				System.out.println("같은 위치는" + i);

			}

		}
		System.out.println("같은 위치의 개수는" + count);
	}
}