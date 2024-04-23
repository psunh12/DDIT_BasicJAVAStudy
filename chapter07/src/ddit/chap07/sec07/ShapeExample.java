package ddit.chap07.sec07;

public class ShapeExample {

	public static void main(String[] args) {
		Shape s1 = new Circle("파랑색","원",3.5);
		s1.draw();
		//s1.getArea();//오류가 없어지지 않는 이유:다형성인 경우 부모클래스에서 정의한 것만 불러옴.재정의 하면 사용 가능하지만 자식클래스에서만 지정한 것은 부를수 없다
		System.out.println(s1.toString());
		
		System.out.println();
		s1=new Rectangle("검정색","직사각형",5,10);
		s1.draw();
		System.out.println(s1.toString());

		
		
	}

}
