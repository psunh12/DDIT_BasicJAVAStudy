package ddit.chap07.sec02;

public class PhoneExample {

	public static void main(String[] args) {
		//아이폰2클래스를 생성... 상속상속상속
		Iphone1 ip1=new Iphone1("정몽주","010-1234-5678");
		
		System.out.println("소유자 : "+ip1.owner);
		System.out.println("전화번호 : "+ip1.phoneNum);
		ip1.voicePhone();
		ip1.playMusic();
		
		System.out.println("---------------------------");
		Iphone2 ip2=new Iphone2("강감찬","010-9876-1234");
		
		System.out.println("소유자 : "+ip2.owner);
		System.out.println("전화번호 : "+ip2.phoneNum);
		ip2.voicePhone();
		ip2.playMusic();
		ip2.fingerPrintRecog();
		
	}

}
