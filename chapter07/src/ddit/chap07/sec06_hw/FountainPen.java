package ddit.chap07.sec06_hw;

public class FountainPen extends Pen { // ������

	FountainPen(int amount, String color){
		super(amount, color);
		
	}
	public void refill(int n) {
		setAmount(n);
	}
	
	@Override
	public String toString() {
		return "���� �� : "+getAmount() + "\n���� : "+getColor();
	}

}