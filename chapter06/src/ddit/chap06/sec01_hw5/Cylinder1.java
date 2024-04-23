package ddit.chap06.sec01_hw5;

public class Cylinder1 {
	Circle1 circle;//포함관계(has a~ 관계)
	double height;
	
	//상속이 아닌 멤버필드로 선언:포함관계.(실린더는 원을 포함한다 실린더 has a 원)
	Cylinder1(Circle1 circle,double height){
		this.circle = circle;
		this.height = height;
	}
	
	public double getVolumn(){
		return height*circle.getArea();
	}
}
