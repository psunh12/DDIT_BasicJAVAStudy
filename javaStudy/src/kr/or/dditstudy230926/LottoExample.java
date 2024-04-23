package kr.or.dditstudy230926;

import java.util.Arrays;

public class LottoExample {
	public static void main(String[] args) {
		LottoExample obj=new LottoExample();
		int lottoPaper[][] = obj.buyLottoPaper();
		System.out.println();
	}
	//3�常 ���
	public int[][] buyLottoPaper(int num){
		int[][] lottoPaper = new int[num][6];
		for(int i =0; i<lottoPaper.length;i++) {
			lottoPaper[i]=generateLotto();
		}
		return lottoPaper;
	}
	
//	//5�弼Ʈ
//	public int[][] buyLottoPaper(){
//		//�������迭 ����
//		
//		int[][] lottoPaper = new int[5][6];
//		//generateLotto �ҷ��ͼ� ȣ��
//		for(int i=0; i<lottoPaper.length;i++) {
//			lottoPaper[i] = generateLotto();
//		}
//		//ȣ��� ���� �迭�� ����
//		return lottoPaper;
//	}
//	
	
	//�ڵ��ߺ� ����
	public int[][] buyLottoPaper(){
		return buyLottoPaper(5);
	}
	

	public int[] generateLotto() {
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			// �迭������.
			int ran = (int) (Math.random() * 45) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				// �迭 �� �񱳸� ���� �������� �ִٸ� �ٽ� �ݺ�
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
//		for(int i=0;i<lotto.length;i++) {
//			for(int j=0; j<lotto.length;j++) {
//				
//				if(lotto[i]>lotto[j]) {
//					int temp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = temp;
//					System.out.println();
//			}
//		}
//	}
		
		Arrays.sort(lotto);//�������İ� ����
		return lotto;

		
		
	}

}
