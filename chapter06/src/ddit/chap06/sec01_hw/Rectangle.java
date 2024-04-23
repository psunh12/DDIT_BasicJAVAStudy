package ddit.chap06.sec01_hw;

public class Rectangle {
	Point[] p= new Point[4];
	int width;
	int height;
	
	Rectangle(Point p, int width, int height) { 
		this.p[0]=p;
		this.width=width;
		this.height=height;
		
	}
	public void setPoint() {
		System.out.println(p[0].getX());
		
		p[1]=new Point(p[0].getX()+width,p[0].getY());//사각형의 점
		p[2]=new Point(p[0].getX()+width,p[0].getY()+height);
		p[3]=new Point(p[0].getX()+width,p[0].getY()+height);
		
	
	}
	
}
