package kr.or.ddit.studycls;

public class Person {
	// �����͸� �����ϴ� �뵵. ���θ޼��� �����ϸ� ������ �ʴ´�. �����ϸ� private�� �����ϱ�~
	private String nation;// �����̶� "�ѱ�" �̷��� ��. private�� �ٲ��ʿ䰡 ���⶧���� ������.
	private String group;// ����Ʈ,�ܺο��� ������� ���ϰ� private
	private String name;// �Է¹�������
	private int age;

	Person() {
		System.out.println("�⺻������ �Դϴ�");
		nation = "�ѱ�";
		group = "406ȣ";
	}

//������:�빮��()
	Person(String name, int age) {// �̸��� ���̸� ������.

		this();// ��Ŭ������ �ִ� ������ �ҷ���
		System.out.println("�̸��� ���̸� �Է��� ������ �Դϴ�");
		this.name = name;// ���θ޼���� this ��� �ȵ�
		this.age = age;
	}

	Person(String group, String name, int age) {// �̸��� ���̸� ������.
		this(name, age);// ���� ������ �״�� �����پ�
//	=	this.name = name;
//		this.age = age;
		this.group = group;/// 405ȣ �л��� ������ �ֱ⶧��
		System.out.println("�׷�� �̸��� ���̸� �Է��� ������ �Դϴ�");// this �۾� �Ŀ� ����
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
		return group;// ���� ������ ����
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getName() {//�����͸� ��������
		return name;//Ŭ������ �ִ� name�� �ش�
	}

	public void setName(String name) {//�����͸� �ֱ� ������ (String name) �ۼ��Ѵ�
		this.name = name; //�����ڿ� set���� �Ѵ�?
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {//��� ���ϰ� ���.
		if (age < 0) {
			System.out.println("- ���� �Է� ������ �����ϴ�.");
		} else {
			this.age = age;
		}

	}
}
