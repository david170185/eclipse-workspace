package 조건문;

public class 조건문연습1 {

	public static void main(String[] args) {

		int choice = 0; //아이유인 경우 0번을 선택
		
		switch (choice) {
		case 0:
			System.out.println("아이유 선택");
			break;			
		case 1:
			System.out.println("유재석 선택");
			break;			
		case 2:
			System.out.println("박명수 선택");
			break;
		default:			
			System.out.println("해당 연예인이 없습니다.");
			break;
		}

	}

}
