package ddit.chap07.sec06_hw;

public class SharpPencil extends Pen { // »þÇÁÆæ½½

	SharpPencil(int amount, int width) {
		super(amount, width);

	}
	
	@Override
	public String toString() {
		return "³²Àº ¾ç : "+getAmount() + "\n±½±â : "+getWidth();
	}

}