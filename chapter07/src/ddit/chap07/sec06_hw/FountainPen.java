package ddit.chap07.sec06_hw;

public class FountainPen extends Pen { // 만년필

	FountainPen(int amount, String color){
		super(amount, color);
		
	}
	public void refill(int n) {
		setAmount(n);
	}
	
	@Override
	public String toString() {
		return "남은 양 : "+getAmount() + "\n색깔 : "+getColor();
	}

}