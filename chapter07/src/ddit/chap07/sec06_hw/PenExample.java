package ddit.chap07.sec06_hw;

public class PenExample {

	public static void main(String[] args) {
		SharpPencil sp = new SharpPencil(1, 10);
		
		FountainPen fp = new FountainPen(20, "������");
		
		Ballpen bp = new Ballpen(20, "�Ķ���");
		
		
		
		System.out.println("[�����潽]");
		System.out.println(sp);
		
		System.out.println("[������]");
		System.out.println(fp);
		
		System.out.println("[����]");
		System.out.println(bp);
	}

}
