package ddit.chap05.sec02;
//�ֻ����� 50�� ������ ���� �� ���� ���� �׷���(������׷�)�� �ۼ��Ͻÿ�

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
	int[] dice=new int[6];//�ֻ��� ����  Ƚ�� ī��Ʈ �����ϴ� ����
	
	public void setDice() {// 1~6������ ������ ���� ���� �߻��� ������ �迭�� ����
		for(int i=0; i<50; i++) {//�ֻ��� 50�� ������. 0~49
			int r=(int)(Math.random()*6)+1;
			//0<=Math.random()<1
			//0<=Math.random()*6<6
			//1<=(Math.random()*6)+1<7 =>1~6������ �ֻ����� ���
			
			dice[r-1]++;//�������� ���� �� ����. ���� r=1�� ������ dice[0]�濡 ����ȴ�
		}
		System.out.println(Arrays.toString(dice));//�ֻ��� Ƚ�� ����� �迭 ���
	}
	public void showDiagram() {
		for(int i=0; i<dice.length;i++) {
			System.out.print((i+1)+"|");//0�̸� 1�Ǵ�,1�̸� 2�Ǵ�
			for(int j=0; j<dice[i];j++) {
				System.out.print("#");//�ֻ��� Ƚ�� ��ŭ#���� ���
			}
			System.out.println(dice[i]);
		}
	}
	
	public void changeDim() {//���帹�̳��� �� ���ϱ�
		int rowCount=getMaxValue();//���� ��
		char[][] histo=new char[rowCount][6];
		char[][] twoDimArr =setChar(histo);//setChar�� void�� Ȯ���� ����.
		printHistoGram(twoDimArr);
	}	
	public int getMaxValue() {
		int tmax=dice[0];
		for (int i=1; i<dice.length;i++) {
			if(tmax<dice[i]) tmax =dice[i];
		}
		return tmax;
	}
	//����� ch�� ����
	public char[][] setChar(char[][] histo) {//��ȯŸ�� ����
		for(int j=0;j<6;j++) {//major column method - ��÷��
			for(int i=0; i<dice[j]; i++) {//��÷��
				histo[i][j]= '#';
			}
		}
		return histo;
	}
	
	//�׷��� �Ųٷ� ���
	public void printHistoGram(char[][] twoDimArr) {
		
		
		System.out.println("\n\n\n        [[�ֻ��� ������]]");
		
		for(int i= twoDimArr.length-1;i>=0;i--){//1������
			
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