package ddit.chap06.sec01_hw5;

public class Circle1 {
	double radius;
	final double PI = 3.1415926;

	Circle1(double radius){
		this.radius=radius;
	}
	
	//�� ���̷��� ������?Ȯ��
	public double getArea() {
		return radius*radius*PI;
	}
}
