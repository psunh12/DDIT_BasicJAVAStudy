package ddit.cordingTest.day1;

import java.util.Scanner;

public class strTest {

	public static void main(String[] args) {
		
		/*Scanner=콘솔에서 키보드 입력값을 받을때 사용
		 *import 해주기
		 */
		
		Scanner sc = new Scanner(System.in);
		//Scanner 객체 생성

		String str = sc.next();
		//입력받은 문자열을 str에 저장
	
		System.out.println(str);
		sc.close();
	}

}
