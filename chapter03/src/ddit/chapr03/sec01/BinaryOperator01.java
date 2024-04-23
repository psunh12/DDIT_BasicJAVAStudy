package ddit.chapr03.sec01;

import java.util.Scanner;
//자바 util중 scanner 을 사용하겠다

public class BinaryOperator01 {
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		BinaryOperator01 obj =new BinaryOperator01();
//		obj.arithmeticOper(); //메서드(기능) 호출
//		obj.realtaionOper1();
//		obj.realtaionOper2();
		obj.realtaionOper3();

		
	}
	public void arithmeticOper() {
		//연산자 종류 : +, -, *, / , %
		int a =5;
		int b =3;
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+((double)a/b));//형변환 필요!
		System.out.println(a+" % "+b+" = "+(a%b));//나머지 구하기! /을 함께 쓰면 몫과 나머지를 구할 수 있다
	}

	public void realtaionOper1() {	
		
		//비교 연산자 >, <, ==, >=, <=, !=
		System.out.println("숫자를 입력해주세요 : ");
		int a =sc.nextInt();
		int b =5;
		
		if (a>b) {//if문 : 조건의 참, 거짓
			System.out.println("a가 b 보다 크다");
		}
		if (a<b) {
			System.out.println("a가 b 보다 작다");
		}
		if (a==b) {
			System.out.println("a와 b 는 같다");
		}
		if (a>=b) {
			System.out.println("a가 b 보다 크거나 같다");
		}
		if (a<=b) {
			System.out.println("a가 b 보다 작거나 같다");
		}
		if (a!=b) {
			System.out.println("a와 b 는 같지 않다");
		}
	}
	
	public void realtaionOper2() {
		// 점수를 입력받아서 학점을 부여
		// A 90 이상 B 80 이상 
		System.out.println("점수를 입력해주세요 ");
		int score =sc.nextInt();
		String grade = "";
		if(score>=90) {
			grade = "A";
		}else if(score >=80) {
			grade = "B";
		}else if(score >=70) {
			grade = "C";
		}else if(score >=60) {
			grade = "D";
		}else {
			grade = "F";
		}
		System.out.println("학점은 "+grade+" 입니다");
			
	}

//	public void realtaionOper3() {
//		// 논리 연산자 : &&, ||, !
//
//		if(true && true) {
//			System.out.println("둘다 참");
//		}
//		if(true || false) {
//			System.out.println("둘중 하나만 참");
//		}
//		
//		int a =sc.nextInt();
//		//0보다 크고 10보다 작은지 확인
//		
//		if(0<a && a<10) {
//			System.out.println("0보다 크고 10보다 작음");
//		}else {
//			System.out.println("0보다 크고 10보다 작지 않다");
//		}
		
		// 년도를 입력받아 윤년과 평년을 판별
		// 윤년 : 4의 배수이면서 100의 배수가 아니거나 400의 배수해가 되는 해
		
		//	1992 1996 2004 2008 윤년 (4의 배수중 100의 배수는 아닌 해)
		//  1900 2100 평년
		//	2000 2400 윤년(400의 배수가 되는해)
		
//		System.out.println("년도를 입력하세요");
//		int year =sc.nextInt();
//		
//		if ((year % 4 == 0 && year % 100 != 0)|| year % 400 ==0){
//			System.out.println("윤년입니다");
//		}else {
//			System.out.println("평년입니다");
//		}
		
		/*boolean 사용*/
		boolean four = (year%4 ==0);
		boolean not100 = (year%100 !=0);
		boolean four100 = (year%400 == 0);
		
		if ((four && not100)|| (four100)){
			System.out.println("윤년입니다");
		}else {
			System.out.println("평년입니다");
	}
}	
}
