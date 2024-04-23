package ddit.chap06.sec01_hw6;

public class Student {
	private String department;
	private int stdID;
	
	Student(String department, int stdID){
		this.department=department;
		this.stdID=stdID;
	}
	//getter 메서드는 매개변수가 없고 반환타입과 리턴명령만 있음!
	//해당 멤버필드의 값을 밖으로 꺼낸다 
	//setter 메서드는 반환타입 없고 할당타입으로 
	//매개변수로 받은값을 멤버필드 값으로 세팅
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	
	@Override
	public String toString() {
		return "학과 : "+department+"\n학번 : "+stdID;
	}
}
