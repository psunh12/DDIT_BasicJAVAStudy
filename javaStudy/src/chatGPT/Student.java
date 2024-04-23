package chatGPT;

public class Student extends Person {
	String StudID;

	Student(String name, int age, String StudID){
		super(name,age);
		this.StudID=StudID;
	}
	public String StudentInfo() {
		return"이름: "+name+"\n나이: "+age+"\n학번: "+StudID;
	}
}
