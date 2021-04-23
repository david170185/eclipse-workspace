package shop;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("잠자기");
		list.add("맛있는거 먹기");
		list.add("음악 듣기");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
			
		}

		

	}

}
