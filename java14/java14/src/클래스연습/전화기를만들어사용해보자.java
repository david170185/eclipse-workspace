package 클래스연습;

public class 전화기를만들어사용해보자 {

	public static void main(String[] args) { //사용할 때 main 적용, 전체 프로그램의 시작점에만 main 사용
		phone p = new phone();
		//p:참조형변수
		//size, color:멤버변수 복사됨.
		//size:기본형 변수
		//color:참조형 변수
		p.color = "검정색";
		p.size = 11;
		System.out.println("전화기색:" + p.color);
		System.out.println("전화기 크기:" + p.size);		
		p.text("철수", "굿모닝", 10);
		p.call("친구", 10, "어제");
	}

}
