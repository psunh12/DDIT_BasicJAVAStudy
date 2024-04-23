package ddit.chap07.sec04;

public class Himart {
	// 하이마트에 가면?
	// 고객은 구매하겠지
	//
	public static void main(String[] args) {
	Customer cust= new Customer();
	Tv t = new Tv();
	cust.buy(t);
	cust.buy(new Computer());
	cust.buy(new SmartPhone());
	
	cust.summary();
	
	Goods g1=new Tv();
	//g1.printInfo();//해당되는 객체를 부를수 없다
	//downcast 사용
	// - upcast된 객체만 downcast된다.
	// - 자식클래스만의 고유한 변수나 메서드 실행
	// - 캐스트 연산자 필요. "(클래스명)"가 필요
	// - downcast 전에 instanceOf 연산자로 cast
	// 	  가능여부 판단
	//   객체 instanceof 클래스명
	
	Tv t2=(Tv)g1;
	t2.printInfo();
	
	
	//인스턴스연산자 사용
	if(g1 instanceof Computer) {
	Computer c2=(Computer)g1; //캐스트 불가능
	}else if(g1 instanceof Tv) {
		Tv.t2=(Tv)g1;
		t2.printInfo();
		
	}
	}
}
