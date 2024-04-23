package ddit.cordingTest.day1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/* 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드 작성
		a+b=c
		1<=a, b<=100
		 */
		
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = a + b;
        
        /* int sum = 0;
         * sum = a + b;
         */
	
        System.out.println(a + " + " + b + " = " + sum);
	}

}
