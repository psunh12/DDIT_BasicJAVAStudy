package ddit.chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		//char : 2byte
		//		  ǥ�� ���� : 0~65535
		//		 byte => char ������ ��ȯ�� �� ����(char�� ������ ����)
		//		 ' ' �ȿ� ǥ��
		
		char alpha = 'a';
		
		System.out.println(alpha);
		System.out.println(alpha+1
				0);//a�� ASCII �ڵ� �� ���
		System.out.println((char)(alpha+10));//���� ����ȯ
		
		char ch1='��';//'���ѹα�'�� 4���ڶ� ������
		System.out.println(ch1+0);//ch1�� ASCII �ڵ� �� ���
		
		System.out.println((int)'��');
		System.out.println((int)'�R');
		
		//'ABCD...Z' ���
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
	}

}
