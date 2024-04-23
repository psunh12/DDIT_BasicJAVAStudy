package ddit.chap04.sec01;

import java.util.Scanner;

public class Homework_BMI {

	/**
	 * 문제3] 키(M)와 체중(KG)을 입력 받아 BMI 지수를 계산하고 그 값이
	0   ~   18.4   :   "저체중"
	18.5 ~ 22.9 :   "정상체중"
	23.0 ~ 24.9 :   "과체중"
	25.0 ~ 29.9 :   "비만"
	30.0 이상        "고도비만" 을 출력하는 프로그램 작성
	 */
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//BMI 지수 = 몸무게(kg)/(키(m)*키(m))
		
		System.out.println("키(m)를 입력하세요.");
		double height = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력하세요");
		double weight = sc.nextDouble();
		
		
		double bmi = weight/(height * height);
		
		
		if(bmi > 0 && bmi <18.5) {
			System.out.println("BMI : "+ bmi+" 저체중 입니다.");
		}
		if(bmi > 18.4  && bmi <23.0) {
			System.out.println("BMI : "+ bmi+" 정상체중 입니다.");
		}
		if(bmi > 22.9  && bmi <25.0) {
			System.out.println("BMI : "+ bmi+" 과체중 입니다.");
		}
		if(bmi > 24.9  && bmi <30.0) {
			System.out.println("BMI : "+ bmi+" 비만 입니다.");
		}
		if(bmi > 29.9) {
			System.out.println(("BMI : "+ bmi+" 고도비만 입니다."));
		}
	}

}
