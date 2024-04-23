package ddit.chap04.sec02;

import java.util.Scanner;

public class ForStatementExample01 {

	public static void main(String[] args) {
		ForStatement01 for01 = new ForStatement01();
//		for01.forMethod01();
//		for01.forMethod02();
		for01.fibonacci();	
	}

}

class ForStatement01{
	Scanner sc = new Scanner(System.in);
	//1-10������ ���� ���Ͻÿ�
	void forMethod01() {
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum=sum+i;
		}
		System.out.println("�հ�="+sum);
	}
	
	//Ű����� 2-9������ ���ڸ� �Է� �޾� �ش� ������ �������� ����Ͻÿ�.
	void forMethod02() {
		System.out.print("�� �Է�(2~9) : ");
		int dan=sc.nextInt();//ex)9*1=9 9*2=18
		
		for(int i=1; i<10; i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
	}
	
	//1-50 ���̿� �����ϴ� �Ǻ���ġ ������ ���� ���
	void fibonacci() {
		int ppn =1;
		int pn=1;
		int cn=0;
		
		System.out.print(ppn+", "+pn+"");
		for(int i =0; i <50; i++) {
			cn=ppn+pn;
			if(cn>=50) break;//��������
			System.out.print(cn+", ");

			ppn=pn;
			pn=cn;
			
		}
	}
	
}