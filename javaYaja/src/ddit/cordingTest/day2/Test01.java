package ddit.cordingTest.day2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		
//		int result = a + b;
//		
//		System.out.println(a+" + "+b+" = "+result);
		
		if(1<=a  && 1 <=b && a<=100 && b <= 100) {
			System.out.println(a+" + "+b+" = "+(a+b));
		}

	}

}
