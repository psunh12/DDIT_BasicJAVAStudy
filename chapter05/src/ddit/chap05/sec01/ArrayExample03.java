package ddit.chap05.sec01;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample03 {

	public static void main(String[] args) {
		//�迭 ����
		//- shallow copy: �迭���� ������ �ִ� �迭�� �ּ� ���� ����
		//				    ���ۿ�(side effect)�߻�
		//				    �޼����� �Ű����� ���޹���� �� ���� �����
		// -deep copy: 	    �迭������ ������ Ȯ���ǰ� ������ ����Ǵ� ���
		//				  clone(), System.arraycopy(), for�� �̿�

		ArrayCopy acopy = new ArrayCopy();
//		acopy.arraymethod01();
		acopy.deepCopy01();
//		acopy.deepCopy02();
//		acopy.deepCopy03();

	}
}

class ArrayCopy{
	public void arraymethod01() {
		//���ڿ�����
		String[] word = {"apple", "banana", "persimon", "melon", "lemon"};
		
		String rndWord = selectOne(word);
		System.out.println(rndWord);
		System.out.println(word[2]);
	}
	public String selectOne(String[] fname) {
		Random r =new Random();
		fname[2]="ȣ��";//2���ּҸ� ȣ�η� ����
		int rnd= r.nextInt(5);//�������� ��µǴ� ���� �߻� >5 �� �ǹ̷� 0~4������ ������ ����
		return fname[rnd];
			
	}
	
	public void deepCopy01() {
		//clone()�� �̿��� �迭����
		// - Object class�� clone() ���
		// - Ÿ��[] ������� �迭�� = �������� �迭��.clone();
		
		int[] source = {10,20,30,40,50};
		int[] target = source.clone();
		System.out.println("�����迭 : "+Arrays.toString(source));
		System.out.println("����迭 : "+Arrays.toString(target));
		
		
	}
	public void deepCopy02() {
		//System.arraycopy(�����迭��, ����������ġ, ����迭��, ���������ġ, ������� ����);
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
		//for���� �̿��ϴ� ���
		int[] source = {90, 70,85,76,95};
		int[] target =  new int[5];
		System.out.println("���� ��");
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("target : "+Arrays.toString(target));
		
		for(int i =0; i<source.length; i++) {
			target[1] = source[i];
		}
		System.out.println("���� ��");
		System.out.println("source : "+Arrays.toString(source));
		System.out.println("target : "+Arrays.toString(target));
	}
}