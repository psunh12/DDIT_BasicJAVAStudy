package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		//boolean : 1byte
		//			true(��), false(����), ����ȯ ����
		//			���ǹ�(���迬���� �Ǵ� �������ڰ� ���� ����)�� ���
		// 			+�۴��� �ݴ�: ũ�ų� ����
		
		double d= 0.1;
		float f= 0.1f;
		
		int age = 19;
		int year = 2024;
		boolean b1=(d==f);//��ȣ��� �����ϱ�, �켱����
		
		System.out.println(age>18);
		System.out.println((year%4==0 && year%100 !=0)|(year%400==0));
		/*������*/
	}

}
