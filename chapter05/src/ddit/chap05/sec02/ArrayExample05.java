package ddit.chap05.sec02;

public class ArrayExample05 {

	public static void main(String[] args) {
		SungJuk sung = new SungJuk();
		sung.calcScoreReport();
		sung.printScore();
		
	}

}


class SungJuk{
	int[][] score;//= new int[][] {{70,90,60},{80,95,70},{90,90,85}, {75,90,60},{75,95,65}};와 동일
	String[] name;
	
	
	SungJuk(){//생성자목적 멤버필드 초기화. score, name 을 초기화 했다
		score = new int[][] {{70,90,60,0,0,1},{80,95,70,0,0,1},{90,90,85,0,0,1}, {75,90,60,0,0,1},{75,95,75,0,0,1}};//빈값지정 0은 총점과 평균, 1은 등수계산
		name = new String[] {"홍길동", "정몽주", "박지원", "이순신", "강감찬"};
						
						
		}
	public void calcScoreReport() {//총점, 평균, 석차
		for(int i=0; i<score.length;i++){//행의 갯수
			for(int j=0; j<3;j++) {
				score[i][3]=score[i][3]+score[i][j];//스코어의 각 행의 3열의 총점구하기
			}
			score[i][4]=score[i][3]/3;//평균 들어가기
		}
		//등수 부여
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length;j++) {
				if(score[i][3]<score[j][3]) score[i][5]++;//하나의 값으로 배열을 지정해 전체 값 비교,
			}
		}
		
	}
	public void printScore() {
		System.out.println("              [[  성 적 표   ]]");
		System.out.println("-------------------------------------------");
		System.out.println("이름         국어      영어       수학      총점       평균        등수");
		System.out.println("-------------------------------------------");
		sortRecord();
		for(int i=0; i <name.length; i++) {
			System.out.print(name[i]+"   ");
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("%6d",score[i][j]);//6칸 오른쪽 정렬
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
//					score[j+1]=temp;//주소값만 변경
					
					String n=name[j];
					name[j]=name[j+1];
					name[j+1]=n;
				}
			}
		}
	}
}