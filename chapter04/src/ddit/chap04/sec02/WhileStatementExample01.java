package ddit.chap04.sec02;
//1-10���� ���� ���ϴ� ���α׷�
public class WhileStatementExample01 {

	public static void main(String[] args) {
//		whileMethod01();
//		whileMethod02();
		whileMethod03();
	}
	public static void whileMethod01() {
		//class ������ �ʰ� �ٷ� ��밡��.������Ʈ���� class �����ؼ� ����!
		//while�� �ȿ��� ���ǿ� ����� ������ ������ �Ϸ��� �ۿ��� �����ϱ�
		int sum=0;//���� ����
		int cnt=0;//1-10������ ���ڰ� ����
		
		while(cnt<=10) {
			sum+=cnt;
			cnt++;
		}
		System.out.println("��="+sum);
	}
	//1-2+3-4...10=?
	public static void whileMethod02() {
		int sum=0;//���
		int cnt=1;//1-10������ ����
		int sign=-1;//��ȣ
		
		while(cnt<=10) {
			sign=sign*(-1);
			sum=sum+(sign*cnt);
			if(sign>0 && cnt !=1){
				System.out.print("+"+cnt);//1�̾ƴ� �������?
			}else {
				System.out.print(sign*cnt);
			}
			cnt++;
			
		}
		System.out.print("="+sum);
		
	}
	//ù���� 100��, �� ���������� ������ 2�辿 ������ �ҋ� ���ʷ� 100������ �Ѵ� ���� 
	//�׳����� ������ �׼��� ���Ͻÿ�.
	public static void whileMethod03() {
		//���� ���� �����ϱ�: ���ͱ�, ��¥, �׳��׳� �����ϴ� �׼�
		
		int sum =0;//������
		int amount = 100;//100���� �⺻������ ����
		int days=0;//0���� �ʱ�ȭ.
		
		while(sum<=1000000) {
			sum=sum+amount;
			amount=2*amount;
			days++;
		}
		System.out.println("���� = "+days);
		System.out.println("����� = "+sum);
		
	}
	
	
	
}
