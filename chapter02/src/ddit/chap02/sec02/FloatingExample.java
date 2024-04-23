package ddit.chap02.sec02;

public class FloatingExample {

	public static void main(String[] args) {
		FloatingExample fe=new FloatingExample();
		//fe.floatMethod();
		fe.doubleMethod();
		
	}
	
	void floatMethod() {
		//float : 4byte(��ȣ(1bit), ����(8bit), ����(23bit)
		//		    ǥ������ : 1.4e-45 ~ 3.4e+38
		//		  literal���� 'F'�� 'f' �߰��ؾ���
		
		float pi=3.1415926f;
		
		int sum = 245;
		float avg=sum/3f;//f �� ������ �� 81.0 ���� ����
		
		System.out.printf("��� : %6.2f",avg);//�Ҽ� ��°�ڸ����� ǥ��.
		
		
		/* byte < char, short < int < long < float < double */
		/* ���Ŀ��� int ���� ���� Ÿ���� �ڷ�� int�� ��ȯ��. (byte, char, short) */
	}
	void doubleMethod() {
		//double : 8 byte(��ȣ(1bit), ����(11bit), ����(52bit)
		//		     ǥ������ : 4.9e-324 ~ 1.8e+308
		//		     �⺻�Ǽ���
		//		  literal ���� 'D', 'd', ����
		
		double d1=0.1;
		double d2=0.1D;
		
		float f1=0.1f; //double d1���� �ٸ���
		d2=f1;//f1 double ���� ������ ��.
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		
		if(d1==f1) {
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
		
	}
}
