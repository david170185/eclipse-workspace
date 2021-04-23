package 스태틱;

public class Day사용 {

	public static void main(String[] args) {
		// static 변수 적용시 클래스당 count 별도 적용 d1 -> Day
		Day d1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count);
		Day d2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		Day d3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		
		System.out.println(Day.sum);
		System.out.println((double) Day.sum / Day.count);

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);

	}

}
