package ddit.cordingTest.day2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(a.length() >=1 && b.length() >=1 && a.length() <=10 && b.length() <=10) {
        	System.out.println(a+b);
        	
        }
	}
}

