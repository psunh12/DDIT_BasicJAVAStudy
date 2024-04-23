package ddit.chap06.sec01;

//멤버필드 초기화 순서
// 1.직접초기화 방법
//	int age =18;
// 2.초기화 블럭 사용 
//	class Temp{
//		int age;
//		{
//			age = 20;
//		}
//	}
// 3.생성자 메서드(다양한 멤버필드 값을 갖는 객체생성)
//	class Temp{
//		int age=18;
//		{
//			age = 20;
//		}
//		Temp(int age){//생성자 메서드
//			this.age=age;
//		}
//	}	
public class ClassExample01 {

	public static void main(String[] args) {
		Temp t1 = new Temp(30);

	}

}
class Temp{
	int age=17;
	{
		System.out.println("직접 초기화 age="+age);
		age=20;
		System.out.println("초기화블록 age="+age);
	}
	Temp(int age){//지역변수:자신이 속한 메서드에서만 존재
		this.age =age;//다양한 나이를 가진 객체가 생성
		//모든 메서드 안에서 사용할수 있고 생성자 메서드에서 이름이 같은 지역변수가 존재할때 멤버변수 앞에 this가 붙는다. (부모주소는 super)
		System.out.println("생성자메서드 age="+age);
	}
	void printAge() {
		System.out.println("나이 = "+age);
		age=20;
	}
}