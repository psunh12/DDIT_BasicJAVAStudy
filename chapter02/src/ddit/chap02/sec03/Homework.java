package ddit.chap02.sec03;

public class Homework {


	public static void main(String[] args) {
		/**
		1 년은  365.2422일이다
		이것을 365일 5시간 xx분 xx초로 계산하는
		프로그램을 작성하시오
		*/
	
		double year = 365.2422;
		int day = (int)year;
		
		double tmp1 = year - day;
		
		int hour= (int)(tmp1*24);

		double tmp2 = (tmp1*24)-hour;
		
		int minute= (int)(tmp2*60);
		
		double tmp3 = (tmp2*60)-minute;
		
		int sec=(int)(tmp3*60);
		
		System.out.println(day+"일 "+hour+"시간 "+minute+"분 "+sec+"초");
	}

}
