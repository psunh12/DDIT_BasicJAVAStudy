package chatGPT;

public class Rectangle {
	double width;
	double height;
	
	Rectangle(double width,double height ){
		this.width=width;
		this.height=height;
		
	}
	
	double RectangleArea () {
		return width*height;
	}

	double RectangleDulRea () {
		return 2*(width+height);
	}
	
}
