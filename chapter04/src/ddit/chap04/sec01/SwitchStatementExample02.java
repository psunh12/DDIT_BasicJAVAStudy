package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample02 {

	public static void main(String[] args) {
		//Ű����� 0~100�� ������ ������ �Է¹޾�
		//100~90 : "�ſ���"
		//80~89 : "���"
		//70~79 : "����"
		//60~69 : "����"
		//59�� ���� : "�ſ����"
		
		SwitchStatement02 ss02 = new SwitchStatement02();
		ss02.inputScore();
	}

}

class SwitchStatement02{
	String grade;//Ŭ���� ����. �ʱⰪ null, (������ ������ �ʱⰪ�� null��!)
	Scanner sc = Scanner(System.in);
	
	public void inputScore() {
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
		
		switch(score/10) {//�������� ���� ��� ����!
		case 10:
		case 9:	
			grade = "�ſ���";
			break;
		case 8:	
			grade = "���";
			break;
		case 7:	
			grade = "����";
			break;
		case 6:	
			grade = "����";
			break;
		default :	
			grade = "�ſ����";
		}
		
		System.out.println(score+"=>"+grade);
	}
	
}