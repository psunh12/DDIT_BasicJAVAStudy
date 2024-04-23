package kr.or.ddit.studycls;

public class Person {
	// 데이터를 저장하는 용도. 메인메서드 웬만하면 만들지 않는다. 웬만하면 private로 고정하깅~
	private String nation;// 고정이라서 "한국" 이러고 함. private는 바꿀필요가 없기때문에 고정함.
	private String group;// 디폴트,외부에서 사용하지 못하게 private
	private String name;// 입력받을거임
	private int age;

	Person() {
		System.out.println("기본생성자 입니다");
		nation = "한국";
		group = "406호";
	}

//생성자:대문자()
	Person(String name, int age) {// 이름과 나이를 넣을것.

		this();// 내클래스에 있는 생성자 불러옴
		System.out.println("이름과 나이를 입력한 생성자 입니다");
		this.name = name;// 메인메서드는 this 사용 안됨
		this.age = age;
	}

	Person(String group, String name, int age) {// 이름과 나이를 넣을것.
		this(name, age);// 기존 내용을 그대로 가져다씀
//	=	this.name = name;
//		this.age = age;
		this.group = group;/// 405호 학생도 있을수 있기때문
		System.out.println("그룹과 이름과 나이를 입력한 생성자 입니다");// this 작업 후에 쓰기
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", group=" + group + ", name=" + name + ", age=" + age + "]";
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getGroup() {
		return group;// 받은 변수를 리턴
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {//데이터를 가져간다
		return name;//클래스에 있는 name을 준다
	}

	public void setName(String name) {//데이터를 주기 때문에 (String name) 작성한다
		this.name = name; //생성자와 set으로 한다?
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//묶어서 편리하게 사용.
		if (age < 0) {
			System.out.println("- 값은 입력 받을수 없습니다.");
		} else {
			this.age = age;
		}

	}
}
