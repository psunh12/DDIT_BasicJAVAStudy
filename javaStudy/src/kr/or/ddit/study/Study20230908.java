package kr.or.ddit.study;

import java.util.Random;
import java.util.Scanner;

public class Study20230908 {

	
		Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			Study20230908 obj = new Study20230908();
			obj.test5();
		}

		public void test1() {

			System.out.println("스캐너를 이용하여 숫자를 입력 받고 해당 숫자에 해당하는 구구단을 출력하시오");
			String s = sc.nextLine();
			int dan = (int)(Math.random()*8)+2;

			
			
		}

		public void test2() {

			System.out.println("for 문 2개를 이용하여 구구단을 출력하시오");
			System.out.println("ex");


		}
		
		public void test3() {
			System.out.println("for 문 2개를 이용하여 구구단을 출력하시오.");
			System.out.println("숫자를 입력하여 해당 구구단을 제외하고 출력 하시오");
			int dan = (int)(Math.random()*8)+2;

	 
		}
		
		
		public void test4() {
			/*
			 	양의 정수 n이 매개변수로 주어질 때, 
			 	n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 출력 
			    n이 짝수라면 n 이하의 짝수인 모든 양의 정수의 제곱의 합을 출력 하세요.
			 * 
			 */
			
			int n = (int)(Math.random()*50)+1;
		}
		
		public void test5() {
			/*
			 *  로또는 1~45의 숫자로 구성되어 있으며 
			    중복되지 않는다.
			    변수 6개에 중복되지 않은 숫자를 입력하고 출력하시오.
			 */
			
			int a0 =0 , a1 =0 , a2 =0 , a3 = 0 , a4 = 0 , a5 = 0 ;
		
			for(int i=0; i<6; i++) {
				int current = (int)(Math.random()*6)+1;
				for(int j=0; j<i; j++) {
					int before = 0;
				
				}
			}
			System.out.println(a0+", "+a1+", "+ a2 +", " +a3 +", "+ a4 + ", "+ a5 );
			
		}
	}