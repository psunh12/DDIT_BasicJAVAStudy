package ddit.chap06.sec04;

import java.util.Scanner;

//��ǰ�̸��� Ű����� �Է¹޴� �޼��� �ۼ�
public class StaticInstanceExample {
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		Goods g1 = new Goods("û�ұ�");
		g1.printInfo();
		
		Goods g2 = new Goods(inputProdName());//��ǰ���� �Է¹޴´�
		g2.printInfo();//static�� ��뤾���������� 1000���� �ʱ�ȭ�Ǿ 1002�� �ƴ� 1001�� ����
		
	}
	
	public static String inputProdName() {
		System.out.print("��ǰ�� : ");
		String pn =sc.next();
		return pn;
	}

}
