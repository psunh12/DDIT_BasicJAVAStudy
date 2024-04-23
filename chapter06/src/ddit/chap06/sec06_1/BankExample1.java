package ddit.chap06.sec06_1;
//은행계좌(Account)클래스를 생성하시오

// 멤버필드 : 계좌번호(String accNo),
//		      잔고(int balance)

// 메서드 : 생성자메서드(계좌번호 설정)
//		    입금(deposit-매개변수는 있고 반환타입은 없음)
//		    출금(withdraw-매개변수와 반환타입 존재)
//		    잔액조회(getBalance-매개변수는 없고 반환타입은 있음)



//static 변수-생성시점 (loading)
//		  메서드- 정적변수

//변수명=값
//객체명.변수명(객체가 생성되어야함. new연산자를 통해)
//클래스명.변수명(클래스명으로 참조?)
//클래스명.메서드 



public class BankExample1 {

	public static void main(String[] args) {
		Account1 a1 = Account1.getInstance();// 계좌번호 입력

		a1.deposit(50000);//저금
		printBalance(a1);
		
		a1.withdraw(100000);//저금
		printBalance(a1);
	
		Account1 a2 = Account1.getInstance();
		System.out.println("==============================");
		printBalance(a2);
		
		a2.withdraw(10000);
		printBalance(a1);
		
		System.out.println("a1"+a1);
		System.out.println("a2"+a2);
	
	}
	
	public static void printBalance(Account1 acc){//반복되는 값 하나로 만들기
		System.out.println("계좌번호: "+acc.getAccNo());
		System.out.println("잔고:"+acc.getBalance()+"원");
		System.out.println("----------------------------");
	}
	

}
