package ddit.chap10.sec03;

import java.util.Scanner;

//throw :���� ���� �߻�
//		 - �Ϲ� �޼��� ���ο� ���
//		 - �������
//			throw ����Ŭ���� ��ü��
//				IOException ioexception = new IOException();
//			ex)	throw new Exception();
//				throw ioexception;
//				
//throws :���� �̷��
//			try ~ catch ����� ���ܹ߻� ���ɼ��� �ִ� ��ɹ��� ����� ������ ó������ �ʰ�
//			�ش� �޼��带 ȣ���ϴ� ������ ����ó���� ������ �� ���
//			(�������)
//			�޼����()	throws ����Ŭ������[, ����Ŭ������, ...]{
//				:
//			}
//			�� �޼��带 ȣ���ϴ� ��ɹ��� �ݵ�� try��ϳ��ο� ����ؾ��ϰ�
//			catch����� throws������ ����� ��� ����Ŭ�������� ��� ó���ؾ���

public class ExceptionExample3 {
	static String[] name;

	public static void main(String[] args) {
		setArray();
		try {
			System.out.println("ȸ���̸� : " + getArray());
		} catch (ArrayIndexOutOfBoundsException e) {
//		e.printStackTrace();
			System.out.println("�迭÷�� ������ �߻��Ǿ���");
		}
		System.out.println("�迭�� ����� ȸ������ üũ�Ͻÿ�");
	}

	public static void setArray() {
		name = new String[] { "ȫ�浿", "�̼���", "������", "�̼���", "������" };

	}

	public static String getArray() throws ArrayIndexOutOfBoundsException {// ���ܹ߻� �����϶�� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�� ȸ���� �����Է� : ");
		int idx = sc.nextInt();

		return name[idx];

	}
}
