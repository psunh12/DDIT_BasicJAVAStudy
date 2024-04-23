package ddit.chap06.sec01_hw;

/*
 * 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
· 메소드 getVolume()은 원통의 부피를 반환
· Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
 */
public class Circle {
//데이터 선언
	public double radius;
	public double height;
	public static double PI = 3.141592;

//생성자 구현
	public Circle(double radius,double height) {
		this.radius = radius;
		this.height = height;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
//현재 반지름을 사용하여 원의 면적을 구하는 메소드:반환값만 있음
	public double getArea() {
		return radius * radius * PI;
	}
//원통의 부피를 구하는 메소드:반환값만 있음
	public double getVolume() {
		return getArea()*height;
	}
	public double getVolume1() {
		return getArea()*height;
	}


}