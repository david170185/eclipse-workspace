package 상속;

public class Employee extends Object {

	public String name;
	String address;
	protected int salary;
	private int rrn; // 주민번호

	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}

}
