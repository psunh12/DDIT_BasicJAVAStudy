package ddit.chap02.sec03;

public class CastExample02 {

	public static void main(String[] args) {
		//���ڿ�(String ��ü,Ŭ���� �ǹ�) => �⺻��(byte, short, int, long, float, double, char, boolean)
		//�ٲ� Ÿ���� Wrapper Ŭ����, parse Ÿ�Ը�(���ڿ�)
		
		// Wrapper Ŭ����				Ÿ�Ը�
		
		/*����*/
		// int => Integer			Int
		// byte => Byte				Byte
		// short => Short			Short(�ǹ����� ���ǾȾ�)
		// long => Long				Long
		
		/*�Ǽ�*/
		// float => Float			Float(�ǹ����� ���ǾȾ�)
		// double => Double			Double
		
		/*������*/
		// char => Character		Char
		
		
		// boolean => Boolean		Boolean
		
		
		float f = 0.1f;//f�� �ٿ��� �ϴ� ���ŷο��� ����(�� �Ⱦ�)
		double d = 0.1;
		
		
		
		String val1="15";//�Ǽ��� ����(double or float), string Ŭ������ ����ɼ� ���� Ŭ���� immutable? ȿ�� ����
		
		//float res1=Float.parseFloat(val1);//parse �߶� �����Ѵ�
		
		int res2=Integer.parseInt(val1);
		
		System.out.println(res2);
		
		//System.out.println(res1+10);//27.5+10 �ϸ� 27.510 ���� ��µ�
		
		
	}

}
