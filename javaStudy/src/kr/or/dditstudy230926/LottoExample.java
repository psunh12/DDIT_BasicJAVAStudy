package kr.or.dditstudy230926;

import java.util.Arrays;

public class LottoExample {
	public static void main(String[] args) {
		LottoExample obj=new LottoExample();
		int lottoPaper[][] = obj.buyLottoPaper();
		System.out.println();
	}
	//3장만 사기
	public int[][] buyLottoPaper(int num){
		int[][] lottoPaper = new int[num][6];
		for(int i =0; i<lottoPaper.length;i++) {
			lottoPaper[i]=generateLotto();
		}
		return lottoPaper;
	}
	
//	//5장세트
//	public int[][] buyLottoPaper(){
//		//이차원배열 선언
//		
//		int[][] lottoPaper = new int[5][6];
//		//generateLotto 불러와서 호출
//		for(int i=0; i<lottoPaper.length;i++) {
//			lottoPaper[i] = generateLotto();
//		}
//		//호출된 값을 배열에 저장
//		return lottoPaper;
//	}
//	
	
	//코드중복 방지
	public int[][] buyLottoPaper(){
		return buyLottoPaper(5);
	}
	

	public int[] generateLotto() {
		int lotto[] = new int[6];
		for (int i = 0; i < 6; i++) {
			// 배열값저장.
			int ran = (int) (Math.random() * 45) + 1;
			lotto[i] = ran;
			for (int j = 0; j < i; j++) {
				// 배열 값 비교를 통해 같은것이 있다면 다시 반복
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
		
		Arrays.sort(lotto);//버블정렬과 같다
		return lotto;

		
		
	}

}
