package ddit.chap07.sec01;

public class OfficeWorker extends Person {
	String workplace;
	String position;
	
	OfficeWorker(String name, int age, String workplace, String position){
		super(name, age);
		this.workplace=workplace;
		this.position=position;
	}
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("����� :"+workplace);
		System.out.println("����:"+position);
	}
}
