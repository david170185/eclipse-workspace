package 배열응용;

import java.util.Random;

public class 랜던한값찾기 {

	public static void main(String[] args) {
		// 랜덤한값 1000개 만들기, 범위는 0 ~ 999까지의 값, 300/400/500/600 이상의 개수를 프린트

	      int[] num = new int[1000];
	      Random r = new Random(42);
	      for (int i = 0; i < num.length; i++) {
	         num[i] = r.nextInt(1000);
	      }
	      for (int x : num) {
	         System.out.print(x + " ");
	      }
	      System.out.println();
	      int count = 0;
	      int count1 = 0;
	      int count2 = 0;
	      int count3 = 0;
	      //전체를 하나씩  모두 꺼내서 일일이 다 체크 해본다!
	      for (int x : num) {
	         if (x >= 600) {
	            count++;
	         } else if (x >= 500) {
	            count1++;
	         } else if (x >= 400) {
	            count2++;
	         } else {
	            count3++;
	         }

	      }
	      System.out.println("600개 이상의 개수는" + count + "개");
	      System.out.println("500개 이상의 개수는" + count1 + "개");
	      System.out.println("400개 이상의 개수는" + count2 + "개");
	      System.out.println("300개 이상의 개수는" + count3 + "개");
	   }

}



