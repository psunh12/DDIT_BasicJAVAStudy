package ddit.chap06.sec01_hw6;

public class Student {
	private String department;
	private int stdID;
	
	Student(String department, int stdID){
		this.department=department;
		this.stdID=stdID;
	}
	//getter �޼���� �Ű������� ���� ��ȯŸ�԰� ���ϸ�ɸ� ����!
	//�ش� ����ʵ��� ���� ������ ������ 
	//setter �޼���� ��ȯŸ�� ���� �Ҵ�Ÿ������ 
	//�Ű������� �������� ����ʵ� ������ ����
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
		return "�а� : "+department+"\n�й� : "+stdID;
	}
}
