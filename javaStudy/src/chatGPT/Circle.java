package chatGPT;

public class Circle {
	double radius;
	final double PI = 3.141592;
	
	
	Circle(double radius){
		this.radius=radius;
	}
	
	String getRound() {
		return "���ǵѷ�:"+2*radius*PI; 
	}
	
	String getArea() {
		return "���ǳ���:"+radius*radius*PI; 
	}

}
