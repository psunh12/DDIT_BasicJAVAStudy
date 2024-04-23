package ddit.chap07.sec07;

public class Rectangle extends Shape {
	int width;
	int height;
	
	public Rectangle(String color, String kind ,int width, int height){
		super(color, kind);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public void draw() {
		System.out.println(kind+" ������ �׸��ϴ�.");
	}
	
	public double getArea() {
		return	width*height;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n ���� : "+getArea();
	}

}
