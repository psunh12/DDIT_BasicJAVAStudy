package ddit.chap06.sec01_hw;

/* ����7.�ʵ带 ��� private�� �ϰ�, getter�� setter�� �����ϰ�
�� Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� setter�� ����Ͽ� �а��� �й� �ʵ忡 ����
�� ���� �Է� �� ���
 * 
 */
public class StudentHW {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		
		s1.setStudID(230105001L);// �й�
		s1.setMajor("��ǻ�Ͱ��а�");

		System.out.println("�а��� : " + s1.getMajor());// major��� ���� �Ҽ��� student���� ������ ��.
		System.out.println("�й� : " + s1.getStudID());

		// default �����ڴ� ����. �Ű������� ����
		// setter �ۿ��� ������ ������ �;���. �Ű����� �ʿ�!
		// getter ��ȯ�Ϸ��� �ϴ� ����Ÿ��

	}

}