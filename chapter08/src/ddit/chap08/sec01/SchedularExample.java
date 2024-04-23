package ddit.chap08.sec01;

import java.io.IOException;

public class SchedularExample {

	public static void main(String[] args) { //throws IOException{//throws:������, �̷��-���ܸ� ������ �߻���,input output ��Ÿ��
		System.out.println("��ȭ����� �й��� ����");
		System.out.println("R : RoundRobin");
		System.out.println("L : LeastJob");
		System.out.println("P : PriorityAllocation");
		System.out.print("����>>");
		char c = ' ';
		
		
		
		try {//����� ����ó�� ��??????��?????
			c = (char)System.in.read();//���� int�ε� ���� ����ȯ��.
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		Schedular schedular=null;//��üȭ �ɼ� ����.�������̽��� ��üȭ �Ұ��� ~ �׳� ������ �������.

		
		if(c =='R'||c=='r') {
			schedular = new RoundRobin();//�����ϴ� ������� ��ĳ��Ʈ
		}else if(c =='L'||c=='l') {
			schedular = new LeastJob();
		}else if(c =='P'||c=='p') {
			schedular = new PriorityAllocation();
		}else {
			System.out.println("�۾����ÿ���");
			System.exit(0);
		}
		schedular.getNextCall();
		schedular.sendCallToAgent();
	}

}
