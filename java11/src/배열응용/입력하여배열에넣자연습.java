package 배열응용;

import javax.swing.JOptionPane;
import javax.xml.soap.SAAJResult;

public class 입력하여배열에넣자연습 {

	public static void main(String[] args) {
		String[] s = new String[3]; // {null, null, null}
		
		//입력받아 넣음
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("가고싶은 장소 입력");
			
		}
		//넣은 값 하나씩 꺼내서 출력
		for (String x : s) {
			System.out.println(x + " ");
			
		}
		//배열안에 제주도가 있는지 확인하고 싶음
		for (int i = 0; i < s.length; i++) {
			if(s[i].equals("제주도")); // == 기본형 변수에만 사용, 값이 들어갈때는 사용 불가
			//참조형에서 ==을 쓰면 주소를 비교!
			//주소가 가르키는 값을 비교하고 싶으면 그 부품에서 제공하는 명령어를 가지고 있음.
			//string 이라면 equals()를 써야한다.
			System.out.println("제주도가 있음");
			System.out.println("위치는" + i);
			
			}
		
		}
		

}
