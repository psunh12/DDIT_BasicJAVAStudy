package chatGPT;

public class VehicleExample {

	public static void main(String[] args) {
		Car c1=new Car();
		System.out.println(c1.start());

	}

}

class Vehicle {
	
	
	String start() {
		return "출발합니다";
	}
}

class Car extends Vehicle {
	
	@Override
	String start() {
		return "자동차가 출발합니다";
	}

}