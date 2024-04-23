package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayExample04 {

	public static void main(String[] args) {
		//로또번호 생성기
		Lotto lotto = new Lotto();//class Lotto가 실행됨
		Scanner sc=new Scanner(System.in);
		
		System.out.print("구매금액(1000원 단위) : ");
		int money = sc.nextInt();
		
		for(int i = 0; i < money/1000; i++) {
			int[] lnum = lotto.shuffle();//class의 int배열 가지고오기. shuffle 함수실행 
			System.out.print((i+1)*1000+"원 : ");
		
			for(int j=0; j<6; j++) {//로또번호 6개 출력
				System.out.printf("%5d",lnum[j]); //%d정수, %f:실수, %c:문자, %s:문자열 여기서는 정수 5칸 오른쪽 정렬
			}
			System.out.println();
		}
	}
}

class Lotto{
	int[] lottoNum;//int타입인 배열 lottoNum 선언
	
	Lotto(){
		//기본생성자 :모든 클래스는 생성자 메서드가 없으면 생성x
		//생성자 메서드의 목적:멤버필드 초기화
		
		lottoNum = new int[45];//배열길이
		for(int i = 0; i<lottoNum.length; i++) { //lottoNum 길이만큼 반복
			lottoNum[i]=i+1;//ex)lottoNum[0]=1 ~ 45 까지 반복
		}
	}
	
	//shuffle 방법
	//1. 0~44 사이의 난수를 발생
	//2. 배열의 0번째 요소와 난수번째 요소를 교환	
	int[] shuffle() {
		for(int i=0; i<1000000; i++) {//1000만번 섞기, 숫자가 커지면 출력할떄 늦어짐,while(true) 사용가능
			int r = (int)(Math.random()*lottoNum.length);
			//0<=Math.random()<1
			//0<=Math.random()*lottoNum.length<45(lottoNum.length)
			
			//자리바꿈. 임시기억공간에 저장.
			int temp= lottoNum[0];
			lottoNum[0] = lottoNum[r];
			lottoNum[r] = temp;
		}
		return lottoNum;
	}
}