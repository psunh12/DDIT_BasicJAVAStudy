package ddit.chap08.sec01;

public class LeastJob implements Schedular {

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ��⿭���� ���ʴ�� ������");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("��⿭�� ���� ª�� �������� �����ȭ�� �й�");
	}

}
