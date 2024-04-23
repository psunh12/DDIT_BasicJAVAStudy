package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
		//boolean : 1byte
		//			true(참), false(거짓), 형변환 없음
		//			조건문(관계연산자 또는 논리연산자가 사용된 수식)의 결과
		// 			+작다의 반대: 크거나 같다
		
		double d= 0.1;
		float f= 0.1f;
		
		int age = 19;
		int year = 2024;
		boolean b1=(d==f);//괄호사용 자주하기, 우선순위
		
		System.out.println(age>18);
		System.out.println((year%4==0 && year%100 !=0)|(year%400==0));
		/*윤년계산*/
	}

}
