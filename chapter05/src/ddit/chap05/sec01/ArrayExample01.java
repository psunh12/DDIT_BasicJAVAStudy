package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		arrayMethod01();
	}
	public static void arrayMethod01() {
		//'A' ~ 'Z' �迭�� �����ϰ� ���
		char[] alpha = new char[26];//���̰� 26�� charŸ�� alpha�� ������
		
		for(int i =0; i<alpha.length; i++) {//alpha ���̸�ŭ �ݺ�
			alpha[i]=(char)(i+65);
		}
		for(int i=0; i<alpha.length; i++) {
	}
		System.out.println("alpha="+Arrays.toString(alpha));//alpha �迭���� ����ϱ�
	
		
	

	}
	public String toString() {
		return getClass().getName()+'@'+Integer.toHexString(hashCode());
		//�ؽ��ڵ��� �ּҸ� 10������ �ٲ۰� 16���� ���ڿ��� �ٲپ��.(�׳� ����ϸ� alpha=[C@15db9742)
	}
}
