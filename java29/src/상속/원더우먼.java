package 상속;

public class 원더우먼 extends 우먼{
	
	boolean jump;
	
	public void 높이뛰다() {
		System.out.println("이름이" + name + "이 높이뛰다.");
	}

	@Override
	public String toString() {
		return "원더우먼 [jump=" + jump + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
