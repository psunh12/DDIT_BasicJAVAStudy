package ddit.chap06.sec04;

public class Goods {
	static int prodID=1000;///static�� ����ϸ� ���α׷� ó���� setting�� 1000. ���ķ� 1�� ������
	String prodName;
	
	Goods(String prodName){// �����ڰ� �ֱ⶧���� Ŭ���� �����Ҷ� Goods() ��� ���� ������.
		prodID++;
		this.prodName=prodName;
		
		
	}
	
	public void printInfo() {
		System.out.println("��ǰ�ڵ� : "+prodID);
		System.out.println("��ǰ�� : "+prodName);
		System.out.println("----------------------------");
		
	}
	
}