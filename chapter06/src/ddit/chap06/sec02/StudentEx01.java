package ddit.chap06.sec02;
//coach Ŭ����
/*���� 1.������ �����ϴ� Student Ŭ������ �ۼ��ϼ���
 * .String���� �а��� �������� �й��� �ʵ�� ����
 * .StudentEx01 Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է��Ѵ�.

 * ����7.�ʵ带 ��� private�� �ϰ�, getter�� setter�� �����ϰ�
�� Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� setter�� ����Ͽ� �а��� �й� �ʵ忡 ����
�� ���� �Է� �� ���
 * 
 */

public class StudentEx01 {

	public static void main(String[] args) {
		Student s1=new Student();//������ �޼����  
		s1.studID=230105001L;//�й�
		s1.major="��ǻ�Ͱ��а�";
		
		System.out.println("�а��� : "+s1.major);//major��� ���� �Ҽ��� student���� ������ ��. 
		System.out.println("�й� : "+s1.studID);
		
		//default �����ڴ� ����. �Ű������� ����
		//setter �ۿ��� ������ ������ �;���. �Ű����� �ʿ�!
		//getter ��ȯ�Ϸ��� �ϴ� ����Ÿ��
		
		
	}

}
