package ddit.chap06.sec01_hw;

/*
 * ������ ��Ÿ���� Cylinder Ŭ������ Circle���� ���� �Ǽ����� ���̸� �ʵ�� ����
�� �޼ҵ� getVolume()�� ������ ���Ǹ� ��ȯ
�� Cylinder Ŭ������ main() �޼ҵ忡�� �������� 2.8, ���̰� 5.6�� ������ ���Ǹ� ���
 */
public class Circle {
//������ ����
	public double radius;
	public double height;
	public static double PI = 3.141592;

//������ ����
	public Circle(double radius,double height) {
		this.radius = radius;
		this.height = height;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
//���� �������� ����Ͽ� ���� ������ ���ϴ� �޼ҵ�:��ȯ���� ����
	public double getArea() {
		return radius * radius * PI;
	}
//������ ���Ǹ� ���ϴ� �޼ҵ�:��ȯ���� ����
	public double getVolume() {
		return getArea()*height;
	}
	public double getVolume1() {
		return getArea()*height;
	}


}