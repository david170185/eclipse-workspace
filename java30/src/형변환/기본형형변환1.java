package 형변환;

public class 기본형형변환1 {

	public static void main(String[] args) {
		// 정수 :
		// byte(1바이트, -128 ~ 127)
		// short(2바이트, -3만 ~ 3만)
		// int(4바이트, -21억 ~ 21억)
		// long(8바이트, -+21억 이상/이하)
		byte x = 100;
		int y = x; // 기본형 복사
		// x에 들어있던 100값이 y에 들어갈 수 있도록
		// 자동으로 int타입으로 변환되어 들어감.
		// 자동형변환(int(큰)<--------byte(작은공간))
		// 형변환은 cpu가 이행

		byte z = (byte) y; // 기본형 복사
		// y에 들어있던 100값이 z에 들어갈 수 있도록
		// 강제로 byte 타입으로 변환시켜 들어가야 한다.
		// 강제형변환(byte(작)<--------int(큰))

		// 강제형변환은 잘라서 집어넣을 작은 범위에서 허용한 값만 가능하다.
		int x1 = 1000;
		// byte y1 = (byte)x1; (불가능)

		// 1. 형변환 : 다른 크기의 두공간의 값을 도일 공간의 값으로 변환
		// 2. 자동형변환 : 작은 공간의 값을 큰 공간의 값으로 변환
		// 3. 강제형변환 : 큰 공간의 값을 작은 공간의 값으로 변환
		// 4. 강제형변환 불가 : 큰값을 작은 공간의 값으로 변환
		// 5. 클래스 다이어그램 : 자동차 바퀴 예시
		// 6. 자동형변환 강제형변환 비교 : int y = x; / byte z = (byte) y;
		// 7. 클래스간 형변환 : 배열x,상속 관계에서만 가능
		// 8. 클래스간 자동 형변환 : up casting
		// 9. 형변환 영어로 : casting
		// 10. 클래스간 강제형변환 : down casting
		// 11. 강제형변환 문법 : () 소괄호
		// 12. ArrayList 사용 이유 : 자동형변환(타입에 상관없이 사용하기 위해)
		// 13. ArrayList 사용시 : object로 변환됨
		// 14. ArrayList 값을 꺼내올때 : 강제변환됨
		// 15. Wrapper Class(포장클래스) : 
		// 16. boxing : 
		// 17. unboxing : 

	}

}
