package ddit.chap07.sec07;

public abstract class Shape {//추상메서드가 포함되면 추상클래스로 정의해야함
	String color;
	String kind;
	
	public Shape(String color, String kind) {
		this.color=color;
		this.kind=kind;
	}
	
	public abstract void draw();

	public String toString() {
		return "도형의 종류 : "+kind+"\n바탕색상 : "+color;
	}
	
}
