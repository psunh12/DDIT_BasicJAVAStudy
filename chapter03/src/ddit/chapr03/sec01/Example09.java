package ddit.chapr03.sec01;

import java.util.Scanner;

public class Example09 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Example09 obj = new Example09();
		obj.example09();
		
	}
	public void example09() {
		System.out.print("ù ��° ��: ");
		double d1 = sc.nextDouble();
		
		System.out.print("�� ��° ��: ");
		double d2 = sc.nextDouble();
		
		System.out.println("------------------");
		
		double result = d1/d2;
		
		
		
		if(d2 != 0.0) {
			System.out.println("���: "+ result);
		}else {
			System.out.println("���: ���Ѵ�");
		}
//	public void example09_1() {
//		
//		System.out.print("ù ��° �� : ");
//		double num1 = Double.parseDouble(sc.nextLine());
//
//		System.out.print("�� ��° �� : ");
//		double num2 = Double.parseDouble(sc.nextLine());
//		
//		System.out.println("------------------");
//		
//		if(num2 != 0.0) {
//			System.out.println("���: "+ (num1/num2));
//		}else {
//			System.out.println("���: ���Ѵ�");
//		}
//	}
		

}
	
	public void example092() {
		System.out.print("ù ��° ��: ");
		int d1 = sc.nextInt();
		
		
		
	}
}