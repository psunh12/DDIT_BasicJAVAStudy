package ddit.chap02.sec01;

import java.util.Scanner;

public class VariableExample01 {
	static int val1; //����ʵ�(�ʱ�ȭ ���� ����)
			int val2;//��������
			
	//STATIC�ҼӵȺ��� static ������ ������ ��� �������� ó�� ���� ��
	//int ������ ����		
		
	public static void main(String[] args) {
		
	VariableExample01 ve =new VariableExample01();//��������		
			
			int val1 =10 ;
			char ch1 ='s';//��������ǥ
			String s1 = "string";//ū����ǥ		
			
			
			//int var1 = 10;
//		int result = val1 + 100;
//		
//		System.out.println("val="+val1);
//		System.out.println("result="+result); /*syso + ctrl + space, ""+��=���ڿ�+���ڿ� */
		
		Scanner sc= new Scanner(System.in);/*�빮�ڴ� Ŭ����, �빮�ڰ� ������ ��ȣ�� �ֱ⶧���� �޼���*/
		System.out.print("�����Է� : ");
		
		int age=sc.nextInt();
		
		String str=null;/*null�� ���̰� ���� ����*/
		if(age>=18) {
			str="18�� �̻��̹Ƿ� �����Դϴ�...";
		}else {
			str="18�� �̸��̹Ƿ� �̼������Դϴ�...";	
		}
		System.out.println(str);
	}

}
