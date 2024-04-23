package ddit.chap07.sec06_hw3;

public class ColorPoint extends Point {
	String color;
	
	ColorPoint(int x, int y, String color){
		super(x, y);
		this.color=color;
	}
	public void printInfo() {
		System.out.println(color+"("+x+","+y+")");
	}
}
