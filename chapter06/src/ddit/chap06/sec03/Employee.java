package ddit.chap06.sec03;

public class Employee {
	//�����ȣ, �����, �μ���, ��ȭ��ȣ
	private int empID;
	private String empName;
	private String deptName;
	private String telNum;//�ܺο��� ���ٺҰ���
	
	Employee(int empID, String empName, String deptName, String telName, String telNum){
		this.empID =empID;
		this.empName=empName;
		this.deptName=deptName;
		this.telNum = telNum;
	}
	
	@Override
	public String toString(){
		String res="\n--------------------:";
		res=res+"\n�����ȣ : "+empID;
		res=res+"\n����� : "+empName;
		res=res+"\n�μ��� : "+deptName;
		res=res+"\n��ȭ��ȣ : "+telNum;
		
		return res;
	}

}
