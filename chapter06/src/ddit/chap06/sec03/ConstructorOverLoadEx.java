package ddit.chap06.sec03;

public class ConstructorOverLoadEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.toString());//��ȯŸ���� ���� �޼���� ���Ұ�.
	
		
		Person p2 = new Person(2304);
		System.out.println(p2);//��ȯŸ���� ���� �޼���� ���Ұ�.

		Person p3 = new Person(9999,"������");
		System.out.println(p3);//��ȯŸ���� ���� �޼���� ���Ұ�.
		
		Person p4 = new Person(1986,"�㳭����","����");
		System.out.println(p4);
		
	}
}