package kr.or.ddit.study;

import java.util.Random;
import java.util.Scanner;

public class Study20230908 {

	
		Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			Study20230908 obj = new Study20230908();
			obj.test5();
		}

		public void test1() {

			System.out.println("��ĳ�ʸ� �̿��Ͽ� ���ڸ� �Է� �ް� �ش� ���ڿ� �ش��ϴ� �������� ����Ͻÿ�");
			String s = sc.nextLine();
			int dan = (int)(Math.random()*8)+2;

			
			
		}

		public void test2() {

			System.out.println("for �� 2���� �̿��Ͽ� �������� ����Ͻÿ�");
			System.out.println("ex");


		}
		
		public void test3() {
			System.out.println("for �� 2���� �̿��Ͽ� �������� ����Ͻÿ�.");
			System.out.println("���ڸ� �Է��Ͽ� �ش� �������� �����ϰ� ��� �Ͻÿ�");
			int dan = (int)(Math.random()*8)+2;

	 
		}
		
		
		public void test4() {
			/*
			 	���� ���� n�� �Ű������� �־��� ��, 
			 	n�� Ȧ����� n ������ Ȧ���� ��� ���� ������ ���� ��� 
			    n�� ¦����� n ������ ¦���� ��� ���� ������ ������ ���� ��� �ϼ���.
			 * 
			 */
			
			int n = (int)(Math.random()*50)+1;
		}
		
		public void test5() {
			/*
			 *  �ζǴ� 1~45�� ���ڷ� �����Ǿ� ������ 
			    �ߺ����� �ʴ´�.
			    ���� 6���� �ߺ����� ���� ���ڸ� �Է��ϰ� ����Ͻÿ�.
			 */
			
			int a0 =0 , a1 =0 , a2 =0 , a3 = 0 , a4 = 0 , a5 = 0 ;
		
			for(int i=0; i<6; i++) {
				int current = (int)(Math.random()*6)+1;
				for(int j=0; j<i; j++) {
					int before = 0;
				
				}
			}
			System.out.println(a0+", "+a1+", "+ a2 +", " +a3 +", "+ a4 + ", "+ a5 );
			
		}
	}