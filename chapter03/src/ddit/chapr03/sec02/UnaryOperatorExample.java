package ddit.chapr03.sec02;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		//Ŭ���� ��ü����
		//Ŭ������ ��ü������=new Ŭ������();
		UnaryOperator oper = new UnaryOperator();//oper�� �̿��Ͽ� �ϴ� class�� ����� �� ����
//		oper.incrementOperator();//��밡���Ѱ� �ʷϻ� ���� ����, arg �Ű�����,�Ķ����-object ������
		oper.complementMethod();
		
		
	}

}


//Ŭ���� �� ���Ͽ� ����ϴ� ���
class UnaryOperator{
		
	public void incrementOperator() {
		//���� ������ : ++
		//	���׿�����, ������ ���� 1�� ����
		//	++���� : ������ ǥ���(prefix) - '����' �ڽ��� 1 ������ ���� ������
		//			������ ���� ��ȯ(������ �Ͼ�� ������ �Ͼ)
		//	����++ : ������ ǥ���(postfix) - '����' �ڽ��� 1 ������ ���� ������
		//			�����Ǳ� �� ���� ��ȯ(������ �Ͼ�� ������ �Ͼ)
		
//		int[] num = {10,20,30,40,50};
//		
//		int j = 4;
//		System.out.println(num[j++]);//j�� 5�� ������ ������ �����Ǳ� ������ 4������ ���� �������!
//		System.out.println(num[++j]);=>����! 5������ ���� ������ �;��ϴµ� 5������ ����
		
		int i =10;
		
		//i++;
		++i;
		System.out.println("i="+i);
		
		i=10;
		//int res = i++; ���� �� 1����
		int res = ++i;//���� �ڱ��ڽ��� 1���� �� �� ������
		System.out.println("i="+i);
		System.out.println("res="+res);

		
	}
		public void complementMethod() {
			// ~ : 1�� ���� ������
			int val=15;//va1�� 1�� ���� -16
			System.out.println("val="+val);
			
			int val1 = ~ val;
			System.out.println("val�� 1�� ���� = "+val1);
		}
}