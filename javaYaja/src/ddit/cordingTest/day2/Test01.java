package ddit.cordingTest.day2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// �� ���� a, b�� �־��� �� ������ ���� ������ ������ ����ϴ� �ڵ带 �ۼ��� ������
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
