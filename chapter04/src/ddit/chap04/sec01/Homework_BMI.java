package ddit.chap04.sec01;

import java.util.Scanner;

public class Homework_BMI {

	/**
	 * ����3] Ű(M)�� ü��(KG)�� �Է� �޾� BMI ������ ����ϰ� �� ����
	0   ~   18.4   :   "��ü��"
	18.5 ~ 22.9 :   "����ü��"
	23.0 ~ 24.9 :   "��ü��"
	25.0 ~ 29.9 :   "��"
	30.0 �̻�        "����" �� ����ϴ� ���α׷� �ۼ�
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//BMI ���� = ������(kg)/(Ű(m)*Ű(m))
		
		System.out.println("Ű(m)�� �Է��ϼ���.");
		double height = sc.nextDouble();
		
		System.out.println("������(kg)�� �Է��ϼ���");
		double weight = sc.nextDouble();
		
		
		double bmi = weight/(height * height);
		
		
		if(bmi > 0 && bmi <18.5) {
			System.out.println("BMI : "+ bmi+" ��ü�� �Դϴ�.");
		}
		if(bmi > 18.4  && bmi <23.0) {
			System.out.println("BMI : "+ bmi+" ����ü�� �Դϴ�.");
		}
		if(bmi > 22.9  && bmi <25.0) {
			System.out.println("BMI : "+ bmi+" ��ü�� �Դϴ�.");
		}
		if(bmi > 24.9  && bmi <30.0) {
			System.out.println("BMI : "+ bmi+" �� �Դϴ�.");
		}
		if(bmi > 29.9) {
			System.out.println(("BMI : "+ bmi+" ���� �Դϴ�."));
		}
	}

}
