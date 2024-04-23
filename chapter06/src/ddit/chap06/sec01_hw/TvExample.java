package ddit.chap06.sec01_hw;

public class TvExample {

	public static void main(String[] args) {
		Tv t1 = new Tv("LG전자",2023,85.5);
		System.out.println(t1);
//		t1.company = "LG전자";
//		t1.prodYear = 2023;
//		t1.size = 85.5;
//
//		System.out.println("제조사: " + t1.company);
//		System.out.println("생산년도: " + t1.prodYear);
//		System.out.println("크기: " + t1.size);

	}

}

class Tv {
	String company;
	int prodYear;
	double size;

	Tv(String company,int prodYear,double size){
		this.company=company;
		this.prodYear=prodYear;
		this.size=size;
		
	}
	@Override
	public String toString() {
		return "제조사 : "+company+"\n생산년도 : "+prodYear+
				"\n크기: "+size;
	}
}
