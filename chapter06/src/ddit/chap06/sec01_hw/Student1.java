package ddit.chap06.sec01_hw;

//getter setter 사용하는 이유
/*
 * 객체의 무결성을 해치지 않고 데이터를 안전하게 사용하는것이 가능.
 * set - private로 선언된 필드의 값을 수정하고자 할 때 필요.(데이터 변경)
 * get - 데이터를 읽어오는 역할
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