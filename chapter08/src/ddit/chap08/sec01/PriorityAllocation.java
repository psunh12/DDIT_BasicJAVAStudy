package ddit.chap08.sec01;

public class PriorityAllocation implements Schedular {
	
	@Override
	public void getNextCall() {
		System.out.println("�켱������ ���� �����ȭ�� ��⿭���� ���ʴ�� ������");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� skill�� ���� ����� �������� ��⿭�� ù��° �����ȭ�� �й�");
	}

}