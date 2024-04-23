package ddit.chap07.sec07;

public class Circle extends Shape{//재정의할때 같거나 더 넓은 범위로 정의해야함. 현재 추상클래스,메서드 사용못함
	double radius;
	final double PI = 3.14;//선언해준것은 매개변수가 올 필요가 없음!
	
	Circle(String color, String kind, double radius ){
		super(color,kind);
		this.radius=radius;
		
		
	}
	
	@Override
	public void draw() {
		System.out.println(kind+" 도형을 그립니다.");
	}
	
	public double getArea() {
		return	radius*radius*PI;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n 면적 : "+getArea();
	}

}
