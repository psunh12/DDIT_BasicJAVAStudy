package ddit.chap02.sec03;

public class CaseExample01 {

	public static void main(String[] args) {
		//cast : 강제형변환
		//		 cast연산자[(타입)] 필요
		
		byte b1=10;
		short s1=100;
		
		short res=(short)(s1+b1);//s1+b1 오류, s1+(short)b1 오류 =>int로 바뀌기 때문!
		
		double d1 =34.56789;//소숫점 2자리에서 반올림
		d1=d1*10;
		System.out.println(d1);
		
		d1=d1+0.5;
		System.out.println(d1);
		
		int result=(int)d1;
		System.out.println(result);
		
		d1=(double)result/10;
		System.out.println(d1);
		/*그냥하면 정수연산자로 34.0으로 출력됨. 강제 형변환을 사용하여 34.6을 출력*/
	}
	

}
