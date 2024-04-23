package ddit.chap06.sec04;

public class Goods {
	static int prodID=1000;///static을 사용하면 프로그램 처음에 setting값 1000. 이후로 1씩 증가함
	String prodName;
	
	Goods(String prodName){// 생성자가 있기때문에 클래스 선언할때 Goods() 라고 쓰면 오류남.
		prodID++;
		this.prodName=prodName;
		
		
	}
	
	public void printInfo() {
		System.out.println("상품코드 : "+prodID);
		System.out.println("상품명 : "+prodName);
		System.out.println("----------------------------");
		
	}
	
}