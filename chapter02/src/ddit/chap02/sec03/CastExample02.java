package ddit.chap02.sec03;

public class CastExample02 {

	public static void main(String[] args) {
		//문자열(String 객체,클래스 의미) => 기본형(byte, short, int, long, float, double, char, boolean)
		//바꿀 타입의 Wrapper 클래스, parse 타입명(문자열)
		
		// Wrapper 클래스				타입명
		
		/*정수*/
		// int => Integer			Int
		// byte => Byte				Byte
		// short => Short			Short(실무에서 거의안씀)
		// long => Long				Long
		
		/*실수*/
		// float => Float			Float(실무에서 거의안씀)
		// double => Double			Double
		
		/*문자형*/
		// char => Character		Char
		
		
		// boolean => Boolean		Boolean
		
		
		float f = 0.1f;//f를 붙여야 하는 번거로움이 있음(잘 안씀)
		double d = 0.1;
		
		
		
		String val1="15";//실수로 변경(double or float), string 클래스는 변경될수 없는 클래스 immutable? 효율 낮음
		
		//float res1=Float.parseFloat(val1);//parse 잘라서 분해한다
		
		int res2=Integer.parseInt(val1);
		
		System.out.println(res2);
		
		//System.out.println(res1+10);//27.5+10 하면 27.510 으로 출력됨
		
		
	}

}
