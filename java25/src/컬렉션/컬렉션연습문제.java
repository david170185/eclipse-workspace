package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션연습문제 {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		System.out.println(bag);		
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);

		ArrayList list = new ArrayList(); //순서가 중요
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		list.remove(1);
		System.out.println(list);
				
		HashMap dic = new HashMap();
		dic.put("1번", "엄마");
		dic.put("2번", "아빠");
		dic.put("3번", "친구");
		dic.put("4번", "동생");
		System.out.println(dic.get("2번"));	
		
	}

}
