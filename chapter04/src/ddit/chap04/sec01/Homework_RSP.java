package ddit.chap04.sec01;

import java.util.Scanner;
import java.util.Random;

public class Homework_RSP {
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args) {
	
		
		Homework_RSP obj = new Homework_RSP();
		obj.Homework01();
	
		
	}
	public void Homework01() {
		System.out.println("가위(0), 바위(1), 보(2) 중 숫자 하나를 입력하세요.");
		
		int rsp1 = sc.nextInt();
		
		
		if(rsp1 == 0 ) {
			System.out.println("사용자 : 가위");
		}
		if(rsp1 == 1 ) {
			System.out.println("사용자 : 바위");
		}
		if (rsp1 == 2 ) {
			System.out.println("사용자 : 보");
		}
		
		
	
		int rsp2 = random.nextInt(3);
		
		if(rsp2 == 0 ) {
			System.out.println("컴퓨터 : 가위");
		}
		if(rsp2 == 1 ) {
			System.out.println("컴퓨터 : 바위");
		}
		if (rsp2 == 2 ) {
			System.out.println("컴퓨터 : 보");
		
		}
		
		
		System.out.println("--------------------");

		if((rsp1 == 0 && rsp2 ==2 )||( rsp1 == 1 && rsp2 ==0 )||(rsp1 == 2 && rsp2 ==1)) {
			System.out.println("사용자가 이겼습니다.");
		}
		if((rsp1 == 0 && rsp2 ==1 )||( rsp1 == 1 && rsp2 ==2 )||(rsp1 == 2 && rsp2 ==0)) {
			System.out.println("사용자가 졌습니다.");
		}
		if( rsp1 == rsp2) {
			System.out.println("비겼습니다.");
		}
	}
}