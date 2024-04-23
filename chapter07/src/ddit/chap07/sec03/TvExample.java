package ddit.chap07.sec03;

public class TvExample {

	public static void main(String[] args) {
		ColorTv ctv1 = new ColorTv("컬러티비",55,1024);
		System.out.println(ctv1);
		
		System.out.println("---------------------------------");
		
		IpTv iptv1 = new IpTv("IP티비",80,2500,"192.168.32.102");
		System.out.println(iptv1);
		
		

		
	}

}
