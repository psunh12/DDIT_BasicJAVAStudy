package ddit.chap02.sec01;

import java.util.Scanner;

public class VariableExample01 {
	static int val1; //멤버필드(초기화 하지 않음)
			int val2;//전역변수
			
	//STATIC소속된변수 static 없으면 오류남 대신 전역변수 처럼 쓰면 됨
	//int 데이터 선언		
		
	public static void main(String[] args) {
		
	VariableExample01 ve =new VariableExample01();//전역변수		
			
			int val1 =10 ;
			char ch1 ='s';//작은따옴표
			String s1 = "string";//큰따옴표		
			
			
			//int var1 = 10;
//		int result = val1 + 100;
//		
//		System.out.println("val="+val1);
//		System.out.println("result="+result); /*syso + ctrl + space, ""+값=문자열+문자열 */
		
		Scanner sc= new Scanner(System.in);/*대문자는 클래스, 대문자가 있지만 괄호가 있기때문에 메서드*/
		System.out.print("나이입력 : ");
		
		int age=sc.nextInt();
		
		String str=null;/*null은 길이가 없는 공백*/
		if(age>=18) {
			str="18세 이상이므로 성인입니다...";
		}else {
			str="18세 미만이므로 미성년자입니다...";	
		}
		System.out.println(str);
	}

}
