package ddit.chap07.sec02;
/*
 * 상속예제2)
전화기(Phone)클래스
	-속성: 소유자이름
	-메서드:기능(function)=>음성통화기능

1.아이폰1 클래스
	-메서드:기능(function)=>음성통화기능,음악재생
	
2.아이폰2 클래스
	-메서드:기능(function)=>음성통화기능,음악재생,지문인식기능
 */

public class Phone {
	protected String owner;
	protected String phoneNum;
	
	
	Phone(String owner, String phoneNum){
		this.owner = owner;
		this.phoneNum = phoneNum;	
	}
	
	public void voicePhone() {
		System.out.println("음성통화기능");
	}
}