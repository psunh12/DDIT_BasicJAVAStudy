package ddit.chap07.sec01;
/*����1)
 * �л�Ŭ����
 * 	�Ӽ�:�̸�,����,�б��̸�
 * 	�޼���:�������
 * 
 * ������ Ŭ����
 * 	�Ӽ�:�̸�,����,�����̸�,����
 * 	�޼���:�������
 * 
 * ����2)
 * ����(Shape)Ŭ����
 * 	�Ӽ�:������, �������� ��
 * 	�޼���:������ �׸���(draw())
 * 
 * �ﰢ��(Triangle) Ŭ����
 * 	�޼���:������ �׸���(draw())

 * �簢��(Rectangle) Ŭ����
 * 	�޼���:������ �׸���(draw())

 * ��(Circle) Ŭ����
 * 	�޼���:������ �׸���(draw())
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
//		System.out.println("�̸�: "+name);
//		System.out.println("����: "+age);
		super.printInfo();
		System.out.println("�б���: "+schoolName);
	}
}
