package ddit.chap06.sec06_1;
//은행계좌(Account)클래스를 싱글톤(Singleton) 생성하시오
//싱글톤(Singleton):가장 간단한 디자인 패턴(design pattern)
//		클래스 내부에서 해당 클래스 객체가 생성되며, 생성되는 객체의 수는 하나이다.

//싱글톤 객체 생성 사용형식
//		1) 해당클래스 타입의 private & static 타입의 변수(instance) 생성 및 초기화
//			ex) private static Account instance =null;

//		2) private 타입의 생성자 메서드 셍성
//			ex) private Account(){}

//		3) 외부와 소통하는 static 타입의 메서드(getInstance()-static이고 반환타입은 자기클래스)생성
//			ex) public static Account getInstance(){
//					if(instance == null) instance =new Account();
//					return instance;
//					}





//멤버필드 : 계좌번호(String accNo),
//		      잔고(int balance)

//메서드 : 생성자메서드(계좌번호 설정)->멤버필드 초기화 ㅠㅜㅠㅠ 
//		    입금(deposit-매개변수는 있고 반환타입은 없음)
//		    출금(withdraw-매개변수와 반환타입 존재)
//		    잔액조회(getBalance-매개변수는 없고 반환타입은 있음)


public class Account1 {

	private String accNo;// 계좌번호 초기화 함(멤버필드 초기화)--계좌번호 변경 불가능. 
	private int balance;// 잔액은 0이니까 this 지정 안함
	private static Account1 instance=null;
	
	private Account1(String accNo) {
		this.accNo =accNo;
		balance=0;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public static Account1 getInstance() {//선언
		if(instance==null) instance=new Account1("123456");//null로 초기화 후 계좌번호 "123456"으로 지정함.
		return instance;
	}

	
	public void deposit(int amt) {// 내가 저축하는 액수가 들어옴
		balance = balance + amt;// 잔고+입금액수(두가지 행동 한꺼번에 하지말기..)
	}

	
	public int withdraw(int amt) {// 반환할 타입
		int res = 0;// 리턴 줄이는 방법
		if (balance >= amt) {
			balance = balance - amt;
			res = amt;// 출금한 돈 반환
		} else {// 잔고가 작을때
			System.out.println("잔고부족");

		}
		return res;

	}

	public int getBalance() {// 잔액조회
		return balance;
	}
}