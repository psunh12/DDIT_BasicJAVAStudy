package ddit.chap05.sec03;

public class SeasonExample {

	public static void main(String[] args) {
		myMethod02();
//		Person p1 = new Person("홍길동", Season.WINTER);//시즌이라는 열거타입에 WINTER을 호출
//		
//		System.out.println("고객명 : "+p1.name);
//		System.out.println("좋아하는 계절 : "+p1.favorite_season);
	}

	
	public static void myMethod01() {
		Season s1 = Season.SUMMER;
		System.out.println("계절 : "+s1);
		System.out.println("계절 : "+Season.WINTER);
		
	}
	public static void myMethod02() {
		//name() 메서드 사용
		Season s1 = Season.SPRING;
		String mf_season=s1.name();
		System.out.println("내가 좋아하는 계절 :"+mf_season);

		//ordinal()//해당되는값이 이넘에서 몇번째 상수인지 
		s1=Season.FALL;
		int idx = s1.ordinal();
		System.out.println("index :"+idx);
		
		//valueOf() : 반환타입은 열거타입, 매개변수는 문자열
		Season res=Season.valueOf("WINTER");//열거타입에 해당되는 변수가 있는지 확인해야함
		System.out.println("res="+res);
		
		//values() : 열거타입의 배열로 열거상수를 반환
		Season[] season = Season.values();
		for(Season s:season) {//배열과 collection만 사용할수있다
			System.out.println((s.ordinal()+1)+"번째 계절 : "+s);
		}
	}
	
}



class Person{
	String name;
	Season favorite_season;//이름과 좋아하는 계절 초기화
	
	Person(String name, Season favorite_season){
		this.name = name;
		this.favorite_season = favorite_season;//해당되는데이터가 저장될 목적변수 = 입력받을 데이터
	}
}

