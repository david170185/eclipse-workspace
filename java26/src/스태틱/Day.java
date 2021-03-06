package 스태틱;

public class Day {
	//멤버변수는 객체생성될 때 마다 다이나믹하게 동적으로 메모리가 할당
	//객체가 3개 생성되었다면, 객체마다 각각 속성 값들을 가져야 한다.
	//실제로 그 객체에 해당하는 실제값들이 구체적으로 저장되는 특징
	//실제값: instance <-> static(누적)
	//객체생성할때마다 복사되는 변수 : 인스턴스 변수
	String doing;
	int time;
	String place;
	//static 변수는 클래스당 한개만 가지고 있는 변수
	//클래스이름.변수명, Day.count!
	//객체생성과는 상관없다.
	//static은 객체생성하지 않아도 사용 가능
	static int count; //전역변수, 0으로 초기화 증적변수
	static int sum;
	public Day(String doing, int time, String place) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.place = place;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", place=" + place + "]";
	}

}
