package 그래픽;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadGraphic3 extends JFrame { // extends JFrame으로 생성
	// JFrame이 가지고 있던 메서드, 멤버변수 다 가지고 태어남.
	// ThreadGraphic3에서 JFrame의 것을 다 쓸 수 있음.
	JLabel count, image, day; // 전역 변수선언

	public ThreadGraphic3() {
		setSize(800, 300); // JFrame에서 변경(전역변수 선언으로 변경)

		count = new JLabel("counter들어갈 부분"); // count 라벨변수 정의, JLabel 객체 사용을 위해 생성
		image = new JLabel("이미지 들어가는 라벨 부분"); // image 라벨변수 정의, JLabel 객체 사용을 위해 생성
		day = new JLabel("타이머 들어가는 라벨 부분"); // day 라벨변수 정의, JLabel 객체 사용을 위해 생성

		add(count, BorderLayout.WEST); // count 레이아웃 추가
		add(image, BorderLayout.EAST); // image 레이아웃 추가
		add(day, BorderLayout.SOUTH); // day 레이아웃 추가

		Font font = new Font("궁서", Font.BOLD, 50); // font 일괄 지정
		count.setFont(font); // count 폰트지정
		day.setFont(font); // count 폰트지정

		count2 count2 = new count2(); // inner class에서 사용을 위해 count2 객체 생성
		count2.start(); // count2 실행

		Day2 Day2 = new Day2(); // inner class에서 사용을 위해 day2 객체 생성
		Day2.start(); // day2 실행

		Image2 Image2 = new Image2(); // inner class에서 사용을 위해 image2 객체 생성
		Image2.start(); // image2 실행

		setVisible(true); // JFrame에서 변경(전역변수 선언으로 변경)
	}

	// 파라메터 생성자, 생성자 오버로딩
	// 클래스안에 전역변수를 공유할 목적으로 내부에 끼워넣는 클래스 : 내부클래스
	// inner class, 내부클래스는 독립적으로 쓸 수 없다.
	public class count2 extends Thread { //전역변수 중 count를 사용하기 위해 count2를 이너클래스로 넣음

		@Override //run 재저의를 위한 오버라이드
		public void run() {
			for (int i = 500; i < 0; i++) { //인덱스만큼 for문을 돌려 반복
				count.setText("count : " + i); //count 변수에서 count 값 호출
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// 인터럽트(방해, 중단) : esc, ctrl+c, power-off

				}

			}
		}
	}

	public class Day2 extends Thread {//전역변수 중 day를 사용하기 위해 day2를 이너클래스로 넣음
		@Override //run 재저의를 위한 오버라이드
		public void run() {
			for (int i = 0; i < 1000; i++) { //인덱스만큼 for문을 돌려 반복
				Date date = new Date(); //date 생성자 사용을 위한 객체 생성
				day.setText("날짜" + date); //day 변수에서 date 값 호출
				try { 
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// 인터럽트(방해, 중단) : esc, ctrl+c, power-off

				}
			}
		}
	}

	public class Image2 extends Thread {//전역변수 중 image를 사용하기 위해 image2를 이너클래스로 넣음
		@Override //run 재저의를 위한 오버라이드
		public void run() {
			String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
			for (int i = 500; i < list.length; i++) { //인덱스만큼 for문을 돌려 반복
				ImageIcon icon = new ImageIcon(list[i]); //image 사용을 위해 생성자 호출
				image.setIcon(icon); //image 변수내 아이콘 값을 가져와 사용
				try {
					Thread.sleep(5000); // cpu 실행 속도 조절
				} catch (InterruptedException e) {
					// 인터럽트(방해, 중단) : esc, ctrl+c, power-off

				} // catch

			} // for
		} // run
	} // inner class

} // main
