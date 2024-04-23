package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample02 {

	public static void main(String[] args) {
		//키보드로 0~100점 사이의 점수를 입력받아
		//100~90 : "매우우수"
		//80~89 : "우수"
		//70~79 : "보통"
		//60~69 : "미흡"
		//59점 이하 : "매우미흡"
		
		SwitchStatement02 ss02 = new SwitchStatement02();
		ss02.inputScore();
	}

}

class SwitchStatement02{
	String grade;//클래스 변수. 초기값 null, (참조형 변수는 초기값이 null임!)
	Scanner sc = Scanner(System.in);
	
	public void inputScore() {
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		switch(score/10) {//나눗셈의 값은 모두 정수!
		case 10:
		case 9:	
			grade = "매우우수";
			break;
		case 8:	
			grade = "우수";
			break;
		case 7:	
			grade = "보통";
			break;
		case 6:	
			grade = "미흡";
			break;
		default :	
			grade = "매우미흡";
		}
		
		System.out.println(score+"=>"+grade);
	}
	
}