package ddit.chap04.sec01;

import java.util.Scanner;
//*다중스위치문
//키보드로 점수를 입력받아
// 90 ~ 92 : "A- 학점"
// 93 ~ 96 : "A0 학점"
// 97 ~ 100 : "A+ 학점"
// 80 ~ 82 : "B- 학점"
// 83 ~ 86 : "B0 학점"
// 87 ~ 89 : "B+ 학점"
//그 이하면 : "F 학점"을 출력하시오
public class SwitchStatementExample04 {

	public static void main(String[] args) {
		new SwitchStatementExample04().switchMethod();
	
	}
	
	public void switchMethod() {//static을 쓰면 new SwitchStatementExample04().switchMethod();을 쓰지 않아도 된다.// 메서드 하나만 사용하겠다는 의미
		Scanner sc =new Scanner(System.in);
		String grade ="";//지역변수는 반드시 초기화 해야함
		
		
		System.out.print("점수입력 : ");
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
			switch(score%10) {//나머지식으로 계산
			case 7 : case 8: case 9:
				grade= grade+"+";
				break;
			case 3: case 4: case 5: case 6:
				grade= grade+"0";
				break;
			default:
				grade= grade+"-";//0,1,2는 default로 처리함
				
			}
			break;
			
		default:
			grade="Fail";
		}
		System.out.println(score + "=>"+grade);
	}

}
