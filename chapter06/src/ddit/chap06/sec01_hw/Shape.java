package ddit.chap06.sec01_hw;

public class Shape {

	public static void main(String[] args) {
		Rectangle r1 =new Rectangle(new Point(100,150),50,80);
		r1.setPoint();
		
		Rectangle r2 =new Rectangle(new Point(120,160),10,10);
		r2.setPoint();
		
		if(new Shape().isContains(r1,r2)) {
			System.out.println("첫 번째 사각형이 두번째 사각형을 포함하고 있습니다");
		}else {
			System.out.println("두 사각형은 포함관계에 있지 않습니다");
		}
	}
	public static boolean isContains(Rectangle r1, Rectangle r2) {
		if ((r1.p[0].getX() >=r1.p[0].getX() && r1.p[2].getX()>=r2.p[2].getX())&&
		(r1.p[0].getY() >=r1.p[0].getY() && r1.p[2].getY()>=r2.p[2].getY())){
			return true;
		}else {
			return false;
		}
	}

}
