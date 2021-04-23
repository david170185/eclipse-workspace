package 스태틱;

public class 직원 {
	String name;
	String gender;
	int age;
	
	static int count;
	static int sum;

	public 직원(String name, String gender, int age) {
		count++;
		sum = sum + age;
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public static void getAvg() {
		//static 메서드 안에서는 static 변수만을 사용할 수 있다.
		System.out.println(sum / (double)count);
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	

}
