package ddit.chap06.sec01_hw;

//getter setter ����ϴ� ����
/*
 * ��ü�� ���Ἲ�� ��ġ�� �ʰ� �����͸� �����ϰ� ����ϴ°��� ����.
 * set - private�� ����� �ʵ��� ���� �����ϰ��� �� �� �ʿ�.(������ ����)
 * get - �����͸� �о���� ����
 */
public class Student1 {
	private long studID;
	private String major;
	

	public long getStudID() {
		return studID;
	}
	public void setStudID(long studID) {
		this.studID = studID;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	                
}