package ddit.chap07.sec06_hw4;

public class C extends A{
	
	int multiple;
	
	C(){
		super();
		this.multiple=multiple;
		
		for(a = 1; a<=200; a++) {
			sum +=a;
		}
		minus=sum-200;
		
		for(a=1;a<=20;a++) {
			multiple= sum*a;
		}
	}
	public void printInfo() {
		System.out.println("1~200������ ��: "+sum+"\n1~200������ �� -200: "+minus+"\n1~20���� ��: "+multiple);
	}

}
