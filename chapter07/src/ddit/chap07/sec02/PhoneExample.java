package ddit.chap07.sec02;

public class PhoneExample {

	public static void main(String[] args) {
		//������2Ŭ������ ����... ��ӻ�ӻ��
		Iphone1 ip1=new Iphone1("������","010-1234-5678");
		
		System.out.println("������ : "+ip1.owner);
		System.out.println("��ȭ��ȣ : "+ip1.phoneNum);
		ip1.voicePhone();
		ip1.playMusic();
		
		System.out.println("---------------------------");
		Iphone2 ip2=new Iphone2("������","010-9876-1234");
		
		System.out.println("������ : "+ip2.owner);
		System.out.println("��ȭ��ȣ : "+ip2.phoneNum);
		ip2.voicePhone();
		ip2.playMusic();
		ip2.fingerPrintRecog();
		
	}

}
