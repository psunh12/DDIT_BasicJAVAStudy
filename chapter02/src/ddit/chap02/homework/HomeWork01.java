package ddit.chap02.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		1 ����  365.2422���̴�
		�̰��� 365�� 5�ð� xx�� xx�ʷ� ����ϴ�
		���α׷��� �ۼ��Ͻÿ�(Ǯ��-����ȯ ���)
		*/
		
		double y =365.2422; //�ǹ������� ����ڰ� ����ϴ°��� �ּ�ȭ �ؾ���
		
		int days = (int)y; //�ϼ�
		//== int days = (int)365.2422;
		
		double hour = (y-days)*24;
		int hours = (int)hour; //�ð�
		
		double minute = (hour-hours)*60;
		int minutes = (int)minute;//��
		
		double second = (minute-minutes)*60;
		int seconds = (int)second; //��
		
		
		System.out.println("1���� "+days+"��"+hours+"�ð�"+minutes+"��"+seconds+"�� �Դϴ�." );
	}

}
