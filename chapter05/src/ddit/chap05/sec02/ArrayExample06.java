package ddit.chap05.sec02;
//주사위를 50번 던져서 나온 각 눈의 수로 그래프(히스토그램)를 작성하시오

import java.util.Arrays;

public class ArrayExample06 {

	public static void main(String[] args) {
		Dice d = new Dice();
		d.setDice();
		d.showDiagram();
		//d.changeDim();

	}

}

class Dice{
	int[] dice=new int[6];//주사위 눈별  횟수 카운트 저장하는 공간
	
	public void setDice() {// 1~6사이의 정수형 난수 눈이 발생된 갯수를 배열에 저장
		for(int i=0; i<50; i++) {//주사위 50번 굴리기. 0~49
			int r=(int)(Math.random()*6)+1;
			//0<=Math.random()<1
			//0<=Math.random()*6<6
			//1<=(Math.random()*6)+1<7 =>1~6까지의 주사위값 출력
			
			dice[r-1]++;//랜덤으로 나온 값 저장. 만약 r=1이 나오면 dice[0]방에 저장된다
		}
		System.out.println(Arrays.toString(dice));//주사위 횟수 저장된 배열 출력
	}
	public void showDiagram() {
		for(int i=0; i<dice.length;i++) {
			System.out.print((i+1)+"|");//0이면 1의눈,1이면 2의눈
			for(int j=0; j<dice[i];j++) {
				System.out.print("#");//주사위 횟수 만큼#으로 출력
			}
			System.out.println(dice[i]);
		}
	}
	
	public void changeDim() {//가장많이나온 값 구하기
		int rowCount=getMaxValue();//행의 수
		char[][] histo=new char[rowCount][6];
		char[][] twoDimArr =setChar(histo);//setChar은 void일 확률이 높다.
		printHistoGram(twoDimArr);
	}	
	public int getMaxValue() {
		int tmax=dice[0];
		for (int i=1; i<dice.length;i++) {
			if(tmax<dice[i]) tmax =dice[i];
		}
		return tmax;
	}
	//출력할 ch값 지정
	public char[][] setChar(char[][] histo) {//반환타입 지정
		for(int j=0;j<6;j++) {//major column method - 열첨자
			for(int i=0; i<dice[j]; i++) {//행첨자
				histo[i][j]= '#';
			}
		}
		return histo;
	}
	
	//그래프 거꾸로 찍기
	public void printHistoGram(char[][] twoDimArr) {
		
		
		System.out.println("\n\n\n        [[주사위 실험결과]]");
		
		for(int i= twoDimArr.length-1;i>=0;i--){//1씩감소
			
			if((i+1)%5==0) {
				System.out.printf("%-3d",(i+1));
			}else {
				System.out.print("|  ");
			}
			for(int j=0; j<twoDimArr[i].length;j++) {
				System.out.print(twoDimArr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		System.out.println("   1    2       3       4       5       6");
	}
}