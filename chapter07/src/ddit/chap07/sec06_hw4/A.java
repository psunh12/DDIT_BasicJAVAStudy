package ddit.chap07.sec06_hw4;

//1~10������ ��, ��(��-10)
public class A {

	int sum;
	int a;
	int minus;

	A() {
		this.sum = 0;
		this.a = 0;
		this.minus=minus;

		for (a = 1; a <= 10; a++) {
			sum += a;
		}
		minus=sum-10;
	}
	
	public void printInfo() {
		System.out.println("1~10������ ��: "+sum+"\n1~10������ �� -10: "+minus);
	}
}
