package ddit.chap08.sec01;

public class RoundRobin implements Schedular {

	@Override
	public void getNextCall() {//�����ȭ�� ��������� ������ �ɴϴ�
		System.out.println("�����ȭ�� ��⿭���� ���ʴ�� ������");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���ʴ�� ���� �������� �����ȭ�� �й�");
	}

}
