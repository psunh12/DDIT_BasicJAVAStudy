package ddit.chapr03.sec01;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = 3;
		System.out.print("���ڸ� �Է����ּ��� : ");
		int i = sc.nextInt();//��ĳ�ʿ��� �����Ѱ� int�� ���
		System.out.println("�Է¹��� �����Դϴ�. "+i);
		int result = a +i;
		System.out.println("�Է� ���� ���ڿ� ����"+a+" �� ���� ��� ����"+result);	
		
		
		System.out.println("���ڸ� �Է����ּ��� : ");
		String s =sc.next();//���ڸ� �޴´�
		System.out.println("�Է¹��� �����Դϴ� " + s);
		
		String s2=sc.nextLine();//���ͱ��� ����
		System.out.println("�Է¹��� �����Դϴ�"+s2);
	}

}
