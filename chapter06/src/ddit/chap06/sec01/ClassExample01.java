package ddit.chap06.sec01;

//����ʵ� �ʱ�ȭ ����
// 1.�����ʱ�ȭ ���
//	int age =18;
// 2.�ʱ�ȭ �� ��� 
//	class Temp{
//		int age;
//		{
//			age = 20;
//		}
//	}
// 3.������ �޼���(�پ��� ����ʵ� ���� ���� ��ü����)
//	class Temp{
//		int age=18;
//		{
//			age = 20;
//		}
//		Temp(int age){//������ �޼���
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
		System.out.println("���� �ʱ�ȭ age="+age);
		age=20;
		System.out.println("�ʱ�ȭ��� age="+age);
	}
	Temp(int age){//��������:�ڽ��� ���� �޼��忡���� ����
		this.age =age;//�پ��� ���̸� ���� ��ü�� ����
		//��� �޼��� �ȿ��� ����Ҽ� �ְ� ������ �޼��忡�� �̸��� ���� ���������� �����Ҷ� ������� �տ� this�� �ٴ´�. (�θ��ּҴ� super)
		System.out.println("�����ڸ޼��� age="+age);
	}
	void printAge() {
		System.out.println("���� = "+age);
		age=20;
	}
}