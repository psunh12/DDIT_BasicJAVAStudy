package ddit.chap02.sec02;

public class IntegerExample {

	public static void main(String[] args) {
		/*시작 메서드*/
		//byteMethod(); /*아래가 실행됨*/
		//shortMethod();
		//intMethod();/*호출한다*/
		longMethod();
	}
	public static void byteMethod() {
		//byte 타입의 값의 범위 : -128 ~ 127
		//위 값을 초과하는 literal 사용 : 오류
		// = 연산자 오른쪽의 결과값이 위 범위를 벗어나면 순환적용된 값을 저장
		byte b1=10;
		System.out.println("b1="+b1);
		
		//byte b2=128; 오류
		//byte b3=-129; 오류
		
		byte b2=127;
		byte b3=-128;
		byte res=(byte)(b2+3); //1은 int. byte 타입과 맞지 않아 오류남
		b3=(byte)(b3-3);
		
		//정수 연산결과는 정수! 5/2=2 !! 2.5 아님
		//b2+1에서 프로모션 일어남, 일반 숫자를 넣으면 오류나지만 연산을 넣으면 순환되어 값이 나옴. 
		System.out.println("res="+res);
		System.out.println("b3="+b3);
	}
	
	public static void shortMethod() {
		//short (2byte) : 32767 ~ -32768
		//위 값을 초과하는 literal 사용 : 오류
		// = 연산결과값이 위 범위를 벗어나면 순환적용된 값을 저장		
		
		short s1=32767;
		s1++;/*++:1씩 증가하는 연산자*/
		
		System.out.println("s1="+s1);
	}
	public static void intMethod() {
		//int : 4byte
		//		2147483647 ~ 2147483648 저장 가능
		//		기본정수형
		
		int kor=80;
		int mat=90;
		int eng=75;
		
		int sum=kor+mat+eng;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+sum/3);//정수 값으로 출력!
	}
	public static void longMethod() {
		//long : 8byte에 저장
		//		 2^63_1 ~ -2^63
		//		literal 끝에 'L' 또는 'l'를 추가하여 long타입의 자료임을 나타내야함
	
		long l1=10000000000L;/*'L' 또는 'l'를 추가하지 않으면 int로 인식하여 오류남*/
		long l2=100000L;
	
	}
	
}
