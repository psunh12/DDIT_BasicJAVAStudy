package ddit.chap07.sec02;

public class Iphone2 extends Iphone1 {// Phone 클래스를 상속한다면 재정의 해야함
	
	Iphone2(String owner, String phoneNum){
		super(owner, phoneNum);
	}
	public void fingerPrintRecog() {
		System.out.println("지문인식가능");
	}


}
