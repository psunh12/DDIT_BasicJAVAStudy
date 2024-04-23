package ddit.chap07.sec06_hw;

public class PenExample {

	public static void main(String[] args) {
		SharpPencil sp = new SharpPencil(1, 10);
		
		FountainPen fp = new FountainPen(20, "°ËÁ¤»ö");
		
		Ballpen bp = new Ballpen(20, "ÆÄ¶û»ö");
		
		
		
		System.out.println("[»þÇÁÆæ½½]");
		System.out.println(sp);
		
		System.out.println("[¸¸³âÇÊ]");
		System.out.println(fp);
		
		System.out.println("[º¼Ææ]");
		System.out.println(bp);
	}

}
