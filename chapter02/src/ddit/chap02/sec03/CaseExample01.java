package ddit.chap02.sec03;

public class CaseExample01 {

	public static void main(String[] args) {
		//cast : ��������ȯ
		//		 cast������[(Ÿ��)] �ʿ�
		
		byte b1=10;
		short s1=100;
		
		short res=(short)(s1+b1);//s1+b1 ����, s1+(short)b1 ���� =>int�� �ٲ�� ����!
		
		double d1 =34.56789;//�Ҽ��� 2�ڸ����� �ݿø�
		d1=d1*10;
		System.out.println(d1);
		
		d1=d1+0.5;
		System.out.println(d1);
		
		int result=(int)d1;
		System.out.println(result);
		
		d1=(double)result/10;
		System.out.println(d1);
		/*�׳��ϸ� ���������ڷ� 34.0���� ��µ�. ���� ����ȯ�� ����Ͽ� 34.6�� ���*/
	}
	

}
