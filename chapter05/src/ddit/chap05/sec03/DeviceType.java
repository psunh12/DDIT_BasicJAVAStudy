package ddit.chap05.sec03;

public enum DeviceType {
	MOVILE("안드로이드"),
	WEB("스프링"),
	SERVER("리눅스");
	
	
	private final String name;//안드로이드, 스프링, 리눅스가 반환시킬 값이 됨
	
	DeviceType(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
}
