package ddit.chap02.sec02;

public class CharExample {

	public static void main(String[] args) {
		//char : 2byte
		//		  표현 범위 : 0~65535
		//		 byte => char 형으로 변환될 수 없음(char은 음수가 없음)
		//		 ' ' 안에 표현
		
		char alpha = 'a';
		
		System.out.println(alpha);
		System.out.println(alpha+1
				0);//a의 ASCII 코드 값 출력
		System.out.println((char)(alpha+10));//강제 형변환
		
		char ch1='대';//'대한민국'은 4글자라서 오류남
		System.out.println(ch1+0);//ch1의 ASCII 코드 값 출력
		
		System.out.println((int)'가');
		System.out.println((int)'힣');
		
		//'ABCD...Z' 출력
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
		}
		
	}

}
