package ddit.chap06.sec03;

public class Person {

	int pid;
	String name;
	String gender;
	int age;
	//������
	
	Person(){
		this(1001,"ȫ�浿","����",25);
	}
	
	Person(int pid){
//		this.pid=pid;
		this(pid,"ȫ�浿","����",25);//�� ������ person ȣ��
	}
	
	Person(int pid,String name){
//		this.pid=pid;
//		this.name=name;
		this(pid,name,"����",25);
	}//�������� ���
	
	Person(int pid,String name,String gender){
//		this.pid=pid;
//		this.name=name;
//		this.gender=gender;
		this(pid, name, gender, 25);
		
	}
	Person(int pid,String name,String gender, int age){
		this.pid=pid;
		this.name=name;
		this.gender=gender;
		this.age=age;
		
	}
	@Override
	public String toString(){//��ġ�� �ȵ�{
		return "\n---------------------\n��ȣ : "+pid+"\n�̸� : "+name+"\n���� : "+gender+"\n���� : "+age;
	
	}
	public void printInfo() {
//		System.out.println("��ȣ : "+pid);
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : "+gender);
//		System.out.println("���� : "+age);
		
	}

}

