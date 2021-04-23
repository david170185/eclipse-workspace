package 상속;

public class 수퍼맨 extends 맨{
	//멤버변수3, 멤버메서드2
	
	boolean fly;
	
	public void 우주를날다() {
		System.out.println("이름이" + name + "이 수퍼맨이 지구밖인 우주를 날다.");
	}
	//상송박았던 메서드 중에서 메서드의 기능을 재정의해서 사용할 수 잇음.
	//오버라이드(메서드 재정의)
	@Override
	public String toString() {
		return "수퍼맨 [fly=" + fly + ", speed=" + speed + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
