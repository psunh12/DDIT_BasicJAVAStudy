package ddit.chap05.sec03;

public class Developer {
	String name;
	int carrer;
	DeviceType type;
	static Developer d = new Developer();  
	public static void main(String[] args) {
//		getInfo();	
		getDevtype();
		
	}
	public static void getInfo() {
		d.name="������";
		d.carrer=5;
		d.type=DeviceType.SERVER;
		
		System.out.println("�����ڸ�: "+d.name);
		System.out.println("���߰��: "+d.carrer);
		System.out.println("������Ʈ: "+d.type);
	}
	
	public static void getDevtype() {
		for(DeviceType dev:DeviceType.values()) {
			System.out.println(dev+", "+dev.getName());
		}
	}
}

