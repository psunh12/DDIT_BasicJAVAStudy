package ddit.chap07.sec04;

public class Customer {
	int sum;//���űݾ� �հ�
	int mileage;//���ϸ��� �հ�
	String item="";//���Ÿ��,""�� �ϸ� null�� ������ �ʴ´�
	

	void buy(Goods g) {
	sum=sum+g.price;
	mileage=mileage+g.mileage;
	item= g.toString()+","+item;
	
	}
	
	
	
//	void buy(Tv t) {
//		sum=sum+t.price;
//		mileage=mileage+t.mileage;
//		item= t+","+item;
//		
//	}
//	
//	void buy(Computer c) {
//		sum=sum+c.price;
//		mileage=mileage+c.mileage;
//		item= c+","+item;
//		
//	}
//	
//	void buy(SmartPhone sp) {
//		sum=sum+sp.price;
//		mileage=mileage+sp.mileage;
//		item= sp+","+item;
//	
//	}
//	
	void summary() {
		System.out.println("���Ÿ��: "+item);
		System.out.println("���űݾ� �հ�: "+sum);
		System.out.println("���ϸ��� �հ�: "+mileage);
	
	}
		
	

	
}
