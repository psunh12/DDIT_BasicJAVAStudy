package ddit.chap07.sec06_hw4;
//1~100까지의 합
public class B extends A{
	
	
	B(){
		super();
		
		for (a = 1; a <= 100; a++) {
			sum += a;
		}		
		
	}
	public void printInfo() {
		System.out.println("1~100까지의 합: "+sum);
	}	

}
