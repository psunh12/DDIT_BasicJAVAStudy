package ddit.chap06.sec01;

public class Product {
	static int prodNo=1000;//1000���� �ʱ�ȭ.static�� �پ ��ü�� ���� ���ܵ� �ʱ�ȭ�� ��������.
							//���ٸ� staticexample���� 1001�� ��µ�
	
	Product(){
		prodNo++;//1����
	}
	
	@Override
	public String toString() {
		return "��ǰ��ȣ :"+prodNo;
//		return getClass().getName()+'@'+Integer.toHexString(hashCode());
		
	}
}

class Student{//�ش�Ŭ���� �տ� ���������ڰ� public �� �Ǹ� ���ϸ��� �Ǿ�����. public�� ���Ͽ� �ϳ���
	
	
}
