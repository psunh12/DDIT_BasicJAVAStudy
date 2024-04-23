package ddit.chapr03.sec02;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		//클래스 객체생성
		//클래스명 객체변수명=new 클래스명();
		UnaryOperator oper = new UnaryOperator();//oper을 이용하여 하단 class를 사용할 수 있음
//		oper.incrementOperator();//사용가능한건 초록색 변수 세모, arg 매개변수,파라미터-object 소유자
		oper.complementMethod();
		
		
	}

}


//클래스 한 파일에 사용하는 방법
class UnaryOperator{
		
	public void incrementOperator() {
		//증가 연산자 : ++
		//	단항연산자, 변수의 값을 1씩 증가
		//	++변수 : 전위식 표기법(prefix) - '변수' 자신은 1 증가된 값을 가지고
		//			증가된 값을 반환(증가가 일어나고 배정이 일어남)
		//	변수++ : 후위식 표기법(postfix) - '변수' 자신은 1 증가된 값을 가지고
		//			증가되기 전 값을 반환(배정이 일어나고 증가가 일어남)
		
//		int[] num = {10,20,30,40,50};
//		
//		int j = 4;
//		System.out.println(num[j++]);//j는 5가 되지만 실행후 증가되기 때문에 4번방의 값을 가지고옴!
//		System.out.println(num[++j]);=>오류! 5번방의 값을 가지고 와야하는데 5번방이 없음
		
		int i =10;
		
		//i++;
		++i;
		System.out.println("i="+i);
		
		i=10;
		//int res = i++; 실행 후 1증가
		int res = ++i;//먼저 자기자신이 1증가 된 후 실행함
		System.out.println("i="+i);
		System.out.println("res="+res);

		
	}
		public void complementMethod() {
			// ~ : 1의 보수 연산자
			int val=15;//va1의 1의 보수 -16
			System.out.println("val="+val);
			
			int val1 = ~ val;
			System.out.println("val의 1의 보수 = "+val1);
		}
}