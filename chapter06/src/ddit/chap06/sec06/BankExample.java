package ddit.chap06.sec06;
//�������(Account)Ŭ������ �����Ͻÿ�

// ����ʵ� : ���¹�ȣ(String accNo),
//		      �ܰ�(int balance)

// �޼��� : �����ڸ޼���(���¹�ȣ ����)
//		    �Ա�(deposit-�Ű������� �ְ� ��ȯŸ���� ����)
//		    ���(withdraw-�Ű������� ��ȯŸ�� ����)
//		    �ܾ���ȸ(getBalance-�Ű������� ���� ��ȯŸ���� ����)

public class BankExample {

	public static void main(String[] args) {
		Account a1 = new Account("12345");// ���������� ���. ���¹�ȣ �ϳ� ������.
		
		
		
		printBalance(a1);
		
		//System.out.println("�ܰ�: " + a1.getBalance());
		
		
		a1.deposit(50000);//����
		//System.out.println("�ܰ�:"+a1.getBalance()+"��");
		printBalance(a1);
		
		a1.withdraw(100000);//����
		//System.out.println("�ܰ�:"+a1.getBalance()+"��");
		printBalance(a1);
	
		
		System.out.println("��ݾ׼� :"+a1.withdraw(30000));
		System.out.println("��ݾ׼� :"+a1.getBalance()+"��");
	
	
	
	}
	
	public static void printBalance(Account acc){//�ݺ��Ǵ� �� �ϳ��� �����
		System.out.println("�ܰ�:"+acc.getBalance()+"��");
		System.out.println("----------------------------");
	}
	

}
