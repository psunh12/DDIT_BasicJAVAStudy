package ddit.chap02.sec03;

public class Homework {


	public static void main(String[] args) {
		/**
		1 ����  365.2422���̴�
		�̰��� 365�� 5�ð� xx�� xx�ʷ� ����ϴ�
		���α׷��� �ۼ��Ͻÿ�
		*/
	
		double year = 365.2422;
		int day = (int)year;
		
		double tmp1 = year - day;
		
		int hour= (int)(tmp1*24);

		double tmp2 = (tmp1*24)-hour;
		
		int minute= (int)(tmp2*60);
		
		double tmp3 = (tmp2*60)-minute;
		
		int sec=(int)(tmp3*60);
		
		System.out.println(day+"�� "+hour+"�ð� "+minute+"�� "+sec+"��");
	}

}
