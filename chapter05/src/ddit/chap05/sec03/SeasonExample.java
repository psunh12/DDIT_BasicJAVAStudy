package ddit.chap05.sec03;

public class SeasonExample {

	public static void main(String[] args) {
		myMethod02();
//		Person p1 = new Person("ȫ�浿", Season.WINTER);//�����̶�� ����Ÿ�Կ� WINTER�� ȣ��
//		
//		System.out.println("���� : "+p1.name);
//		System.out.println("�����ϴ� ���� : "+p1.favorite_season);
	}

	
	public static void myMethod01() {
		Season s1 = Season.SUMMER;
		System.out.println("���� : "+s1);
		System.out.println("���� : "+Season.WINTER);
		
	}
	public static void myMethod02() {
		//name() �޼��� ���
		Season s1 = Season.SPRING;
		String mf_season=s1.name();
		System.out.println("���� �����ϴ� ���� :"+mf_season);

		//ordinal()//�ش�Ǵ°��� �̳ѿ��� ���° ������� 
		s1=Season.FALL;
		int idx = s1.ordinal();
		System.out.println("index :"+idx);
		
		//valueOf() : ��ȯŸ���� ����Ÿ��, �Ű������� ���ڿ�
		Season res=Season.valueOf("WINTER");//����Ÿ�Կ� �ش�Ǵ� ������ �ִ��� Ȯ���ؾ���
		System.out.println("res="+res);
		
		//values() : ����Ÿ���� �迭�� ���Ż���� ��ȯ
		Season[] season = Season.values();
		for(Season s:season) {//�迭�� collection�� ����Ҽ��ִ�
			System.out.println((s.ordinal()+1)+"��° ���� : "+s);
		}
	}
	
}



class Person{
	String name;
	Season favorite_season;//�̸��� �����ϴ� ���� �ʱ�ȭ
	
	Person(String name, Season favorite_season){
		this.name = name;
		this.favorite_season = favorite_season;//�ش�Ǵµ����Ͱ� ����� �������� = �Է¹��� ������
	}
}

