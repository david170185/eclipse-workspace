package 배열응용;

import javax.swing.JOptionPane;

public class 여러개숫자입력 {

	public static void main(String[] args) {
		int[] num = new int[3]; //{0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력"); //100 입력('string')
			// num[i] = data; // 기본형과 참조형은 캐스팅 불가, int<--String : Integer.parseInt
			int data2 = Integer.parseInt(data); //data 입력값 100<-"100"
			num[i] = data2;
			
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		int sum = 0; // 변수 만들어서 처음값을 넣어주는 것=>초기화!
		// 초기화되지 않은 변수의 상태 : 쓰레기값이 들어있는 상태!
		// => 변수로써 쓸 수 없는 상태!
		//변수 만들때 초기화를 꼭 해주어야 한다.
		
		for (int x : num) {
			sum = x + sum;
		}
		System.out.println(String.format("%.2f", sum / (double)num.length)); //소수점 반올림 : String.format("%.2f",)

	}

}