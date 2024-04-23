package ddit.chap06.sec03;
//여러 종류의 자료를 입력받아 삼각형의 넓이를 반환하는 메서드(getTtiagelArea())를 작성
//데이터의 종류는 다음과 같다.
//(int,float),(double, int),(int,int)
public class OverLoadEx01 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("삼각형 넓이 = "+t.getTriangleArea(15));
		System.out.println("삼각형 넓이 = "+t.getTriangleArea(15,31.5f));
	}

}


class Triangle{
	float	getTriangleArea(int width, float height) {
		float res=width*height/2;
		return res;
	}

	double	getTriangleArea(int width, double height) {
		return width*height/2;
	}
	double	getTriangleArea(int height, int width) {
		return width*height/2.0;
	}
	double	getTriangleArea(int height) {
		return height*height/2.0;//정삼각형
	}

}