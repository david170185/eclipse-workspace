package 스태틱;

public class 직원채용 {

	public static void main(String[] args) {
		직원 s1 = new 직원("홍길동", "남", 25);
		직원 s2 = new 직원("김길동", "여", 26);
		직원 s3 = new 직원("송길동", "남", 27);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("직원의수" + " : " + 직원.count);

		//System.out.println("나이평균" + " : " + 직원.sum / 직원.count);
		직원.getAvg();
	}

}
