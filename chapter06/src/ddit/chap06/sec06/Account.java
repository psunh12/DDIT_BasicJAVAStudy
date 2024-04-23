package ddit.chap06.sec06;
//�������(Account)Ŭ������ �����Ͻÿ�

//����ʵ� : ���¹�ȣ(String accNo),
//		      �ܰ�(int balance)

//�޼��� : �����ڸ޼���(���¹�ȣ ����)->����ʵ� �ʱ�ȭ �Ф̤Ф� 
//		    �Ա�(deposit-�Ű������� �ְ� ��ȯŸ���� ����)
//		    ���(withdraw-�Ű������� ��ȯŸ�� ����)
//		    �ܾ���ȸ(getBalance-�Ű������� ���� ��ȯŸ���� ����)


public class Account {
	private String accNo;// ���¹�ȣ �ʱ�ȭ ��(����ʵ� �ʱ�ȭ)--���¹�ȣ ���� �Ұ���. 
	private int balance;// �ܾ��� 0�̴ϱ� this ���� ����

	Account(String accNo) {// ������

		this.accNo = accNo;// ���¹�ȣ �Է�: accNo�� ����ִ� ���� accNo�� ������.(this. ���)
		balance = 0;// �ϳ��ۿ� �����ϱ� this ���� ����

	}

	public void deposit(int amt) {// ���� �����ϴ� �׼��� ���� 
		balance = balance + amt;// �ܰ�+�Աݾ׼�(�ΰ��� �ൿ �Ѳ����� ��������..)
	}

	public int withdraw(int amt) {// ��ȯ�� Ÿ��
//		if(balance>=amt) {
//			balance= balance-amt;
//			return amt;//����� �� ��ȯ
//		}
//		else {//�ܰ� ������
//		System.out.println("�ܰ����");
//		return 0;
//	}
		int res = 0;// ���� ���̴� ���
		if (balance >= amt) {
			balance = balance - amt;
			res = amt;// ����� �� ��ȯ
		} else {// �ܰ� ������
			System.out.println("�ܰ����");

		}
		return res;

	}

	public int getBalance() {// �ܾ���ȸ
		return balance;//��ȯ��
	}
}