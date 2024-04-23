package ddit.chap04.sec01;

import java.util.Random;

// 난수(random  number)
//1)Math.random() 사용
// .- 0.0이상 1.0미만의 double형 난수 발생
//  1~ 50사이의 정수형 난수 발생
// 	0.0 <= random() <1.0	
// 	0.0*50 <= random() <1.0*50	
//	0.0 <= random()*50 <50.0
//	(int)0.0 <=(int)(random()*50) < (int)50.0
//	0 <= (int)(random()*50) < 50
//	1 <= (int)(Math.random()*50)+1 < 51

//2)Random 클래스
//	Random rnd = new Random() --객체생성
//	int random = rnd.nextInt();
//	1~50사이의 정수형 난수
//	int random=rnd.nextInt(50)+1

public class IfStatementExample02 {
		Random random = new Random();

	public static void main(String[] args) {//적재될때 생성되니까 class생성 안해도됨
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;//주사위는 1~6까지 있기때문, random은 0부터 시작해서 +1 해줌
//		
		
		
//		int dice = (int)(Math.random()*6)+1;//.java.lang 패키지에 포함되어 import 안해도 됨 (Math,System+스테틱이라서 클래스 만들지 않아도됨
//		System.out.println("주사위 눈:"+dice);
	}
}
