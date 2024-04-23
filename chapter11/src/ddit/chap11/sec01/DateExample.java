package ddit.chap11.sec01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//java 1.8 이전
//Calendar, Date, SimpleDateFormat(formatter) 날짜처리
//java 1.8 이후
// LocalDate, LocalDateTime 클래스와 포멧터로 DateTimeFormatter클래스 샤용
public class DateExample {

	public static void main(String[] args) {
		try {
			dateMethod01();
			dateMethod02();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void dateMethod01() throws Exception{
		String dstr = "2023-10-02";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//형식지정
		
		Date date =format.parse(dstr);
		System.out.println(date);
		
	}
	public static void dateMethod02() {
		String dstr="2023-10-02 12:31:42";
		//날짜변환포맷형식지정
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		//문자열을 date 타입으로 변환
		LocalDateTime date = LocalDateTime.parse(dstr,formatter);
		System.out.println(date);
		System.out.println(date.getYear()+"/"+date.getMonthValue()+"/"+date.getDayOfMonth());//연도만 출력
		System.out.println(" "+date.getHour()+":"+date.getMinute()+":"+date.getSecond());
	}
}
