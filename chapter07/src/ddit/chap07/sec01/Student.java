package ddit.chap07.sec01;
/*예제1)
 * 학생클래스
 * 	속성:이름,나이,학교이름
 * 	메서드:정보출력
 * 
 * 직장인 클래스
 * 	속성:이름,나이,직장이름,직위
 * 	메서드:정보출력
 * 
 * 예제2)
 * 도형(Shape)클래스
 * 	속성:도형명, 꼭지점의 수
 * 	메서드:도형을 그리다(draw())
 * 
 * 삼각형(Triangle) 클래스
 * 	메서드:도형을 그리다(draw())

 * 사각형(Rectangle) 클래스
 * 	메서드:도형을 그리다(draw())

 * 원(Circle) 클래스
 * 	메서드:도형을 그리다(draw())
 * 
 */
public class Student extends Person{
//	String name;
//	int age;
	String schoolName;
	
	Student(String name, int age, String schoolName){
//		this.name=name;
//		this.age=age;
		super(name,age);
		this.schoolName=schoolName;
	}
	
	
	@Override
	void printInfo() {
//		System.out.println("이름: "+name);
//		System.out.println("나이: "+age);
		super.printInfo();
		System.out.println("학교명: "+schoolName);
	}
}
