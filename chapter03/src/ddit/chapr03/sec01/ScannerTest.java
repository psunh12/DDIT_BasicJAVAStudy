package ddit.chapr03.sec01;

import java.util.Scanner;

public class ScannerTest {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a = 3;
		System.out.print("숫자를 입력해주세요 : ");
		int i = sc.nextInt();//스캐너에서 저장한거 int로 출력
		System.out.println("입력받은 숫자입니다. "+i);
		int result = a +i;
		System.out.println("입력 받은 숫자와 숫자"+a+" 를 더한 결과 값은"+result);	
		
		
		System.out.println("문자를 입력해주세요 : ");
		String s =sc.next();//문자를 받는다
		System.out.println("입력받은 문자입니다 " + s);
		
		String s2=sc.nextLine();//엔터까지 포함
		System.out.println("입력받은 문자입니다"+s2);
	}

}
