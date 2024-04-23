package ddit.chap11.sec03;

import java.util.ArrayList;
import java.util.List;

//Wrapper class : Byte, Short, Integer, Long, Float, Double, Character, Boolean
// - �⺻�� �����͸� ��ü�� ��ȯ
// - Boxing : �⺻�� => ��ü�� ��ȯ
//	 . ������ �޼��� �̿�
//	 . valueOf() ���
// - Unboxing : ��ü =>�⺻
//	 . �⺻ Ÿ�� �̸�+Value()
public class WrapperExample {

	static List<Integer> list =new List<>();
	public static void main(String[] args) {
		boxingMethod1();
	}
	
	public static void boxingMethod1() {
		//������ �޼��� �̿�
		Integer obj1 = new Integer(100);
		
		int res = obj1%7;
		
		boolean flag=obj1 >= 70;
		
		List<Integer> list = new ArrayList<>();
		list.add(obj1);
		list.add(new Integer(70));
		list.add(35);//list.add(new Integer(35))
		list.add(Integer.valueOf("500"));
	}
	
	public static void unboxingMethod2() {	
		Integer i1=list.get(0);
		int res= i1.intValue()+50;
		
		int res1=list.get(0)+50;
		
	}
	
}