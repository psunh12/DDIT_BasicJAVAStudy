package ddit.chap06.sec01_hw6;

public class StudentExample {

	public static void main(String[] args) {
		Student st1 = new Student("경영학과",23001);
		
		System.out.println(st1);
		st1.setStdID(22011);
		System.out.println(st1);
//		System.out.println("학번 : "+st1.getStdID());
	}

}
