package ddit.chapr03.sec01;

import java.util.Scanner;
//�ڹ� util�� scanner �� ����ϰڴ�

public class BinaryOperator01 {
	Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		BinaryOperator01 obj =new BinaryOperator01();
//		obj.arithmeticOper(); //�޼���(���) ȣ��
//		obj.realtaionOper1();
//		obj.realtaionOper2();
		obj.realtaionOper3();

		
	}
	public void arithmeticOper() {
		//������ ���� : +, -, *, / , %
		int a =5;
		int b =3;
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" - "+b+" = "+(a-b));
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" / "+b+" = "+((double)a/b));//����ȯ �ʿ�!
		System.out.println(a+" % "+b+" = "+(a%b));//������ ���ϱ�! /�� �Բ� ���� ��� �������� ���� �� �ִ�
	}

	public void realtaionOper1() {	
		
		//�� ������ >, <, ==, >=, <=, !=
		System.out.println("���ڸ� �Է����ּ��� : ");
		int a =sc.nextInt();
		int b =5;
		
		if (a>b) {//if�� : ������ ��, ����
			System.out.println("a�� b ���� ũ��");
		}
		if (a<b) {
			System.out.println("a�� b ���� �۴�");
		}
		if (a==b) {
			System.out.println("a�� b �� ����");
		}
		if (a>=b) {
			System.out.println("a�� b ���� ũ�ų� ����");
		}
		if (a<=b) {
			System.out.println("a�� b ���� �۰ų� ����");
		}
		if (a!=b) {
			System.out.println("a�� b �� ���� �ʴ�");
		}
	}
	
	public void realtaionOper2() {
		// ������ �Է¹޾Ƽ� ������ �ο�
		// A 90 �̻� B 80 �̻� 
		System.out.println("������ �Է����ּ��� ");
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
		System.out.println("������ "+grade+" �Դϴ�");
			
	}

//	public void realtaionOper3() {
//		// �� ������ : &&, ||, !
//
//		if(true && true) {
//			System.out.println("�Ѵ� ��");
//		}
//		if(true || false) {
//			System.out.println("���� �ϳ��� ��");
//		}
//		
//		int a =sc.nextInt();
//		//0���� ũ�� 10���� ������ Ȯ��
//		
//		if(0<a && a<10) {
//			System.out.println("0���� ũ�� 10���� ����");
//		}else {
//			System.out.println("0���� ũ�� 10���� ���� �ʴ�");
//		}
		
		// �⵵�� �Է¹޾� ����� ����� �Ǻ�
		// ���� : 4�� ����̸鼭 100�� ����� �ƴϰų� 400�� ����ذ� �Ǵ� ��
		
		//	1992 1996 2004 2008 ���� (4�� ����� 100�� ����� �ƴ� ��)
		//  1900 2100 ���
		//	2000 2400 ����(400�� ����� �Ǵ���)
		
//		System.out.println("�⵵�� �Է��ϼ���");
//		int year =sc.nextInt();
//		
//		if ((year % 4 == 0 && year % 100 != 0)|| year % 400 ==0){
//			System.out.println("�����Դϴ�");
//		}else {
//			System.out.println("����Դϴ�");
//		}
		
		/*boolean ���*/
		boolean four = (year%4 ==0);
		boolean not100 = (year%100 !=0);
		boolean four100 = (year%400 == 0);
		
		if ((four && not100)|| (four100)){
			System.out.println("�����Դϴ�");
		}else {
			System.out.println("����Դϴ�");
	}
}	
}
