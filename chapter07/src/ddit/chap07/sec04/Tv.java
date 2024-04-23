package ddit.chap07.sec04;

public class Tv extends Goods {
//생성자메서드, 매개변수도 없다.
	Tv(){
		super(5000);
	}
	
	@Override
	public String toString() {
		return "LG ThinQ 60";//문자열 반환+재정의
	}
	public void printInfo() {
		System.out.println("제조회사명 : LG 전자");
		
	}
}
