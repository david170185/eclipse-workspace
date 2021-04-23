package 형변환;

import java.util.ArrayList;
import java.util.Random;

public class 참조형형변환2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //<E> 형변환 하지 않을때.
		//자동형변환 object로 변환!
		//자동형변환의 단점: 부가적으로 추가된 기능들을  쓸 수 없다.
		list.add("홍길동"); //0번 인덱스
		list.add(new 맨()); //1번 인덱스
		list.add(new Random());
		list.add(new 수퍼맨());
		System.out.println(list);
		//list.get(0).charAt(0);
		//String에서 추가된 메서드들은 바로 쓸 수 없다.
		//list.get(1).run();
		//String 기능 사용시 재변환 필요
		//String의 추가 기능을 사용하고 싶으면 다시 String으로 형변환 해주면 된다.
		//String(작) <--- Object(큰), (String)변수
		String name = (String)list.get(0); //꺼낼때 강제변환
		System.out.println(name. charAt(0));
		
		맨 man = (맨)list.get(1);
		man.run();
		
	}

}
