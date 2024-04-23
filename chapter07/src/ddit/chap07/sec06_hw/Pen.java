package ddit.chap07.sec06_hw;

public class Pen {
	private int amount;
	private String color;
	private int width;

	//»þÇÁÆæ½½
	Pen(int width,int amount) {
		this.width =width;
		this.amount = amount;
	}
	//º¼Ææ,¸¸³â
	Pen(int amount, String color) {
		this.amount = amount;
		this.color = color;
	}
	

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}


}
