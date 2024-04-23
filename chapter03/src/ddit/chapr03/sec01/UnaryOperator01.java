package ddit.chapr03.sec01;

import java.util.Scanner;

public class UnaryOperator01 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator01 obj = new UnaryOperator01();//클래스를 obj라는 이름으로 선언함.
//		obj.signOperator01();//클래스이름.메서드이름 호출
		obj.signOperator02();

	}
	public void signOperator01() {
		//1. 부호연산자
		int num = 100;
		int result = -num;
		System.out.println("num = "+num);
		System.out.println("result = "+result);
	}
	public void signOperator02() {
		// 증감연산자
		// ++변수		연산 수행전에 피연산자의 값을 1 증가 시킴 (a=1 ,a=a+1=2, 출력 2,2)
		//변수++		연산 수행후에 피연산자의 값을 1 증가 시킴(a=1
		//--변수		연산 수행전에 피연산자의 값을 1 감소 시킴
		//변수--		연산 수행후에 피연산자의 값을 1 감소 시킴
	
		int a=1;
		int val = ++a;//a를 먼저 출력 한 후 ++ 진행
		System.out.println(a);
		System.out.println(val);
	
		int b=2;
		int val2 = b--; 
		/*--b*/
//		b=b-1;
//		int val2=b;
		
		
//		int val2 = b--;
		/*b--*/
//		b=b-1;
		
		
		System.out.println(b);
		System.out.println(val2);
	
	}
}

