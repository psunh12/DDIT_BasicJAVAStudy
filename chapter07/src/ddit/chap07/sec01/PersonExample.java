package ddit.chap07.sec01;

public class PersonExample {

	public static void main(String[] args) {
		Student s1=new Student("박목월",35,"오류초교");
		System.out.println(s1.age);
		System.out.println(s1.schoolName);
		
		
		s1.printInfo();
		
	}

}
