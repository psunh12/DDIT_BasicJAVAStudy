package ddit.chap07.sec07;

public abstract class Shape {//�߻�޼��尡 ���ԵǸ� �߻�Ŭ������ �����ؾ���
	String color;
	String kind;
	
	public Shape(String color, String kind) {
		this.color=color;
		this.kind=kind;
	}
	
	public abstract void draw();

	public String toString() {
		return "������ ���� : "+kind+"\n�������� : "+color;
	}
	
}
