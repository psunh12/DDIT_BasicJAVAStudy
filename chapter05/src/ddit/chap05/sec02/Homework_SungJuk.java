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

	SungJuk() {// 생성자목적 멤버필드 초기화. score, name 을 초기화 했다
		score = new int[][] { { 80, 75, 80, 0, 0, 1 }, { 90, 85, 90, 0, 0, 1 }, { 90, 90, 80, 0, 0, 1 },
				{ 80, 70, 70, 0, 0, 1 }, { 70, 95, 70, 0, 0, 1 } };// 빈값지정 0은 총점과 평균, 1은 등수계산
		name = new String[] { "홍길동", "정몽주", "강감찬", "김유신", "이순신" };

	}

	public void calcScoreReport() {// 총점, 평균, 석차
		for (int i = 0; i < score.length; i++) {// 행의 갯수
			for (int j = 0; j < 3; j++) {
				score[i][3] = score[i][3] + score[i][j];// 스코어의 각 행의 3열의 총점구하기
			}
			score[i][4] = score[i][3] / 3;// 평균 들어가기
		}

		// 등수 부여
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] < score[j][3])
					score[i][5]++;// 하나의 값으로 배열을 지정해 전체 값 비교,
				Arrays.sort(score, (o1, o2) -> {
					return o2[4] - o1[4];

				});

			}
		}

	}

	public void printScore() {
		System.out.println("              [[  성 적 표   ]]");
		System.out.println("-------------------------------------------");
		System.out.println("이름         국어      산수       사회      총점       평균        석차");
		System.out.println("-------------------------------------------");
		
		
		for (int i = 0; i < name.length; i++) {
			//System.out.print(name[i] + "   ");
			System.out.print(name[i] + "   ");
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%6d", score[i][j]);// 6칸 오른쪽 정렬
			}
			System.out.println();
			

		}
	}
}


