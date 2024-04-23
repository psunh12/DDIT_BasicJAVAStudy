package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchStatementExample03 {
	public static void main(String[] args) {
		//수도요금을 계산하시오
		//사용량(톤단위)별 단가
		// 1-9 : 200
		// 10-19 : 250
		// 20-29 : 350
		// 30-39 : 500
		// 그 이상 : 750
		// 하수도 사용료 : 톤당 150원
		// 수도요금 = 사용량별 요금 + 하수도요금+ 물이용분담금(3000)
		// ex)26톤 사용시 : ((200*9)+(250*10)+(7*350))+(26*150)+3000=6750+3900+3000=13,650원
		SwitchStatement03 ss03 = new SwitchStatement03();
		ss03.inputAmount();
		
		
	
	}
}


//class Switch0Statement3{
//	int sum; // 전체 납부금액
//	
//	sum=150*water+3000;
//	
//	Scanner sc = new Scanner(System.in);
//	
//	public void Swith01() {
//		System.out.println("수도 사용량(톤)을 입력하세요:");
//		int water = sc.nextInt();
//		
//		switch (water/10) {
//		case 0:
//			
//			System.out.println(200*water + 150*water+3000);
//			break;
//		case 1:
//			System.out.println(200*9+ 250*water+ 150*water+3000);
//			break;
//		case 2:
//			System.out.println(200*9+ 250*10+350*water+ 150*water+3000);
//			break;
//		case 3:
//			System.out.println(200*9+ 250*10+350*10+500*water+ 150*water+3000);
//			break;
//			
//		default:
//			System.out.println(200*9+ 250*10+350*10+500*10+750*water+150*water+3000);
//		}
//		System.out.println("사용량:"+water+" ");
//	}
	
//}


class SwitchStatement03{
	int sum;
	Scanner sc = new Scanner(System.in);
	
	public void inputAmount() {
		System.out.println("수도사용량 : ");
		int amtWater = sc.nextInt();
		
		switch(amtWater/10) {
		case 0:
			sum = (amtWater*200)+(amtWater*150)+3000;
			break;
		case 1:
			sum = (200*9)+((amtWater-9)*250)+(amtWater*150)+3000;
			break;
		case 2:
			sum = (200*9)+(250*10)+((amtWater-19)*350)+(amtWater*150)+3000;
			break;
		case 3:
			sum = (200*9)+(250*10)+(350*10)+((amtWater-29)*500)+(amtWater*150)+3000;
			break;
		default:
			sum = (200*9)+(250*10)+(350*10)+(500*10)+((amtWater-39)*750)+(amtWater*150)+3000;
		}
		System.out.printf("수도사용량=%2d  수도요금 : %-6d원", amtWater,sum);
	}
}