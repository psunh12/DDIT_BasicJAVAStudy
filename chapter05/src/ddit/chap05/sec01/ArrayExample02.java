package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample02 {

	public static void main(String[] args) {
		Sort sort= new Sort();
//		sort.bubbleSort();
		sort.selectionSort();
		
		
		
		
	}

}

class Sort{
	int[] num = {27, 15, 92, 36, 47, 65, 70}; //멤버필드. 클래스 안에서 모두 사용 가능
	int [] source=num.clone();//정렬전 자료가 같게 됨.
	boolean f;
	
	
	public void bubbleSort() {
		System.out.println("정렬 전 : "+ Arrays.toString(num));//array가 포함되어있는 문을 출력
		for (int i=0; i <=num.length-1; i++) {
			System.out.printf("%3d,",num[i]);
		}//Arrays를 사용하지 않고 배열값을 출력
		
		for(int i=0; i <=num.length-1; i++) {//회전수
			f = true;
			for(int j=0; j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];//자리바꿈. 임시기억공간에 저장.
					num[j] = num[j+1];
					num[j+1]=temp;//자리바꿈
					f= false;
				}
			}
			if(f) {
				
			
			System.out.println("최종 회전 수 : "+(i+1));
			break;
			}
		}
		System.out.println("정렬 후 : "+ Arrays.toString(num));
	}

	public void selectionSort() {
		
		
		
	}
	public void getNum() {
		System.out.println("\n정렬 전 "+ Arrays.toString(num));//array가 포함되어있는 문을 출력
		for (int i=0; i <=num.length-1; i++) {
			System.out.printf("%3d,",num[i]);
		
		}
		for(int i= 0; i <source.length-1; i++) {
			for(int j = i+1; j < source.length; j++) {
				if(source[i]>source[j]) {
					int temp = source[i];
					source[i]=source[j];
					source[j]=temp;
						
				}
			}
		}
		System.out.print("\n정렬 후 ");
		for (int i=0; i <=num.length-1; i++) {
			System.out.printf("%3d,",num[i]);
	}
}
}

	


