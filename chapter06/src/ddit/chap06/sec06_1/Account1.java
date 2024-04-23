package ddit.chap06.sec06_1;
//�������(Account)Ŭ������ �̱���(Singleton) �����Ͻÿ�
//�̱���(Singleton):���� ������ ������ ����(design pattern)
//		Ŭ���� ���ο��� �ش� Ŭ���� ��ü�� �����Ǹ�, �����Ǵ� ��ü�� ���� �ϳ��̴�.

//�̱��� ��ü ���� �������
//		1) �ش�Ŭ���� Ÿ���� private & static Ÿ���� ����(instance) ���� �� �ʱ�ȭ
//			ex) private static Account instance =null;

//		2) private Ÿ���� ������ �޼��� �ļ�
//			ex) private Account(){}

//		3) �ܺο� �����ϴ� static Ÿ���� �޼���(getInstance()-static�̰� ��ȯŸ���� �ڱ�Ŭ����)����
//			ex) public static Account getInstance(){
//					if(instance == null) instance =new Account();
//					return instance;
//					}





//����ʵ� : ���¹�ȣ(String accNo),
//		      �ܰ�(int balance)

//�޼��� : �����ڸ޼���(���¹�ȣ ����)->����ʵ� �ʱ�ȭ �Ф̤Ф� 
//		    �Ա�(deposit-�Ű������� �ְ� ��ȯŸ���� ����)
//		    ���(withdraw-�Ű������� ��ȯŸ�� ����)
//		    �ܾ���ȸ(getBalance-�Ű������� ���� ��ȯŸ���� ����)


public class Account1 {

	private String accNo;// ���¹�ȣ �ʱ�ȭ ��(����ʵ� �ʱ�ȭ)--���¹�ȣ ���� �Ұ���. 
	private int balance;// �ܾ��� 0�̴ϱ� this ���� ����
	private static Account1 instance=null;
	
	private Account1(String accNo) {
		this.accNo =accNo;
		balance=0;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public static Account1 getInstance() {//����
		if(instance==null) instance=new Account1("123456");//null�� �ʱ�ȭ �� ���¹�ȣ "123456"���� ������.
		return instance;
	}

	
	public void deposit(int amt) {// ���� �����ϴ� �׼��� ����
		balance = balance + amt;// �ܰ�+�Աݾ׼�(�ΰ��� �ൿ �Ѳ����� ��������..)
	}

	
	public int withdraw(int amt) {// ��ȯ�� Ÿ��
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
		return balance;
	}
}