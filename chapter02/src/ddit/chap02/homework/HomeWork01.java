package ddit.chap02.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		1 년은  365.2422일이다
		이것을 365일 5시간 xx분 xx초로 계산하는
		프로그램을 작성하시오(풀이-형변환 사용)
		*/
		
		double y =365.2422; //실무에서는 사용자가 기술하는것을 최소화 해야함
		
		int days = (int)y; //일수
		//== int days = (int)365.2422;
		
		double hour = (y-days)*24;
		int hours = (int)hour; //시간
		
		double minute = (hour-hours)*60;
		int minutes = (int)minute;//분
		
		double second = (minute-minutes)*60;
		int seconds = (int)second; //초
		
		
		System.out.println("1년은 "+days+"일"+hours+"시간"+minutes+"분"+seconds+"초 입니다." );
	}

}
