package ddit.chap07.sec06_hw;

public class SharpPencil extends Pen { // �����潽

	SharpPencil(int amount, int width) {
		super(amount, width);

	}
	
	@Override
	public String toString() {
		return "���� �� : "+getAmount() + "\n���� : "+getWidth();
	}

}