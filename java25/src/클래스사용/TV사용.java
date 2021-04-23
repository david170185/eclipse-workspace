package 클래스사용;

import 클래스만들기.TV;

public class TV사용 {

	public static void main(String[] args) {
		//마우스 올려서 import 선택(f2)
		//자동완성
		//컨트롤 + 쉬프트 + o(영문)
		TV myTv = new TV();
		//yourTv.on(); //생성되지 않은 yourTv 변수를 사용해서 에러!
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = true;
		System.out.println(myTv);
		
		TV yourTv = new TV();
		//yourTv.on(); //생성되지 않은 yourTv 변수를 사용해서 에러!
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		System.out.println(yourTv);
		
	}

}
