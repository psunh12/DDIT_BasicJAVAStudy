package ddit.chap06.sec01_hw;
//꼭지점의 x,y값을 보관하는 클래스.                 ㅜ   
public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {//private면 필요함. 현재는 사실상 필요없음
		return x;
	}

	public int getY() {//private면 필요함. 현재는 사실상 필요없음
		return y;
	}
}
