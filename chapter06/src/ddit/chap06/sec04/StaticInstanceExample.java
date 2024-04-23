package ddit.chap06.sec04;

import java.util.Scanner;

//상품이름을 키보드로 입력받는 메서드 작성
public class StaticInstanceExample {
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		Goods g1 = new Goods("청소기");
		g1.printInfo();
		
		Goods g2 = new Goods(inputProdName());//상품명을 입력받는다
		g2.printInfo();//static을 사용ㅎㅏ지않으면 1000으로 초기화되어서 1002가 아닌 1001이 나옴
		
	}
	
	public static String inputProdName() {
		System.out.print("상품명 : ");
		String pn =sc.next();
		return pn;
	}

}
