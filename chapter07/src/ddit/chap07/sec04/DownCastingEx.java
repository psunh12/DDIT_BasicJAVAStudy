package ddit.chap07.sec04;

import java.util.ArrayList;

public class DownCastingEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(new Person("ȫ�浿",25,"����"));
		list.add(1234);//1234�� ��ü�� ����°� �ڽ�, �� ����� Ÿ������ ����°� ��ڽ�.....�̰� ���;;;;;���� ������Ʈ�� ����????//????//?/�� ������ �̰ſ��� ~��ü�� �ϰ椩��Ų�ٰ�? ������ �ϴ� Ŭ����? ����Ŭ����.. wrapper 
		//boxing Ŭ���� �ڵ��ڽ� - ����ڽ� /�ڽ̵Ȱ� �����°� �����ڽ�.
		

		Person p1=(Person)(list.get(0));
		p1.showPerson();
		
		Object obj = list.get(0);
		if(obj instanceof Person) {
			p1=(Person)obj;
			p1.showPerson();
			
		}
	}

}

class Person{
	String name;
	int age;
	String gender;
	
	Person(String name, int age, String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void showPerson() {//�ߺ��Ǵ� �����͸� �迭�� �����ְ�
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+gender);
		System.out.println("����:"+age);
	}
}