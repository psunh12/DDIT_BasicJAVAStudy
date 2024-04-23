package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample03 {

	public static void main(String[] args) {
		//배열 복사
		//- shallow copy: 배열명이 가지고 있는 배열의 주소 값만 복사
		//				    부작용(side effect)발생
		//				    메서드의 매개변수 전달방식이 이 복사 방법임
		// -deep copy: 	    배열공간이 별도로 확보되고 내용이 복사되는 방식
		//				  clone(), System.arraycopy(), for문 이용

		ArrayCopy acopy = new ArrayCopy();
//		acopy.arraymethod01();
		acopy.deepCopy01();
//		acopy.deepCopy02();
//		acopy.deepCopy03();

	}
}

class ArrayCopy{
	public void arraymethod01() {
		//문자열저장
		String[] word = {"apple", "banana", "persimon", "melon", "lemon"};
		
		String rndWord = selectOne(word);
		System.out.println(rndWord);
		System.out.println(word[2]);
	}
	public String selectOne(String[] fname) {
		Random r =new Random();
		fname[2]="호두";//2번주소를 호두로 변경
		int rnd= r.nextInt(5);//랜덤으로 출력되는 난수 발생 >5 의 의미로 0~4사이의 정수형 난수
		return fname[rnd];
			
	}
	
	public void deepCopy01() {
		//clone()를 이용한 배열복사
		// - Object class의 clone() 사용
		// - 타입[] 복사받을 배열명 = 복사해줄 배열명.clone();
		
		int[] source = {10,20,30,40,50};
		int[] target = source.clone();
		System.out.println("원본배열 : "+Arrays.toString(source));
		System.out.println("복사배열 : "+Arrays.toString(target));
		
		
	}
	public void deepCopy02() {
		//System.arraycopy(원본배열명, 복사해줄위치, 복사배열명, 복사받을위치, 복사받을 갯수);
		int[] source = {90, 70, 85, 76, 95};
		int[] target = new int[10];
		
		
		System.arraycopy(source, 0, target, 5, source.length );
		
		System.out.println("\nsource : ");
		for(int i=0; i<source.length; i++) {
			System.out.printf("%3d,",source[i]);
		}		
		
		System.out.println("\ntarget : ");
		for(int i=0; i<target.length; i++) {
			System.out.printf("%3d,",target[i]);
		}
	}
	public void deepCopy03() {
		//for문을 이용하는 방법
		int[] source = {90, 70,85,76,95};
		int[] target =  new int[5];
		System.out.println("복사 전");
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("target : "+Arrays.toString(target));
		
		for(int i =0; i<source.length; i++) {
			target[1] = source[i];
		}
		System.out.println("복사 후");
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("target : "+Arrays.toString(target));
	}
}