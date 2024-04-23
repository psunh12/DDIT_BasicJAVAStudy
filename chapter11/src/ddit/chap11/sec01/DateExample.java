package ddit.chap11.sec01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

//java 1.8 ����
//Calendar, Date, SimpleDateFormat(formatter) ��¥ó��
//java 1.8 ����
// LocalDate, LocalDateTime Ŭ������ �����ͷ� DateTimeFormatterŬ���� ����
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
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//��������
		
		Date date =format.parse(dstr);
		System.out.println(date);
		
	}
	public static void dateMethod02() {
		String dstr="2023-10-02 12:31:42";
		//��¥��ȯ������������
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		//���ڿ��� date Ÿ������ ��ȯ
		LocalDateTime date = LocalDateTime.parse(dstr,formatter);
		System.out.println(date);
		System.out.println(date.getYear()+"/"+date.getMonthValue()+"/"+date.getDayOfMonth());//������ ���
		System.out.println(" "+date.getHour()+":"+date.getMinute()+":"+date.getSecond());
	}
}
