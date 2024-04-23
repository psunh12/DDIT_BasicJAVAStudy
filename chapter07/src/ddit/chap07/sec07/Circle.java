package ddit.chap07.sec07;

public class Circle extends Shape{//�������Ҷ� ���ų� �� ���� ������ �����ؾ���. ���� �߻�Ŭ����,�޼��� ������
	double radius;
	final double PI = 3.14;//�������ذ��� �Ű������� �� �ʿ䰡 ����!
	
	Circle(String color, String kind, double radius ){
		super(color,kind);
		this.radius=radius;
		
		
	}
	
	@Override
	public void draw() {
		System.out.println(kind+" ������ �׸��ϴ�.");
	}
	
	public double getArea() {
		return	radius*radius*PI;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n ���� : "+getArea();
	}

}
