package ddit.chap07.sec04;

public class Tv extends Goods {
//�����ڸ޼���, �Ű������� ����.
	Tv(){
		super(5000);
	}
	
	@Override
	public String toString() {
		return "LG ThinQ 60";//���ڿ� ��ȯ+������
	}
	public void printInfo() {
		System.out.println("����ȸ��� : LG ����");
		
	}
}
