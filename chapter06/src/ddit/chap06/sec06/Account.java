package ddit.chap06.sec06;
//은행계좌(Account)클래스를 생성하시오

//멤버필드 : 계좌번호(String accNo),
//		      잔고(int balance)

//메서드 : 생성자메서드(계좌번호 설정)->멤버필드 초기화 ㅠㅜㅠㅠ 
//		    입금(deposit-매개변수는 있고 반환타입은 없음)
//		    출금(withdraw-매개변수와 반환타입 존재)
//		    잔액조회(getBalance-매개변수는 없고 반환타입은 있음)


public class Account {
	private String accNo;// 계좌번호 초기화 함(멤버필드 초기화)--계좌번호 변경 불가능. 
	private int balance;// 잔액은 0이니까 this 지정 안함

	Account(String accNo) {// 생성자

		this.accNo = accNo;// 계좌번호 입력: accNo에 들어있는 값을 accNo에 전달함.(this. 사용)
		balance = 0;// 하나밖에 없으니까 this 지정 안함

	}

	public void deposit(int amt) {// 내가 저축하는 액수가 들어옴 
		balance = balance + amt;// 잔고+입금액수(두가지 행동 한꺼번에 하지말기..)
	}

	public int withdraw(int amt) {// 반환할 타입
//		if(balance>=amt) {
//			balance= balance-amt;
//			return amt;//출금한 돈 반환
//		}
//		else {//잔고가 작을때
//		System.out.println("잔고부족");
//		return 0;
//	}
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
		return balance;//반환만
	}
}