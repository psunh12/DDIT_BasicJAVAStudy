package ddit.chap07.sec06_hw;

public class Ballpen extends Pen{ // ����
	
	Ballpen(int amount, String color){
		super(amount,color);
		
	}
	
	@Override
	public String toString() {
		return "���� �� : "+getAmount() + "\n���� : "+getColor();
	}

}

