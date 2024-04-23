package ddit.chap07.sec04;

public class HumanExample {
	
	public static void main(String[] args) {
		Human h1= new Female("이쁜이",25,"sw개발자");//업캐스트
		System.out.println("이름 : "+h1.name);
		//h1.setJob("전업주부");
		h1.printInfo();//다형성
		
	}

}
