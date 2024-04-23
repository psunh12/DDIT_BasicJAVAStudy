package ddit.chap07.sec06_hw;

public class Ballpen extends Pen{ // º¼Ææ
	
	Ballpen(int amount, String color){
		super(amount,color);
		
	}
	
	@Override
	public String toString() {
		return "³²Àº ¾ç : "+getAmount() + "\n»ö±ò : "+getColor();
	}

}

