package ddit.chapr03.sec01;

import java.util.Scanner;

public class BinaryOperator02 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryOperator02 obj = new BinaryOperator02();
//		obj.bitOperator01();
		obj.bitOperator02();
	}
	
	public void bitOperator01() {
		int a = 45;
		int b = 25;
		System.out.println(a + "&" + b + "=" + (a&b));
		System.out.println(a + "|" + b + "=" + (a|b));
		System.out.println(a + "^" + b + "=" + (a^b));
		System.out.println("~" + a + " = " + (~a));
		
		/* 
		 *
		 * &(
		 * 
		 */
		
	}
	public void bitOperator02() {
		System.out.println();
//		a>> b:���� a�� �� ��Ʈ�� b��ŭ ���������� �̵� (��ȣ bit�� �̵����� ����),
//				�߻��Ǵ� ������ �� ������ ��ȣbit�� Ȯ��
//				a�� 2�� b������ ���� ���� ��ȯ
//		a<< b:���� a�� �� ��Ʈ�� b��ŭ �������� �̵� (��ȣ bit�� �̵����� ����),
//				�߻��Ǵ� �������� �� ������ '0'�� pedding
//				a�� 2�� b������ ���Ѱ��� ��ȯ
//		a>>> b:���� a�� �� ��Ʈ�� b��ŭ ���������� �̵� (��ȣ bit�� �̵�),
//				�߻��Ǵ� ������ �� ������ '0'�� pedding
	}	
	
	

}
