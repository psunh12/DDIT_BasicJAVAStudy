package ddit.chap06.sec01;

public class Product {
	static int prodNo=1000;//1000으로 초기화.static이 붙어서 객체가 새로 생겨도 초기화가 되지않음.
							//없다면 staticexample에서 1001만 출력됨
	
	Product(){
		prodNo++;//1증가
	}
	
	@Override
	public String toString() {
		return "제품번호 :"+prodNo;
//		return getClass().getName()+'@'+Integer.toHexString(hashCode());
		
	}
}

class Student{//해당클래스 앞에 접근제한자가 public 이 되면 파일명이 되어진다. public은 파일에 하나만
	
	
}
