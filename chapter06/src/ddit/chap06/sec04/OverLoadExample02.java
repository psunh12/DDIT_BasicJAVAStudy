package ddit.chap06.sec04;

public class OverLoadExample02 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.add('b',5);
		c1.add(10, 3.14);
		
	}
	
	//�����ε� ȣ���� �� �� �׻� �Ű����� Ȯ��
}
class Calculator{
	
	Calculator(){}
	
	public void add(int a, int b) {
		System.out.println("���="+(a+b));
	}
	public void add(char a, int b) {
		System.out.println("���="+(char)(a+b));
	}
	public void add(int a, double b) {
		System.out.println("���="+(a+b));
	}
	
}