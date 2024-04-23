package ddit.chap05.sec02;
//최대/최소값을 구하기
//최대값을 구하기 위해 공간하나 만듬
public class ArrayExample07 {

	public static void main(String[] args) {
		int[] num = {23, 41, 15, 60, 39, 52, 12};
		//최대값
		int tmax=num[0];//임시 최고값은 배열의 첫값
		int tmin=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(tmax<num[i]) tmax=num[i];
			if(tmin>num[i]) tmin=num[i];
			
		}
		System.out.println("최대값:"+tmax);
		System.out.println("최소값:"+tmin);
	
	
	
	
	
	
	}

}
