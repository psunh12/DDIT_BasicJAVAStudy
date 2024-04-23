package ddit.chap05.sec01;

import java.util.Scanner;

public class HomeWork_RandomWord {
	// 1.랜덤한 인덱스 생성
	// 2.인덱스 str[r]
	// 3.char 형식의 배열 한 단어씩 넣기
	
	public static void main(String[] args) {
		String [] word = { "peach", "cherry", "lemon", "grape", "orange"}; //배열 생성
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<word.length;i++) {//word 배열 길이만큼 반복
			
			char[] game =word[i].toCharArray(); //문자배열출력
			
			for(int j=0; j<game.length; j++) {
				int r = (int) (Math.random() * game.length);
				//0<=Math.random()<1
				//0<=Math.random() * game.length<5(game.length)
				
				//섞기
				char temp = game[r];
				game[r] = game[j];
				game[j] = temp;
		
			}
		
		
		System.out.printf("문제%d.%s의 답을 입력하세요.",i+1,new String(game));//문제 1,2...와 섞인단어 출력 
		String answer=sc.nextLine();
		
		if(word[i].equals(answer)) {
			System.out.println("정답입니다.");
			
		}else {
			System.out.println("오답입니다.");
		}
		
		}
	}
}