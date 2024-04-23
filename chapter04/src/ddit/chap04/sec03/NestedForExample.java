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
	 * *****:i=0 j=0~4		*  i=0 j=0 j<1 /(0실행)j=1되면 for문 조건이 맞지 않아 i for문으로 감
	 * *****:i=1 j=0~4		**  i=1 j=1 j<2/(0,1실행)j=2되면 for문 조건이 맞지 않아 i for문으로 감
	 * *****:i=2 j=0~4		*** i=2 j=2 j<3/(0,1,2실행)j=3되면 for문 조건이 맞지 않아 i for문으로 감
	 * *****:i=3 j=0~4		**** i=3 j=3 j<4/(0,1,2,3실행)j=4되면 for문 조건이 맞지 않아 i for문으로 감	
	 * *****:i=4 j=0~4		***** i=4 j=4 j<5/(0,1,2,3,4실행)j=5되면 for문 조건이 맞지 않아 i for문으로 감
	 *							  i=5 j=5	면 i for문에 부적합하기 때문에 for문 종료.
	 */
	
	/* 3)고정값에서 증가되는값 감소하기!	4)투명도형 있다고 생각하기(공백으로 표시)
	 * ***** i=0 j=0 j<5 			*****
	 * **** i=1 j=1 j<4				 ****
	 * *** i=2 j=2 j<3				  ***
	 * ** i=3 j=3 j<2				   **
	 * * i=4 j=2 j<1					*
	 */
	
	/* 5)						6)
	 * 				*				 *      i=0   	1개
	 * 			   **				***     i=1		3
	 * 			  ***			   *****    i=2		5
	 * 			 ****			  *******	i=3		7
	 * 			*****            *********	i=4		9 
	 */
	
	
	public void nestedMethod01() {
		for(int i=0; i<5; i++) {//줄수
			for(int j=0; j<5; j++) {//각 줄에 출력되는 문자의 갯수,0부터 4까지 
				System.out.print("*");//줄 바꾸지 않고 한줄로*출력
			}
			System.out.println();//줄바꿈
		}
	}
	public void nestedMethod02() {
		for(int i=0;i<5;i++){//줄수
			for(int j=0;j<i+1;j++) {//i값보다 무조건 +1
				System.out.print("*");
			}
			System.out.println();
		}
				
	}	
	public void nestedMethod03() {
		for(int i=0;i<5;i++) {//줄수 
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public void nestedMethod04() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++){//공백,j 사용 가능
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
			for(int j=0; j<4-i;j++) {//공백 출력 j=0 i=0 공백4칸 출력
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