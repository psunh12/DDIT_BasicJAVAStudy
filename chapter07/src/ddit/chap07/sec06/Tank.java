package ddit.chap07.sec06;

public class Tank extends GroundUnit {
	
	Tank(int x, int y){
		super(x,y);
		
	}
	
	@Override
	void move(int x, int y) {
		String res="("+super.x+","+super.y+")";
		System.out.println(res+"���� ("+x+","+y+") ��ġ�� �̵�");
		
	}
	
	@Override
	public String toString() {
		return "TANK";
	}


}
