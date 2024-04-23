package ddit.chap04.sec03;

public class NestedForExample {

	public static void main(String[] args) {
		NestedFor nestedFor = new NestedFor();
//		nestedFor.nestedMethod01();
//		nestedFor.nestedMethod02();
//		nestedFor.nestedMethod03();
//		nestedFor.nestedMethod04();
//		nestedFor.nestedMethod05();
		nestedFor.nestedMethod06();

	}

}
class NestedFor{
	/* 1)					2)
	 * *****:i=0 j=0~4		*  i=0 j=0 j<1 /(0����)j=1�Ǹ� for�� ������ ���� �ʾ� i for������ ��
	 * *****:i=1 j=0~4		**  i=1 j=1 j<2/(0,1����)j=2�Ǹ� for�� ������ ���� �ʾ� i for������ ��
	 * *****:i=2 j=0~4		*** i=2 j=2 j<3/(0,1,2����)j=3�Ǹ� for�� ������ ���� �ʾ� i for������ ��
	 * *****:i=3 j=0~4		**** i=3 j=3 j<4/(0,1,2,3����)j=4�Ǹ� for�� ������ ���� �ʾ� i for������ ��	
	 * *****:i=4 j=0~4		***** i=4 j=4 j<5/(0,1,2,3,4����)j=5�Ǹ� for�� ������ ���� �ʾ� i for������ ��
	 *							  i=5 j=5	�� i for���� �������ϱ� ������ for�� ����.
	 */
	
	/* 3)���������� �����Ǵ°� �����ϱ�!	4)������ �ִٰ� �����ϱ�(�������� ǥ��)
	 * ***** i=0 j=0 j<5 			*****
	 * **** i=1 j=1 j<4				 ****
	 * *** i=2 j=2 j<3				  ***
	 * ** i=3 j=3 j<2				   **
	 * * i=4 j=2 j<1					*
	 */
	
	/* 5)						6)
	 * 				*				 *      i=0   	1��
	 * 			   **				***     i=1		3
	 * 			  ***			   *****    i=2		5
	 * 			 ****			  *******	i=3		7
	 * 			*****            *********	i=4		9 
	 */
	
	
	public void nestedMethod01() {
		for(int i=0; i<5; i++) {//�ټ�
			for(int j=0; j<5; j++) {//�� �ٿ� ��µǴ� ������ ����,0���� 4���� 
				System.out.print("*");//�� �ٲ��� �ʰ� ���ٷ�*���
			}
			System.out.println();//�ٹٲ�
		}
	}
	public void nestedMethod02() {
		for(int i=0;i<5;i++){//�ټ�
			for(int j=0;j<i+1;j++) {//i������ ������ +1
				System.out.print("*");
			}
			System.out.println();
		}
				
	}	
	public void nestedMethod03() {
		for(int i=0;i<5;i++) {//�ټ� 
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void nestedMethod04() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++){//����,j ��� ����
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) { 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}	
	public void nestedMethod05() {
		for(int i=0;i<5;i++) {
			for(int j=0; j<4-i;j++) {//���� ��� j=0 i=0 ����4ĭ ���
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void nestedMethod06() {
		for(int i=0;i<5;i++) {
			for(int j=0; j<4-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	
}