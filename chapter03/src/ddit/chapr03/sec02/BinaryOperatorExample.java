package ddit.chapr03.sec02;

import java.util.Scanner;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator bOper = new BinaryOperator();
//		bOper.arithmeticOperator();
//		bOper.arithmeticOperator01();
//		bOper.bitWiser();
		bOper.shiftOperator();
	}
	
	
}
class BinaryOperator{
	Scanner sc = new Scanner(System.in);
	//전체 클래스에서 사용 가능! 메서드 블록 안에서 선언 한다면 블록을 빠져나가게 되면 사용불가.
	
	public void arithmeticOperator() {
		//산술연산자 : +, -, *, /, %
		//숫자 하나 입력 받아 짝수인지 홀수인지를 판별
		//**키보드로 자료를 입력 받는 방법
		//	-System.in.read() : try ~ catch 블록에 기술해야하고 하나의 글자(char)을 입력받아
		//	 int 타입의 값(ASCII)으로 반환됨
		//	-Scanner 클래스 사용
		//	.java.util 패키지에 있는 API 클래스(사용할때 import 필요 : import java.util.Scanner)
		//	.사용자가 키보드로 입력 받는 자료를 반환
		//	.(사용순서)
		//		1) import java.util.Scanner
		//		2) Scanner 클래스 객체생성:Scanner sc = new Scanner(System.in);
		//		3) 메시지 출력(입력 위치 표시): System.out.print("메시지") -입력이 같은줄에서 수행
		//		4) 키보드로 입력 받은 자료를 변수에 저장(정수입력 받는 경우)
		//			int num = sc.nextInt(); long num = sc.next.Long(); byte b =sc.nextByte;
		//			(문자열 입력)
		//			String str = sc.next() or String str = sc.nextLine()
		//			(실수 입력)
		//			double d= sc.nextDouble()
		//			int num = Integer.parseInt(sc.nextLine());
		
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num+"은 짝수입니다.");
		}else {
			System.out.println(num+"은 홀수입니다.");
		}
		
	}
	public void arithmeticOperator01() {
		//관계연산자 : =, >, <. >=, <=, !=(<>)
		//			데이터의 크기비교에 사용되며 결과는 true/false중 하나
		//논리연산자 : !(not), &&(and/범위지정시 사용), ||(or)
		//			결과는 true/false중 하나
		//			보통 2개이상의 관계식을 연결할때 사용
		
		/*	 입력					출력
		 * ------------------------------------------------
		 * A	B	 AND(&&)	 OR(||)		EX-OR(베타적논리합)		
		 * 0	0		0			0			0
		 * 0	1		0			1			1
		 * 1	0		0			1			1
		 * 1	1		1			1			0
		 * 
		 * AND는 직렬, OR은 병렬(꼬마전구 연상)
		 */
		
		//10세 이상의 나이를 입력받아 연령대를 출력하시오
		System.out.print("나이입력 : ");
		int age = sc.nextInt();
		
		System.out.println(age+"는 "+((age/10)*10)+"대 입니다");
		
		/*
		if(age>9 && age <20){//age>=10 age <=19 와 동일! 웬만하면 연산자 2개 쓰지말기
			System.out.println(age+"은 10대입니다");
		}else if(age>19 && age <30) {
			System.out.println(age+"은 20대입니다");
		}else if(age>29 && age <40) {
			System.out.println(age+"은 30대입니다");
		}else if(age>39 && age <50) {
			System.out.println(age+"은 40대입니다");
		}else if(age>49 && age <60) {
			System.out.println(age+"은 50대입니다");
		}
		*/
	}
	
	public void bitWiser() {
		//비트별 연산자 : &(비트별 AND), |(비트별 OR) ^(비트별 Exclusive OR)
		//	각 데이터를 2진수로 표현한 후 각 비트별로 AND, OR, EX-OR 연산 후 결과값(숫자) 반환
		//	주로 시스템 프로그램에서 사용
		
		int v1= 23;//10111
		int v2= 13;//01101
		
		int resAnd= v1 & v2;
		int resOr= v1 | v2;
		int resEor= v1 ^ v2;
		
		System.out.println("비트별 AND="+resAnd);
		System.out.println("비트별 OR="+resOr);
		System.out.println("비트별 EX-OR="+resEor);
	}
	public void shiftOperator() {
		//쉬프트 연산자 : >>, <<, >>> (시스템 프로그램? 할때 빼고 잘 안씀)
		// 1) >> (Right Shift)
		//	데이터 >> 정수
		//	. '데이터'를 정수비트 만큼 오른쪽으로 평행이동
		//	. 부호비트(가장 왼쪽비트)는 이동하지 않음
		//	. 발생되는 왼쪽 공간(이동비트수)에는 부호가 확장되어 들어간다
		//	. 결과 : (데이터를 2^의 이동비트수)로 나눈 몫이됨
		// 23>>2(00010111) 2비트 오른쪽으로 시프트=23/2^2
		
		int num = 23;
		System.out.println("23>>2=>"+(num>>2));
		System.out.println("23>>3=>"+(num>>3));
		
		// 2) << (Left Shift)
		//	데이터 >> 정수
		//	. '데이터'를 정수비트 만큼 왼쪽으로 평행이동
		//	. 부호비트(가장 왼쪽비트)는 이동하지 않음
		//	. 발생되는 오른쪽 빈공간(이동비트수)에는 0이 확장
		//	. 결과 : (데이터* 2^의 이동비트수)의 결과 값이됨
		
		// 23>>2(00010111) 2비트 왼쪽으로 시프트=23*2^2
		//(010111(00))
		System.out.println(num+"<<2 =>"+(num<<2));
		
		// 3) >>>> (Logical Right Shift)
		//	데이터 >>> 정수
		//	. '데이터'를 정수비트 만큼 오른쪽으로 평행이동
		//	. 부호비트도 이동
		//	. 발생되는 오른쪽 빈공간(이동비트수)에는 0이 삽입(결과에 음수는 존재하지 않음)
		
		byte num1 = -23;
		System.out.println("num1="+num1);
		System.out.println("num1>>>2=>"+((byte)(num1>>>2)));//byte가 없으면 num은 byte, 2는 int로 되서 int로 출력,이진수 출력방법 확인하기
		System.out.println("23>>>3=>"+(byte)((num1>>>3)));
		
		
		
		
		
		
		
	}
}	