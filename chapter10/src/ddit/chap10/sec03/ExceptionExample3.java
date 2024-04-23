package ddit.chap10.sec03;

import java.util.Scanner;

//throw :예외 강제 발생
//		 - 일반 메서드 내부에 사용
//		 - 사용형식
//			throw 예외클래스 객체명
//				IOException ioexception = new IOException();
//			ex)	throw new Exception();
//				throw ioexception;
//				
//throws :예외 미루기
//			try ~ catch 블록을 예외발생 가능성이 있는 명령문이 기술된 곳에서 처리하지 않고
//			해당 메서드를 호출하는 곳에서 예외처리를 강요할 때 사용
//			(사용형식)
//			메서드명()	throws 예외클래스명[, 예외클래스명, ...]{
//				:
//			}
//			위 메서드를 호출하는 명령문은 반드시 try블록내부에 기술해야하고
//			catch블록은 throws다음에 기술한 모든 예외클래스들을 모두 처리해야함

public class ExceptionExample3 {
	static String[] name;

	public static void main(String[] args) {
		setArray();
		try {
			System.out.println("회원이름 : " + getArray());
		} catch (ArrayIndexOutOfBoundsException e) {
//		e.printStackTrace();
			System.out.println("배열첨자 오류가 발생되었음");
		}
		System.out.println("배열에 저장된 회원수를 체크하시오");
	}

	public static void setArray() {
		name = new String[] { "홍길동", "이순신", "강감찬", "이성계", "정몽주" };

	}

	public static String getArray() throws ArrayIndexOutOfBoundsException {// 예외발생 감수하라는 경고문.
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 회원의 순번입력 : ");
		int idx = sc.nextInt();

		return name[idx];

	}
}
