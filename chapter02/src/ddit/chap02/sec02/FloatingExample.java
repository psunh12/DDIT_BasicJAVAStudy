package ddit.chap02.sec02;

public class FloatingExample {

	public static void main(String[] args) {
		FloatingExample fe=new FloatingExample();
		//fe.floatMethod();
		fe.doubleMethod();
		
	}
	
	void floatMethod() {
		//float : 4byte(부호(1bit), 지수(8bit), 가수(23bit)
		//		    표현범위 : 1.4e-45 ~ 3.4e+38
		//		  literal끝에 'F'나 'f' 추가해야함
		
		float pi=3.1415926f;
		
		int sum = 245;
		float avg=sum/3f;//f 안 넣으면 값 81.0 으로 나옴
		
		System.out.printf("평균 : %6.2f",avg);//소수 둘째자리까지 표시.
		
		
		/* byte < char, short < int < long < float < double */
		/* 수식에서 int 보다 작은 타입의 자료는 int로 변환됨. (byte, char, short) */
	}
	void doubleMethod() {
		//double : 8 byte(부호(1bit), 지수(11bit), 가수(52bit)
		//		     표현범위 : 4.9e-324 ~ 1.8e+308
		//		     기본실수형
		//		  literal 끝에 'D', 'd', 생략
		
		double d1=0.1;
		double d2=0.1D;
		
		float f1=0.1f; //double d1과는 다른값
		d2=f1;//f1 double 값을 가지게 됨.
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		
		if(d1==f1) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		
	}
}
