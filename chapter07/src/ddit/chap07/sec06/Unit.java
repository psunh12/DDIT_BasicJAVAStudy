package ddit.chap07.sec06;

public abstract class Unit {
	 int x, y;//��ġ��

	 abstract void move(int x, int y);
	 void stop() {
		 System.out.println("�� ��ġ("+x+","+y+")���� ����");
	 }
	 
	 
}
