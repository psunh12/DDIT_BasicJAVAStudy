5package ddit.chap05.sec02;

import java.util.Arrays;

public class Homework_SungJuk {

	public static void main(String[] args) {
		SungJuk sung = new SungJuk();
		sung.calcScoreReport();
		sung.printScore();
	}

}

class SungJuk {
	int[][] score;
	String[] name;

	SungJuk() {// �����ڸ��� ����ʵ� �ʱ�ȭ. score, name �� �ʱ�ȭ �ߴ�
		score = new int[][] { { 80, 75, 80, 0, 0, 1 }, { 90, 85, 90, 0, 0, 1 }, { 90, 90, 80, 0, 0, 1 },
				{ 80, 70, 70, 0, 0, 1 }, { 70, 95, 70, 0, 0, 1 } };// ������ 0�� ������ ���, 1�� ������
		name = new String[] { "ȫ�浿", "������", "������", "������", "�̼���" };

	}

	public void calcScoreReport() {// ����, ���, ����
		for (int i = 0; i < score.length; i++) {// ���� ����
			for (int j = 0; j < 3; j++) {
				score[i][3] = score[i][3] + score[i][j];// ���ھ��� �� ���� 3���� �������ϱ�
			}
			score[i][4] = score[i][3] / 3;// ��� ����
		}

		// ��� �ο�
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3])
					score[i][5]++;// �ϳ��� ������ �迭�� ������ ��ü �� ��,
				Arrays.sort(score, (o1, o2) -> {
					return o2[4] - o1[4];

				});

			}
		}

	}

	public void printScore() {
		System.out.println("              [[  �� �� ǥ   ]]");
		System.out.println("-------------------------------------------");
		System.out.println("�̸�         ����      ���       ��ȸ      ����       ���        ����");
		System.out.println("-------------------------------------------");
		
		
		for (int i = 0; i < name.length; i++) {
			//System.out.print(name[i] + "   ");
			System.out.print(name[i] + "   ");
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);// 6ĭ ������ ����
			}
			System.out.println();
			

		}
	}
}


