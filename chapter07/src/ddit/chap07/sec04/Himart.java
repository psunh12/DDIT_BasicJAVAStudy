package ddit.chap07.sec04;

public class Himart {
	// ���̸�Ʈ�� ����?
	// ���� �����ϰ���
	//
	public static void main(String[] args) {
	Customer cust= new Customer();
	Tv t = new Tv();
	cust.buy(t);
	cust.buy(new Computer());
	cust.buy(new SmartPhone());
	
	cust.summary();
	
	Goods g1=new Tv();
	//g1.printInfo();//�ش�Ǵ� ��ü�� �θ��� ����
	//downcast ���
	// - upcast�� ��ü�� downcast�ȴ�.
	// - �ڽ�Ŭ�������� ������ ������ �޼��� ����
	// - ĳ��Ʈ ������ �ʿ�. "(Ŭ������)"�� �ʿ�
	// - downcast ���� instanceOf �����ڷ� cast
	// 	  ���ɿ��� �Ǵ�
	//   ��ü instanceof Ŭ������
	
	Tv t2=(Tv)g1;
	t2.printInfo();
	
	
	//�ν��Ͻ������� ���
	if(g1 instanceof Computer) {
	Computer c2=(Computer)g1; //ĳ��Ʈ �Ұ���
	}else if(g1 instanceof Tv) {
		Tv.t2=(Tv)g1;
		t2.printInfo();
		
	}
	}
}
