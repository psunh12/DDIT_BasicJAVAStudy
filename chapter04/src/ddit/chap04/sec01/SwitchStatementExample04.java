package ddit.chap04.sec01;

import java.util.Scanner;
//*���߽���ġ��
//Ű����� ������ �Է¹޾�
// 90 ~ 92 : "A- ����"
// 93 ~ 96 : "A0 ����"
// 97 ~ 100 : "A+ ����"
// 80 ~ 82 : "B- ����"
// 83 ~ 86 : "B0 ����"
// 87 ~ 89 : "B+ ����"
//�� ���ϸ� : "F ����"�� ����Ͻÿ�
public class SwitchStatementExample04 {

	public static void main(String[] args) {
		new SwitchStatementExample04().switchMethod();
	
	}
	
	public void switchMethod() {//static�� ���� new SwitchStatementExample04().switchMethod();�� ���� �ʾƵ� �ȴ�.// �޼��� �ϳ��� ����ϰڴٴ� �ǹ�
		Scanner sc =new Scanner(System.in);
		String grade ="";//���������� �ݵ�� �ʱ�ȭ �ؾ���
		
		
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
			grade="A+";
			break;
		case 9:
			grade ="A";
			switch(score%10) {
			case 7 : case 8: case 9:
				grade= grade+"+";
				break;
			case 3: case 4: case 5: case 6:
				grade= grade+"0";
				break;
			default:
				grade= grade+"-";
			}
			break;
			
		case 8:
			grade ="B";
			switch(score%10) {//������������ ���
			case 7 : case 8: case 9:
				grade= grade+"+";
				break;
			case 3: case 4: case 5: case 6:
				grade= grade+"0";
				break;
			default:
				grade= grade+"-";//0,1,2�� default�� ó����
				
			}
			break;
			
		default:
			grade="Fail";
		}
		System.out.println(score + "=>"+grade);
	}

}
