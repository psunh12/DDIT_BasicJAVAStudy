package ddit.chap06.sec01_hw;

/* 문제7.필드를 모두 private로 하고, getter와 setter를 구현하고
· Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당
한 값을 입력 후 출력
 * 
 */
public class StudentHW {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		
		s1.setStudID(230105001L);// 학번
		s1.setMajor("컴퓨터공학과");

		System.out.println("학과명 : " + s1.getMajor());// major라고 쓰면 소속이 student꺼라서 오류가 남.
		System.out.println("학번 : " + s1.getStudID());

		// default 실행자는 있음. 매개변수는 없다
		// setter 밖에서 데이터 가지고 와야함. 매개변수 필요!
		// getter 반환하려고 하는 변수타입

	}

}