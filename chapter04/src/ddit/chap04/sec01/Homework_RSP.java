package ddit.chap04.sec01;

import java.util.Scanner;
import java.util.Random;

public class Homework_RSP {
	
	static Scanner sc = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args) {
	
		
		Homework_RSP obj = new Homework_RSP();
		obj.Homework01();
	
		
	}
	public void Homework01() {
		System.out.println("����(0), ����(1), ��(2) �� ���� �ϳ��� �Է��ϼ���.");
		
		int rsp1 = sc.nextInt();
		
		
		if(rsp1 == 0 ) {
			System.out.println("����� : ����");
		}
		if(rsp1 == 1 ) {
			System.out.println("����� : ����");
		}
		if (rsp1 == 2 ) {
			System.out.println("����� : ��");
		}
		
		
	
		int rsp2 = random.nextInt(3);
		
		if(rsp2 == 0 ) {
			System.out.println("��ǻ�� : ����");
		}
		if(rsp2 == 1 ) {
			System.out.println("��ǻ�� : ����");
		}
		if (rsp2 == 2 ) {
			System.out.println("��ǻ�� : ��");
		
		}
		
		
		System.out.println("--------------------");

		if((rsp1 == 0 && rsp2 ==2 )||( rsp1 == 1 && rsp2 ==0 )||(rsp1 == 2 && rsp2 ==1)) {
			System.out.println("����ڰ� �̰���ϴ�.");
		}
		if((rsp1 == 0 && rsp2 ==1 )||( rsp1 == 1 && rsp2 ==2 )||(rsp1 == 2 && rsp2 ==0)) {
			System.out.println("����ڰ� �����ϴ�.");
		}
		if( rsp1 == rsp2) {
			System.out.println("�����ϴ�.");
		}
	}
}