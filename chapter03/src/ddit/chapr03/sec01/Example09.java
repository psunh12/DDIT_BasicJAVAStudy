package ddit.chapr03.sec01;

import java.util.Scanner;

public class Example09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example09 obj = new Example09();
		obj.example09();
		
	}
	public void example09() {
		System.out.print("첫 번째 수: ");
		double d1 = sc.nextDouble();
		
		System.out.print("두 번째 수: ");
		double d2 = sc.nextDouble();
		
		System.out.println("------------------");
		
		double result = d1/d2;
		
		
		
		if(d2 != 0.0) {
			System.out.println("결과: "+ result);
		}else {
			System.out.println("결과: 무한대");
		}
//	public void example09_1() {
//		
//		System.out.print("첫 번째 수 : ");
//		double num1 = Double.parseDouble(sc.nextLine());
//
//		System.out.print("두 번째 수 : ");
//		double num2 = Double.parseDouble(sc.nextLine());
//		
//		System.out.println("------------------");
//		
//		if(num2 != 0.0) {
//			System.out.println("결과: "+ (num1/num2));
//		}else {
//			System.out.println("결과: 무한대");
//		}
//	}
		

}
	
	public void example092() {
		System.out.print("첫 번째 수: ");
		int d1 = sc.nextInt();
		
		
		
	}
}