package ddit.chap06.sec01_hw5;

public class Cylinder1 {
	Circle1 circle;//���԰���(has a~ ����)
	double height;
	
	//����� �ƴ� ����ʵ�� ����:���԰���.(�Ǹ����� ���� �����Ѵ� �Ǹ��� has a ��)
	Cylinder1(Circle1 circle,double height){
		this.circle = circle;
		this.height = height;
	}
	
	public double getVolumn(){
		return height*circle.getArea();
	}
}
