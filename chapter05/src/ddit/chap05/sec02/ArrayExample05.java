package ddit.chap05.sec02;

public class ArrayExample05 {

	public static void main(String[] args) {
		SungJuk sung = new SungJuk();
		sung.calcScoreReport();
		sung.printScore();
		
	}

}


class SungJuk{
	int[][] score;//= new int[][] {{70,90,60},{80,95,70},{90,90,85}, {75,90,60},{75,95,65}};�� ����
	String[] name;
	
	
	SungJuk(){//�����ڸ��� ����ʵ� �ʱ�ȭ. score, name �� �ʱ�ȭ �ߴ�
		score = new int[][] {{70,90,60,0,0,1},{80,95,70,0,0,1},{90,90,85,0,0,1}, {75,90,60,0,0,1},{75,95,75,0,0,1}};//������ 0�� ������ ���, 1�� ������
		name = new String[] {"ȫ�浿", "������", "������", "�̼���", "������"};
						
						
		}
	public void calcScoreReport() {//����, ���, ����
		for(int i=0; i<score.length;i++){//���� ����
			for(int j=0; j<3;j++) {
				score[i][3]=score[i][3]+score[i][j];//���ھ��� �� ���� 3���� �������ϱ�
			}
			score[i][4]=score[i][3]/3;//��� ����
		}
		//��� �ο�
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length;j++) {
				if(score[i][3]<score[j][3]) score[i][5]++;//�ϳ��� ������ �迭�� ������ ��ü �� ��,
			}
		}
		
	}
	public void printScore() {
		System.out.println("              [[  �� �� ǥ   ]]");
		System.out.println("-------------------------------------------");
		System.out.println("�̸�         ����      ����       ����      ����       ���        ���");
		System.out.println("-------------------------------------------");
		sortRecord();
		for(int i=0; i <name.length; i++) {
			System.out.print(name[i]+"   ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d",score[i][j]);//6ĭ ������ ����
			}
			System.out.println();	
		}
		System.out.println("-------------------------------------------");
	}
	
	public void sortRecord() {
		for(int i=0; i<score.length-1;i++) {
			for(int j=0; j<score.length-1;j++) {
				if(score[j][3]<score[j+1][3]) {
					for(int k=0; k<score[i].length;k++) {
						int tem = score[j][k];
						score[j][k]=score[j+1][k];
						score[j+1][k]=tem;
					}
//					int[] temp=score[j];
//					score[j]=score[j+1];
//					score[j+1]=temp;//�ּҰ��� ����
					
					String n=name[j];
					name[j]=name[j+1];
					name[j+1]=n;
				}
			}
		}
	}
}