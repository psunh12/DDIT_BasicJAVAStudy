package ddit.chap05.sec03;

public enum DeviceType {
	MOVILE("�ȵ���̵�"),
	WEB("������"),
	SERVER("������");
	
	
	private final String name;//�ȵ���̵�, ������, �������� ��ȯ��ų ���� ��
	
	DeviceType(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
