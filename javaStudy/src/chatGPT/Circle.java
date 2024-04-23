package chatGPT;

public class Circle {
	double radius;
	final double PI = 3.141592;
	
	
	Circle(double radius){
		this.radius=radius;
	}
	
	String getRound() {
		return "원의둘레:"+2*radius*PI; 
	}
	
	String getArea() {
		return "원의넓이:"+radius*radius*PI; 
	}

}
