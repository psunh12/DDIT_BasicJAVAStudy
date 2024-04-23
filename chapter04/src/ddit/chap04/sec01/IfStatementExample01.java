package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {//코치클래스(마부)

	public static void main(String[] args) {
		//(String[] args):매개변수, 파라미터
		IfStatement01 ifstate01 = new IfStatement01();//집이라고 생각하기
//		ifstate01.ifMethod01();
//		ifstate01.ifMethod02();
//		ifstate01.ifMethod03();
//		ifstate01.ifMethod04();
		ifstate01.ifMethod05();

	}

}

class IfStatement01{//워커클래스?
	
	
	Scanner sc = new Scanner(System.in);
	//멤버필드, 메서드 바깥쪽에 sc를 두면 클래스 안에서 사용 가능
	
	int score;//hip, 절때 없어지지 않는다.
	//키보드로 점수를 입력 받아 60점이상이면 "합격입니다"를 출력하시오
	public	void ifMethod01() {
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		if(score>59) { 
			System.out.println("합격입니다");//명령문이 한줄일때 중괄호 생략가능
		}
	
	}
	
	//키보드로 점수를 입력 받아 60점이상이면 "합격입니다"를 그 미만이면 "불합격입니다"를 출력하시오
	public void ifMethod02() {
		System.out.println("점수입력 : ");
		
		score = sc.nextInt();//스택, int 빼도 힙에 score가 있기때문에 오류가 안님. 
		if(score>59) { 
			System.out.println("합격입니다");//명령문이 한줄일때 중괄호 생략가능
		}else {
			System.out.println("불합격입니다");
		}
		
		//참조형 변수:참조형은 주소값 일반형 차이점:실제데이터..
	}
	
	//퍼블릭:어디에서 누구나 어떤패키지, 클래스 전부 접근가능. 
	//프로텍티드:같은,다른 패키지내에 있는 클래스에서 접근가능,내 자식클래스가 다른 패키지에 있을때 ,
	//defalt:같은클래스,패키지에만 있을때 접근가능.
	//프라이빗:같은클래스에서만 접근 가능하고 벗어나면 접근불가
	
	//제한자:static:정적인
	//adstaract
	//final
	
	//반환타입:값을 되돌려 줄건지 말건지
	
	
	
	public void ifMethod03() {
		String grade ="";
		
		System.out.println("점수입력 : ");
		score = sc.nextInt();
		if(score>89) {
			grade ="A 학점";
		}else if(score>79) {
			grade = "B 학점";
		}else if(score>69) {
			grade = "C 학점";
		}else if(score>59) {
			grade = "D 학점";
		}else {
			grade="F 학점";
		}
		System.out.println(score+"=>"+grade);
	}	
	//키보드로 점수를 입력받아
	// 90 ~ 92 : "A- 학점"
	// 93 ~ 96 : "A0 학점"
	// 97 ~ 100 : "A+ 학점"
	// 80 ~ 82 : "B- 학점"
	// 83 ~ 86 : "B0 학점"
	// 87 ~ 89 : "B+ 학점"
	//그 이하면 : "F 학점"을 출력하시오
	public void ifMethod04() {
		String grade ="";
		
		System.out.println("점수입력 : ");
		score = sc.nextInt();
		
		if(score>=90) {
			grade = "A";
			if(score>=97) {
				grade += "+ 학점";
			}else if (score>=93) {
				grade += "0 학점";
			}else {
				grade += "- 학점";
			}
			
			
			//결합대입연산자
			//변수 = 변수연산자 데이터;
			//두 변수가 같아야함
			//변수 연산자 데이터 형식으로 사용
 			//sum = sum + num => sum += num
			//sum = sum % 5 => sum %=5
			//sum = sum + cnt*3 =>sum +=(cnt*3)
			
		} if(score>=80) {
			grade = "B";
			if(score>=87) {
				grade += "+ 학점";
			}else if (score>=83) {
				grade += "0 학점";
			}else {
				grade += "- 학점";
			}
	
	}else {
		grade="F 학점";
	}
		System.out.println(score +"=>"+grade);
	}
	
	//년도를 입력받아 윤년과 평년을 구별하여 "xxxx년은 윤년입니다.", "xxxx년은 평년입니다." 
	//윤년: 해당년도가 (4의배수이면서 100의 배수가 아니거나) )(400의 배수)가 되는 해
	public void ifMethod05() {
		System.out.print("년도를 입력하세요 : ");
		int year=sc.nextInt();
		
		if ((year%4 == 0 && year%100 != 0)||(year%400 == 0)) {
			//미리 괄호 만들기! ((&&))||()
			
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year+"년은 평년입니다.");
		}
		
	}
	
}