package ddit.chap10.sec03;

import java.util.Scanner;

//예외클래스 생성
//	class 클래스명 extends Exception[RuntimeException]{
//		    클래스명(){
//			super("예외메시지");
//		  }	
//	}

public class ExceptionExample4 {

	public static void main(S
			tring[] args) throws NickNameException{
		Scanner sc = new Scanner(System.in);
		System.out.print("별명 입력 :");
		String nickName = sc.nextLine();
		
		
		try {
		inputNickName(nickName);
		}catch(RuntimeException e) {
			System.out.println("금지어가 포함된 별명입력");
		}
//		if(nickName.equals("바보")) {
//			//강제예외발생
//			throw new NickNameException();
//			
//		}
			
	}
	public static void inputNickName(String nickName) {
		if(nickName.equals("바보")) {
			throw new NickNameException();
		}
		
	}
}




class NickNameException extends RuntimeException{
	NickNameException(){
		super("잘못된 별명입니다...");
	}
}