package ddit.chapr03.sec01;

import java.util.Scanner;

public class TrinomialOperator {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		TrinomialOperator obj = new TrinomialOperator();
		obj.trinomialOperator();
	}
	public void trinomialOperator() {
		/*
		 * 삼항 연산자 :3개의 피연산자를 필요로 하는 연산
		 * 			삼항연산자는? 앞의 조건식의 결과에 따라 콜론 앞뒤의 피연산자가 선택
		 * 			조건 연산식이라고도 함
		 * 조건식 ?  값 또는 연산식 : 값 또는 연산식
		 *  	|____true____|
		 *  	|____________false_____|
		 */
		
		//String s = true ? "참" : "거짓"; =>문자열 출력
		
		/** 18세 보다 많을경우 성인 출력, 아닐경우 미성년자 입니다 출력**/
		
//		System.out.println("나이를 입력해 주세요 : ");
//		int age =sc.nextInt();
//		
//		String result = age > 18 ? "성인" : "미성년자";
//		System.out.println( result +"입니다.");
		
		
		/** 10보다 클 경우는 나누기 2 10보다 작을경우는 나누기 3**/
		
		System.out.println("숫자를 입력하세요.");
		int i =sc.nextInt();
		double num = i>10 ? i/2.0 : i/3.0;

//		동일구문

//		if(10<i) {
//			num =i/2.0;
//		}else {
//			num = i/3.0;
//		}
		
		System.out.println(num);
		
	
	}
}
