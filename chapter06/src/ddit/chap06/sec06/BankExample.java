package ddit.chap06.sec06;
//은행계좌(Account)클래스를 생성하시오

// 멤버필드 : 계좌번호(String accNo),
//		      잔고(int balance)

// 메서드 : 생성자메서드(계좌번호 설정)
//		    입금(deposit-매개변수는 있고 반환타입은 없음)
//		    출금(withdraw-매개변수와 반환타입 존재)
//		    잔액조회(getBalance-매개변수는 없고 반환타입은 있음)

public class BankExample {

	public static void main(String[] args) {
		Account a1 = new Account("12345");// 실제데이터 기술. 계좌번호 하나 생성됨.
		
		
		
		printBalance(a1);
		
		//System.out.println("잔고: " + a1.getBalance());
		
		
		a1.deposit(50000);//저금
		//System.out.println("잔고:"+a1.getBalance()+"원");
		printBalance(a1);
		
		a1.withdraw(100000);//저금
		//System.out.println("잔고:"+a1.getBalance()+"원");
		printBalance(a1);
	
		
		System.out.println("출금액수 :"+a1.withdraw(30000));
		System.out.println("출금액수 :"+a1.getBalance()+"원");
	
	
	
	}
	
	public static void printBalance(Account acc){//반복되는 값 하나로 만들기
		System.out.println("잔고:"+acc.getBalance()+"원");
		System.out.println("----------------------------");
	}
	

}
