package ddit.chapr03.sec02;

import java.util.Scanner;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator bOper = new BinaryOperator();
//		bOper.arithmeticOperator();
//		bOper.arithmeticOperator01();
//		bOper.bitWiser();
		bOper.shiftOperator();
	}
	
	
}
class BinaryOperator{
	Scanner sc = new Scanner(System.in);
	//��ü Ŭ�������� ��� ����! �޼��� ��� �ȿ��� ���� �Ѵٸ� ����� ���������� �Ǹ� ���Ұ�.
	
	public void arithmeticOperator() {
		//��������� : +, -, *, /, %
		//���� �ϳ� �Է� �޾� ¦������ Ȧ�������� �Ǻ�
		//**Ű����� �ڷḦ �Է� �޴� ���
		//	-System.in.read() : try ~ catch ��Ͽ� ����ؾ��ϰ� �ϳ��� ����(char)�� �Է¹޾�
		//	 int Ÿ���� ��(ASCII)���� ��ȯ��
		//	-Scanner Ŭ���� ���
		//	.java.util ��Ű���� �ִ� API Ŭ����(����Ҷ� import �ʿ� : import java.util.Scanner)
		//	.����ڰ� Ű����� �Է� �޴� �ڷḦ ��ȯ
		//	.(������)
		//		1) import java.util.Scanner
		//		2) Scanner Ŭ���� ��ü����:Scanner sc = new Scanner(System.in);
		//		3) �޽��� ���(�Է� ��ġ ǥ��): System.out.print("�޽���") -�Է��� �����ٿ��� ����
		//		4) Ű����� �Է� ���� �ڷḦ ������ ����(�����Է� �޴� ���)
		//			int num = sc.nextInt(); long num = sc.next.Long(); byte b =sc.nextByte;
		//			(���ڿ� �Է�)
		//			String str = sc.next() or String str = sc.nextLine()
		//			(�Ǽ� �Է�)
		//			double d= sc.nextDouble()
		//			int num = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"�� ¦���Դϴ�.");
		}else {
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
		
	}
	public void arithmeticOperator01() {
		//���迬���� : =, >, <. >=, <=, !=(<>)
		//			�������� ũ��񱳿� ���Ǹ� ����� true/false�� �ϳ�
		//�������� : !(not), &&(and/���������� ���), ||(or)
		//			����� true/false�� �ϳ�
		//			���� 2���̻��� ������� �����Ҷ� ���
		
		/*	 �Է�					���
		 * ------------------------------------------------
		 * A	B	 AND(&&)	 OR(||)		EX-OR(��Ÿ������)		
		 * 0	0		0			0			0
		 * 0	1		0			1			1
		 * 1	0		0			1			1
		 * 1	1		1			1			0
		 * 
		 * AND�� ����, OR�� ����(�������� ����)
		 */
		
		//10�� �̻��� ���̸� �Է¹޾� ���ɴ븦 ����Ͻÿ�
		System.out.print("�����Է� : ");
		int age = sc.nextInt();
		
		System.out.println(age+"�� "+((age/10)*10)+"�� �Դϴ�");
		
		/*
		if(age>9 && age <20){//age>=10 age <=19 �� ����! �����ϸ� ������ 2�� ��������
			System.out.println(age+"�� 10���Դϴ�");
		}else if(age>19 && age <30) {
			System.out.println(age+"�� 20���Դϴ�");
		}else if(age>29 && age <40) {
			System.out.println(age+"�� 30���Դϴ�");
		}else if(age>39 && age <50) {
			System.out.println(age+"�� 40���Դϴ�");
		}else if(age>49 && age <60) {
			System.out.println(age+"�� 50���Դϴ�");
		}
		*/
	}
	
	public void bitWiser() {
		//��Ʈ�� ������ : &(��Ʈ�� AND), |(��Ʈ�� OR) ^(��Ʈ�� Exclusive OR)
		//	�� �����͸� 2������ ǥ���� �� �� ��Ʈ���� AND, OR, EX-OR ���� �� �����(����) ��ȯ
		//	�ַ� �ý��� ���α׷����� ���
		
		int v1= 23;//10111
		int v2= 13;//01101
		
		int resAnd= v1 & v2;
		int resOr= v1 | v2;
		int resEor= v1 ^ v2;
		
		System.out.println("��Ʈ�� AND="+resAnd);
		System.out.println("��Ʈ�� OR="+resOr);
		System.out.println("��Ʈ�� EX-OR="+resEor);
	}
	public void shiftOperator() {
		//����Ʈ ������ : >>, <<, >>> (�ý��� ���α׷�? �Ҷ� ���� �� �Ⱦ�)
		// 1) >> (Right Shift)
		//	������ >> ����
		//	. '������'�� ������Ʈ ��ŭ ���������� �����̵�
		//	. ��ȣ��Ʈ(���� ���ʺ�Ʈ)�� �̵����� ����
		//	. �߻��Ǵ� ���� ����(�̵���Ʈ��)���� ��ȣ�� Ȯ��Ǿ� ����
		//	. ��� : (�����͸� 2^�� �̵���Ʈ��)�� ���� ���̵�
		// 23>>2(00010111) 2��Ʈ ���������� ����Ʈ=23/2^2
		
		int num = 23;
		System.out.println("23>>2=>"+(num>>2));
		System.out.println("23>>3=>"+(num>>3));
		
		// 2) << (Left Shift)
		//	������ >> ����
		//	. '������'�� ������Ʈ ��ŭ �������� �����̵�
		//	. ��ȣ��Ʈ(���� ���ʺ�Ʈ)�� �̵����� ����
		//	. �߻��Ǵ� ������ �����(�̵���Ʈ��)���� 0�� Ȯ��
		//	. ��� : (������* 2^�� �̵���Ʈ��)�� ��� ���̵�
		
		// 23>>2(00010111) 2��Ʈ �������� ����Ʈ=23*2^2
		//(010111(00))
		System.out.println(num+"<<2 =>"+(num<<2));
		
		// 3) >>>> (Logical Right Shift)
		//	������ >>> ����
		//	. '������'�� ������Ʈ ��ŭ ���������� �����̵�
		//	. ��ȣ��Ʈ�� �̵�
		//	. �߻��Ǵ� ������ �����(�̵���Ʈ��)���� 0�� ����(����� ������ �������� ����)
		
		byte num1 = -23;
		System.out.println("num1="+num1);
		System.out.println("num1>>>2=>"+((byte)(num1>>>2)));//byte�� ������ num�� byte, 2�� int�� �Ǽ� int�� ���,������ ��¹�� Ȯ���ϱ�
		System.out.println("23>>>3=>"+(byte)((num1>>>3)));
		
		
		
		
		
		
		
	}
}	