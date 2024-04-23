package ddit.chap07.sec04;

import java.util.ArrayList;

public class DownCastingEx {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(new Person("홍길동",25,"남자"));
		list.add(1234);//1234를 객체로 만드는거 박싱, 머 희안한 타입으로 만드는걸 언박싱.....이게 몬대;;;;;ㅅㅂ 오브젝트에 저장????//????//?/하 개같다 이거에요 ~객체로 볁경ㄹ시킨다고? 램역할 하는 클래스? 래퍼클래스.. wrapper 
		//boxing 클래스 자동박싱 - 오토박싱 /박싱된거 꺼내는거 오토언박싱.
		

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
	
	public void showPerson() {//중복되는 데이터를 배열에 집에넣고
		System.out.println("이름 : "+name);
		System.out.println("성별 : "+gender);
		System.out.println("나이:"+age);
	}
}