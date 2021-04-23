package pack04;

public class ComputerUse {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.price = 1000;
		com1.color = "red";
		com1.company = "Samsung";

		com1.on();;
		System.out.println(com1);
		
		Computer com2 = new Computer();
		com2.price = 500;
		com2.color = "white";
		com2.company = "LG";

		com2.off();
		System.out.println(com2);

	}

}