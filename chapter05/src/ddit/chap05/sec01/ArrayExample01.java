package ddit.chap05.sec01;

import java.util.Arrays;

public class ArrayExample01 {

	public static void main(String[] args) {
		arrayMethod01();
	}
	public static void arrayMethod01() {
		//'A' ~ 'Z' 배열에 저장하고 출력
		char[] alpha = new char[26];//길이가 26인 char타입 alpha를 선언함
		
		for(int i =0; i<alpha.length; i++) {//alpha 길이만큼 반복
			alpha[i]=(char)(i+65);
		}
		for(int i=0; i<alpha.length; i++) {
	}
		System.out.println("alpha="+Arrays.toString(alpha));//alpha 배열내용 출력하기
	
		
	

	}
	public String toString() {
		return getClass().getName()+'@'+Integer.toHexString(hashCode());
		//해시코드의 주소를 10진수로 바꾼걸 16진수 문자열로 바꾸어라.(그냥 출력하면 alpha=[C@15db9742)
	}
}
