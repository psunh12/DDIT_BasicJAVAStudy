package ddit.chap07.sec02;
/*
 * ��ӿ���2)
��ȭ��(Phone)Ŭ����
	-�Ӽ�: �������̸�
	-�޼���:���(function)=>������ȭ���

1.������1 Ŭ����
	-�޼���:���(function)=>������ȭ���,�������
	
2.������2 Ŭ����
	-�޼���:���(function)=>������ȭ���,�������,�����νı��
 */

public class Phone {
	protected String owner;
	protected String phoneNum;
	
	
	Phone(String owner, String phoneNum){
		this.owner = owner;
		this.phoneNum = phoneNum;	
	}
	
	public void voicePhone() {
		System.out.println("������ȭ���");
	}
}