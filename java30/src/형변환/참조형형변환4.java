package 형변환;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class 참조형형변환4 {

	public static void main(String[] args) {
		//객체설계할 때 2대 원칙
		//하나의 클래스 안에는 하나의 역할만을 정의해야 한다.:응집도(cohesion) 높게!
		//결합시 특정한 클래스만 지정하여 설계하면 안된다.: 결합도(coupling) 낮게!
		맨 m = new 맨(); //맨만 쓸수 있음
		
		//하나의 이름으로 다양한 형태를 구현하여 사용하는 자바의 특징
		//자동형변환으로 가능, 오버로딩(다형성)
		사람 m2 = new 맨(); //권장코드 : 맨, 우먼, 사람, 수퍼맨 다 쓸수 있음
		//결합도가 낮은 코드! 코드 변경시 더 좋음
		m2 = new 우먼();
		m2 = new 수퍼맨();
		//결합도가 낮은 코드는 유지보수 하기도 좋고, 더 좋은 성능을 가진 클래스로 변경도 용이
		//작업량도 감소
		
		ArrayList list2 = new ArrayList();
		
		List list = new ArrayList();
		list = new LinkedList();
						
	}

}
