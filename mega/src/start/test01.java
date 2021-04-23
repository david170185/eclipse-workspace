package start;

public class test01 {
	   public static void main(String[] args) {
	        int[] num = new int[1000]; //0~999
	        num[0] = 100; //첫번째값
	        num[4] = 200; //다섯번째값
	        num[9] = 300; //열번째값
	        num[999] = 500; //마지막값
	        
	        int count = 0; // 카운트 지정(-값이 있을 경우 1부터 설정)
	         for (int i = 0; i < num.length; i++) {
	            if (num[i] == 0) {
	               continue;
	            } else {
	               count++;
	            }
	         }
	         System.out.println("배열 값들의 개수는 :" + count);
	         System.out.println("1번째 위치 :" +" " + num[0]);
	         System.out.println("5번째 위치 :" + " " + num[4]);
	         System.out.println("10번째 위치 :" + " " + num[9]);
	         System.out.println("마지막 위치 :" + " " + num[num.length-1]);

	   }
}