package ddit.chap10.sec03;

import java.util.Scanner;

//����Ŭ���� ����
//	class Ŭ������ extends Exception[RuntimeException]{
//		    Ŭ������(){
//			super("���ܸ޽���");
//		  }	
//	}

public class ExceptionExample4 {

	public static void main(S
			tring[] args) throws NickNameException{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		String nickName = sc.nextLine();
		
		
		try {
		inputNickName(nickName);
		}catch(RuntimeException e) {
			System.out.println("����� ���Ե� �����Է�");
		}
//		if(nickName.equals("�ٺ�")) {
//			//�������ܹ߻�
//			throw new NickNameException();
//			
//		}
			
	}
	public static void inputNickName(String nickName) {
		if(nickName.equals("�ٺ�")) {
			throw new NickNameException();
		}
		
	}
}




class NickNameException extends RuntimeException{
	NickNameException(){
		super("�߸��� �����Դϴ�...");
	}
}