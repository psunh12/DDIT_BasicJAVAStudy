package ddit.chapr03.sec01;

import java.util.Scanner;

public class UnaryOperator01 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		UnaryOperator01 obj = new UnaryOperator01();//Ŭ������ obj��� �̸����� ������.
//		obj.signOperator01();//Ŭ�����̸�.�޼����̸� ȣ��
		obj.signOperator02();

	}
	public void signOperator01() {
		//1. ��ȣ������
		int num = 100;
		int result = -num;
		System.out.println("num = "+num);
		System.out.println("result = "+result);
	}
	public void signOperator02() {
		// ����������
		// ++����		���� �������� �ǿ������� ���� 1 ���� ��Ŵ (a=1 ,a=a+1=2, ��� 2,2)
		//����++		���� �����Ŀ� �ǿ������� ���� 1 ���� ��Ŵ(a=1
		//--����		���� �������� �ǿ������� ���� 1 ���� ��Ŵ
		//����--		���� �����Ŀ� �ǿ������� ���� 1 ���� ��Ŵ
	
		int a=1;
		int val = ++a;//a�� ���� ��� �� �� ++ ����
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

