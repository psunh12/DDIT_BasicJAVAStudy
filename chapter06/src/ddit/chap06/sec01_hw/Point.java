package ddit.chap06.sec01_hw;
//�������� x,y���� �����ϴ� Ŭ����.                 ��   
public class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {//private�� �ʿ���. ����� ��ǻ� �ʿ����
		return x;
	}

	public int getY() {//private�� �ʿ���. ����� ��ǻ� �ʿ����
		return y;
	}
}
