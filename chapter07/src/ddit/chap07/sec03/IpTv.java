package ddit.chap07.sec03;

public class IpTv extends ColorTv {
	protected String address;

	IpTv(String tvname,int size, int resolution, String address) {
		super(tvname,size,resolution);
		this.address = address;
	}
	public String getIpAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Ƽ���̸�: "+tvname+"\n������: "+size+"\nȭ��:"+resolution+"\nIp�ּ�:"+address;
	}
}