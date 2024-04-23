package ddit.chap04.sec02;

public class Homework_20230911 {

	public static void main(String[] args) {
		HomeworkForState01 h1 = new HomeworkForState01();
		h1.ForState();
		
	}

}

//1-2+3-4....-10=? 의 결과를 출력하는 프로그램 작성
class HomeworkForState01 {
	void ForState() {
		int sum = 0;
		for(int i=1 ; i<11 ;i++ ) {
			
			if(i%2==0) 
			{
				System.out.print(-i);
				sum=sum-i;
			}
			else
			{
				System.out.print("+"+i);
				sum=sum+i;
			}
			
		}System.out.println("="+sum);
	}
}

