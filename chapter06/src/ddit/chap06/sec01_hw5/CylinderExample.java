package ddit.chap06.sec01_hw5;

import java.util.Scanner;

import ddit.chap06.sec01_hw.Circle;

public class CylinderExample {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������ : ");
		double radius = sc.nextDouble();
		
		Cylinder1 c1 = new Cylinder1(new Circle1(radius),5.6); 
		System.out.println("������� ����: "+c1.getVolumn());
	}

}
