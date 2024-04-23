package kr.or.ddit.study;

import java.util.Scanner;

public class Study2 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Study2 obj = new Study2();
//		obj.test0();
//		obj.test1();
//		obj.test2();
		obj.test3();
		
		
		
	}
	
	public void test0() {
		/*
		  양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 
		  정수 n과 k가 매개변수로 주어졌을 때, 
		  양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지
		  출력해보세요.
		 */
		
		
		int n = (int) (Math.random()*50+1)*12000;
		int k = (int) (Math.random()*50+1)*2000;
		
		int sum = n + k;
		
		System.out.println("총 금액은 "+sum+"원 입니다.");
	
//		int yang = 12000*n;
//		int um = 2000*k;
//		System.out.println("n 값은="+n+"\tk 값은 ="+k);
//		System.out.println("결과값은= "+(yang+um));
	
	}
	
	public void test1() {
		/*
			정수 num1, num2가 랜덤한 변수로 주어질 때, 
			num1을 num2로 나눈 몫을 출력해주세요.
		*/
		
		int num1 = (int) (Math.random()*50+1);
		int num2 = (int) (Math.random()*50+1);
	
	
		System.out.println("결과:"+(num1/num2));
		
	}
	
	public void test2() {
		/*
		   정수 num1, num2가 랜덤한 변수로 주어질 때, 
		   num1을 num2로 나눈 값에 1,000을 곱한 후 
		   정수 부분을 출력 해주세요.
		 */
		int num1 = (int) (Math.random()*50+1);
		int num2 = (int) (Math.random()*50+1);
		
//		double div2 = num1/num2;
//		
//		System.out.println("결과:"+((int)(div2))*1000);
		
		double d =((double)num1/num2);
		double d1000 = d *1000;
		int d_int =(int)d1000;
		
		double result = (double)d_int/1000;
		System.out.println(num1+","+num2);
		
		System.out.println(d);
		System.out.println(d1000);
		System.out.println(d_int);
		System.out.println(result);
		
	}

	public void test3() {
		/*
		    두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 출력합니다. 
		    예를 들면 다음과 같습니다.
		   
		    a = 12 b =3 
		 
			12 ⊕ 3 = 123
			3 ⊕ 12 = 312
			
			양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 출력하세요 
		 */
		
//		int a = (int) (Math.random()*50+1);
//		int b = (int) (Math.random()*50+1);

		int a =12;
		int b = 3;
		
		String ab = "" + a + b ;
		String ba = "" + b + a;
	
		System.out.println(ab);
		System.out.println(ba);
		
		int ab_int = Integer.parseInt(ab);
		int ba_int = Integer.valueOf(ba);//==기능상으로 동일함
		
		if(ab_int> ba_int) {
			System.out.println(ab_int);
		}else {
			System.out.println(ba_int);
		}
	}
	
	
	
}