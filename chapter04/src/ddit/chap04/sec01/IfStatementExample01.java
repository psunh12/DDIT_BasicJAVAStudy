package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {//��ġŬ����(����)

	public static void main(String[] args) {
		//(String[] args):�Ű�����, �Ķ����
		IfStatement01 ifstate01 = new IfStatement01();//���̶�� �����ϱ�
//		ifstate01.ifMethod01();
//		ifstate01.ifMethod02();
//		ifstate01.ifMethod03();
//		ifstate01.ifMethod04();
		ifstate01.ifMethod05();

	}

}

class IfStatement01{//��ĿŬ����?
	
	
	Scanner sc = new Scanner(System.in);
	//����ʵ�, �޼��� �ٱ��ʿ� sc�� �θ� Ŭ���� �ȿ��� ��� ����
	
	int score;//hip, ���� �������� �ʴ´�.
	//Ű����� ������ �Է� �޾� 60���̻��̸� "�հ��Դϴ�"�� ����Ͻÿ�
	public	void ifMethod01() {
		
		System.out.print("�����Է� : ");
		int score = sc.nextInt();
		if(score>59) { 
			System.out.println("�հ��Դϴ�");//��ɹ��� �����϶� �߰�ȣ ��������
		}
	
	}
	
	//Ű����� ������ �Է� �޾� 60���̻��̸� "�հ��Դϴ�"�� �� �̸��̸� "���հ��Դϴ�"�� ����Ͻÿ�
	public void ifMethod02() {
		System.out.println("�����Է� : ");
		
		score = sc.nextInt();//����, int ���� ���� score�� �ֱ⶧���� ������ �ȴ�. 
		if(score>59) { 
			System.out.println("�հ��Դϴ�");//��ɹ��� �����϶� �߰�ȣ ��������
		}else {
			System.out.println("���հ��Դϴ�");
		}
		
		//������ ����:�������� �ּҰ� �Ϲ��� ������:����������..
	}
	
	//�ۺ�:��𿡼� ������ ���Ű��, Ŭ���� ���� ���ٰ���. 
	//������Ƽ��:����,�ٸ� ��Ű������ �ִ� Ŭ�������� ���ٰ���,�� �ڽ�Ŭ������ �ٸ� ��Ű���� ������ ,
	//defalt:����Ŭ����,��Ű������ ������ ���ٰ���.
	//�����̺�:����Ŭ���������� ���� �����ϰ� ����� ���ٺҰ�
	
	//������:static:������
	//adstaract
	//final
	
	//��ȯŸ��:���� �ǵ��� �ٰ��� ������
	
	
	
	public void ifMethod03() {
		String grade ="";
		
		System.out.println("�����Է� : ");
		score = sc.nextInt();
		if(score>89) {
			grade ="A ����";
		}else if(score>79) {
			grade = "B ����";
		}else if(score>69) {
			grade = "C ����";
		}else if(score>59) {
			grade = "D ����";
		}else {
			grade="F ����";
		}
		System.out.println(score+"=>"+grade);
	}	
	//Ű����� ������ �Է¹޾�
	// 90 ~ 92 : "A- ����"
	// 93 ~ 96 : "A0 ����"
	// 97 ~ 100 : "A+ ����"
	// 80 ~ 82 : "B- ����"
	// 83 ~ 86 : "B0 ����"
	// 87 ~ 89 : "B+ ����"
	//�� ���ϸ� : "F ����"�� ����Ͻÿ�
	public void ifMethod04() {
		String grade ="";
		
		System.out.println("�����Է� : ");
		score = sc.nextInt();
		
		if(score>=90) {
			grade = "A";
			if(score>=97) {
				grade += "+ ����";
			}else if (score>=93) {
				grade += "0 ����";
			}else {
				grade += "- ����";
			}
			
			
			//���մ��Կ�����
			//���� = ���������� ������;
			//�� ������ ���ƾ���
			//���� ������ ������ �������� ���
 			//sum = sum + num => sum += num
			//sum = sum % 5 => sum %=5
			//sum = sum + cnt*3 =>sum +=(cnt*3)
			
		} if(score>=80) {
			grade = "B";
			if(score>=87) {
				grade += "+ ����";
			}else if (score>=83) {
				grade += "0 ����";
			}else {
				grade += "- ����";
			}
	
	}else {
		grade="F ����";
	}
		System.out.println(score +"=>"+grade);
	}
	
	//�⵵�� �Է¹޾� ����� ����� �����Ͽ� "xxxx���� �����Դϴ�.", "xxxx���� ����Դϴ�." 
	//����: �ش�⵵�� (4�ǹ���̸鼭 100�� ����� �ƴϰų�) )(400�� ���)�� �Ǵ� ��
	public void ifMethod05() {
		System.out.print("�⵵�� �Է��ϼ��� : ");
		int year=sc.nextInt();
		
		if ((year%4 == 0 && year%100 != 0)||(year%400 == 0)) {
			//�̸� ��ȣ �����! ((&&))||()
			
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		
	}
	
}