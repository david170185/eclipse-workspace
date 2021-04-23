package 컬렉션;

import java.util.HashSet;

public class 중복제거추가문제 {

	public static void main(String[] args) {
		String[] food = {"감자","고구마", "양파","감자","고구마",};
		
		HashSet set = new HashSet();
		for (int i = 0; i < food.length; i++) {
			set.add(food.get(i));
		}
		System.out.println(set.size());
	}

}
