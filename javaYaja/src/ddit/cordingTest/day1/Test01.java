package ddit.cordingTest.day1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/* �� ���� a, b�� �־��� �� ������ ���� ������ ������ ����ϴ� �ڵ� �ۼ�
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
