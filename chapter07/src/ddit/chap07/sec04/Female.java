package ddit.chap07.sec04;

public class Female extends Human{
	int age;
	String job;
	String name = "�����";
	
	Female(String name, int age, String job){
		super(name);
		this.age=age;
		this.job=job;
	}
	
	@Override
	public void printInfo() {
		System.out.println("���� �����Դϴ�.");
		System.out.println("�̸��� "+name+"�̰� ���̴� "+age+"�� �̸� ������ "+job+"�Դϴ�.");
		
	}
	public void setJob(String job) {
		this.job=job;
		
	}
}
