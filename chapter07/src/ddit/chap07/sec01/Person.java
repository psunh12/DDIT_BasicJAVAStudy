package ddit.chap07.sec01;

public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	void printInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}

}
