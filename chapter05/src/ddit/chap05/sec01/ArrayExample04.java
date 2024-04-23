package ddit.chap05.sec01;

import java.util.Scanner;

public class ArrayExample04 {

	public static void main(String[] args) {
		//�ζǹ�ȣ ������
		Lotto lotto = new Lotto();//class Lotto�� �����
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���űݾ�(1000�� ����) : ");
		int money = sc.nextInt();
		
		for(int i = 0; i < money/1000; i++) {
			int[] lnum = lotto.shuffle();//class�� int�迭 ���������. shuffle �Լ����� 
			System.out.print((i+1)*1000+"�� : ");
		
			for(int j=0; j<6; j++) {//�ζǹ�ȣ 6�� ���
				System.out.printf("%5d",lnum[j]); //%d����, %f:�Ǽ�, %c:����, %s:���ڿ� ���⼭�� ���� 5ĭ ������ ����
			}
			System.out.println();
		}
	}
}

class Lotto{
	int[] lottoNum;//intŸ���� �迭 lottoNum ����
	
	Lotto(){
		//�⺻������ :��� Ŭ������ ������ �޼��尡 ������ ����x
		//������ �޼����� ����:����ʵ� �ʱ�ȭ
		
		lottoNum = new int[45];//�迭����
		for(int i = 0; i<lottoNum.length; i++) { //lottoNum ���̸�ŭ �ݺ�
			lottoNum[i]=i+1;//ex)lottoNum[0]=1 ~ 45 ���� �ݺ�
		}
	}
	
	//shuffle ���
	//1. 0~44 ������ ������ �߻�
	//2. �迭�� 0��° ��ҿ� ������° ��Ҹ� ��ȯ	
	int[] shuffle() {
		for(int i=0; i<1000000; i++) {//1000���� ����, ���ڰ� Ŀ���� ����ҋ� �ʾ���,while(true) ��밡��
			int r = (int)(Math.random()*lottoNum.length);
			//0<=Math.random()<1
			//0<=Math.random()*lottoNum.length<45(lottoNum.length)
			
			//�ڸ��ٲ�. �ӽñ������� ����.
			int temp= lottoNum[0];
			lottoNum[0] = lottoNum[r];
			lottoNum[r] = temp;
		}
		return lottoNum;
	}
}