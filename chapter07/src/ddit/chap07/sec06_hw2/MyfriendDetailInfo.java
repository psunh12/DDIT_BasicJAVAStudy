package ddit.chap07.sec06_hw2;

public class MyfriendDetailInfo extends MyFriendInfo {
	String address;
	String phoneNum;
	
	MyfriendDetailInfo(String name, int age, String address, String phoneNum){
		super(name, age);
		this.address=address;
		this.phoneNum=phoneNum;
	}
	
	public void printInfo() {
		System.out.println("�̸�: "+name+"\n����: "+age+"\n�ּ�: "+address+"\n��ȭ: "+phoneNum);
	}
		
}
