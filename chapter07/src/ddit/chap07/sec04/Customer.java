package ddit.chap07.sec04;

public class Customer {
	int sum;//구매금액 합계
	int mileage;//마일리지 합계
	String item="";//구매목록,""을 하면 null이 찍히지 않는다
	

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
		System.out.println("구매목록: "+item);
		System.out.println("구매금액 합계: "+sum);
		System.out.println("마일리지 합계: "+mileage);
	
	}
		
	

	
}
