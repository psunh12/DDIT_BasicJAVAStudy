package ddit.chap07.sec03;

public class Tv {
	protected String tvname;
	protected int size;
	
	
	
	Tv(String tvname, int size){
		this.tvname=tvname;
		this.size=size;
		
	}
	public int getSize() {
		return size;
	}
	@Override
	public String toString() {
		return "Ƽ���̸�: "+tvname+"\n������: "+size;
	}
}
