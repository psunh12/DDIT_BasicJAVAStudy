package ddit.chap06.sec06_1;
//�������(Account)Ŭ������ �����Ͻÿ�

// ����ʵ� : ���¹�ȣ(String accNo),
//		      �ܰ�(int balance)

// �޼��� : �����ڸ޼���(���¹�ȣ ����)
//		    �Ա�(deposit-�Ű������� �ְ� ��ȯŸ���� ����)
//		    ���(withdraw-�Ű������� ��ȯŸ�� ����)
//		    �ܾ���ȸ(getBalance-�Ű������� ���� ��ȯŸ���� ����)



//static ����-�������� (loading)
//		  �޼���- ��������

//������=��
//��ü��.������(��ü�� �����Ǿ����. new�����ڸ� ����)
//Ŭ������.������(Ŭ���������� ����?)
//Ŭ������.�޼��� 



public class BankExample1 {

	public static void main(String[] args) {
		Account1 a1 = Account1.getInstance();// ���¹�ȣ �Է�

		a1.deposit(50000);//����
		printBalance(a1);
		
		a1.withdraw(100000);//����
		printBalance(a1);
	
		Account1 a2 = Account1.getInstance();
		System.out.println("==============================");
		printBalance(a2);
		
		a2.withdraw(10000);
		printBalance(a1);
		
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
	
	}
	
	public static void printBalance(Account1 acc){//�ݺ��Ǵ� �� �ϳ��� �����
		System.out.println("���¹�ȣ: "+acc.getAccNo());
		System.out.println("�ܰ�:"+acc.getBalance()+"��");
		System.out.println("----------------------------");
	}
	

}
