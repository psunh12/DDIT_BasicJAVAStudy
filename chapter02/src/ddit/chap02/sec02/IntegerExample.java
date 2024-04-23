package ddit.chap02.sec02;

public class IntegerExample {

	public static void main(String[] args) {
		/*���� �޼���*/
		//byteMethod(); /*�Ʒ��� �����*/
		//shortMethod();
		//intMethod();/*ȣ���Ѵ�*/
		longMethod();
	}
	public static void byteMethod() {
		//byte Ÿ���� ���� ���� : -128 ~ 127
		//�� ���� �ʰ��ϴ� literal ��� : ����
		// = ������ �������� ������� �� ������ ����� ��ȯ����� ���� ����
		byte b1=10;
		System.out.println("b1="+b1);
		
		//byte b2=128; ����
		//byte b3=-129; ����
		
		byte b2=127;
		byte b3=-128;
		byte res=(byte)(b2+3); //1�� int. byte Ÿ�԰� ���� �ʾ� ������
		b3=(byte)(b3-3);
		
		//���� �������� ����! 5/2=2 !! 2.5 �ƴ�
		//b2+1���� ���θ�� �Ͼ, �Ϲ� ���ڸ� ������ ���������� ������ ������ ��ȯ�Ǿ� ���� ����. 
		System.out.println("res="+res);
		System.out.println("b3="+b3);
	}
	
	public static void shortMethod() {
		//short (2byte) : 32767 ~ -32768
		//�� ���� �ʰ��ϴ� literal ��� : ����
		// = ���������� �� ������ ����� ��ȯ����� ���� ����		
		
		short s1=32767;
		s1++;/*++:1�� �����ϴ� ������*/
		
		System.out.println("s1="+s1);
	}
	public static void intMethod() {
		//int : 4byte
		//		2147483647 ~ 2147483648 ���� ����
		//		�⺻������
		
		int kor=80;
		int mat=90;
		int eng=75;
		
		int sum=kor+mat+eng;
		System.out.println("���� : "+sum);
		System.out.println("��� : "+sum/3);//���� ������ ���!
	}
	public static void longMethod() {
		//long : 8byte�� ����
		//		 2^63_1 ~ -2^63
		//		literal ���� 'L' �Ǵ� 'l'�� �߰��Ͽ� longŸ���� �ڷ����� ��Ÿ������
	
		long l1=10000000000L;/*'L' �Ǵ� 'l'�� �߰����� ������ int�� �ν��Ͽ� ������*/
		long l2=100000L;
	
	}
	
}
