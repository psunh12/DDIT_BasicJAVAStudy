package ddit.chap06.sec01_hw;

public class Grade {
	int[] score;
	Grade(int[]score){ 
		this.score=score;
	}
	
	public void printScore() {
		int tot =0;
		for (int i=0;i<score.length;i++) {
			tot+=score[i];
		}
		System.out.println("����"+tot);
		System.out.println("���"+(double)tot/3);
		
	}

}
