package 컬렉션;

import java.util.LinkedList;

public class 대기줄형 {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		System.out.println(milk);
		milk.remove(); //상한우유 제거
		System.out.println(milk);
		milk.remove(); //오늘우유 제거
		System.out.println(milk);
	}

}
