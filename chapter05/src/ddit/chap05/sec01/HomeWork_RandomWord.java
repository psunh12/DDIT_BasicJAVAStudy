package ddit.chap05.sec01;

import java.util.Scanner;

public class HomeWork_RandomWord {
	// 1.������ �ε��� ����
	// 2.�ε��� str[r]
	// 3.char ������ �迭 �� �ܾ �ֱ�
	
	public static void main(String[] args) {
		String [] word = { "peach", "cherry", "lemon", "grape", "orange"}; //�迭 ����
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<word.length;i++) {//word �迭 ���̸�ŭ �ݺ�
			
			char[] game =word[i].toCharArray(); //���ڹ迭���
			
			for(int j=0; j<game.length; j++) {
				int r = (int) (Math.random() * game.length);
				//0<=Math.random()<1
				//0<=Math.random() * game.length<5(game.length)
				
				//����
				char temp = game[r];
				game[r] = game[j];
				game[j] = temp;
		
			}
		
		
		System.out.printf("����%d.%s�� ���� �Է��ϼ���.",i+1,new String(game));//���� 1,2...�� ���δܾ� ��� 
		String answer=sc.nextLine();
		
		if(word[i].equals(answer)) {
			System.out.println("�����Դϴ�.");
			
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		}
	}
}