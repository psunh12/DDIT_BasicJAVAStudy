package ddit.chap07.sec07;

public class ShapeExample {

	public static void main(String[] args) {
		Shape s1 = new Circle("�Ķ���","��",3.5);
		s1.draw();
		//s1.getArea();//������ �������� �ʴ� ����:�������� ��� �θ�Ŭ�������� ������ �͸� �ҷ���.������ �ϸ� ��� ���������� �ڽ�Ŭ���������� ������ ���� �θ��� ����
		System.out.println(s1.toString());
		
		System.out.println();
		s1=new Rectangle("������","���簢��",5,10);
		s1.draw();
		System.out.println(s1.toString());

		
		
	}

}
