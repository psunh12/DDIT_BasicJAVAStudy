package ddit.chap07.sec03;

public class ColorTv extends Tv {
	protected int resolution;

	ColorTv(String tvname,int size, int resolution) {
		super(tvname,size);
		this.resolution = resolution;
	}

	public int getResolution(){
	
		return resolution;
	}
	@Override
	public String toString() {
		return "티비이름: "+tvname+"\n사이즈: "+size+"\n화소:"+resolution;
	}
}