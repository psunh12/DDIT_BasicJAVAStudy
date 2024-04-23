package ddit.chap06.sec03;

public class ConstructorOverLoadEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.toString());//반환타입이 없는 메서드는 사용불가.
	
		
		Person p2 = new Person(2304);
		System.out.println(p2);//반환타입이 없는 메서드는 사용불가.

		Person p3 = new Person(9999,"박지원");
		System.out.println(p3);//반환타입이 없는 메서드는 사용불가.
		
		Person p4 = new Person(1986,"허난설헌","여성");
		System.out.println(p4);
		
	}
}