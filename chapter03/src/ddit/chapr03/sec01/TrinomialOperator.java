package ddit.chapr03.sec01;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.trinomialOperator();
	}
	public void trinomialOperator() {
		/*
		 * ���� ������ :3���� �ǿ����ڸ� �ʿ�� �ϴ� ����
		 * 			���׿����ڴ�? ���� ���ǽ��� ����� ���� �ݷ� �յ��� �ǿ����ڰ� ����
		 * 			���� ������̶�� ��
		 * ���ǽ� ?  �� �Ǵ� ����� : �� �Ǵ� �����
		 *  	|____true____|
		 *  	|____________false_____|
		 */
		
		//String s = true ? "��" : "����"; =>���ڿ� ���
		
		/** 18�� ���� ������� ���� ���, �ƴҰ�� �̼����� �Դϴ� ���**/
		
//		System.out.println("���̸� �Է��� �ּ��� : ");
//		int age =sc.nextInt();
//		
//		String result = age > 18 ? "����" : "�̼�����";
//		System.out.println( result +"�Դϴ�.");
		
		
		/** 10���� Ŭ ���� ������ 2 10���� �������� ������ 3**/
		
		System.out.println("���ڸ� �Է��ϼ���.");
		int i =sc.nextInt();
		double num = i>10 ? i/2.0 : i/3.0;

//		���ϱ���

//		if(10<i) {
//			num =i/2.0;
//		}else {
//			num = i/3.0;
//		}
		
		System.out.println(num);
		
	
	}
}
