package ddit.chap04.sec01;

import java.util.Random;

// ����(random  number)
//1)Math.random() ���
// .- 0.0�̻� 1.0�̸��� double�� ���� �߻�
//  1~ 50������ ������ ���� �߻�
// 	0.0 <= random() <1.0	
// 	0.0*50 <= random() <1.0*50	
//	0.0 <= random()*50 <50.0
//	(int)0.0 <=(int)(random()*50) < (int)50.0
//	0 <= (int)(random()*50) < 50
//	1 <= (int)(Math.random()*50)+1 < 51

//2)Random Ŭ����
//	Random rnd = new Random() --��ü����
//	int random = rnd.nextInt();
//	1~50������ ������ ����
//	int random=rnd.nextInt(50)+1

public class IfStatementExample02 {
		Random random = new Random();

	public static void main(String[] args) {//����ɶ� �����Ǵϱ� class���� ���ص���
//		Random random = new Random();
//		int dice = random.nextInt(6)+1;//�ֻ����� 1~6���� �ֱ⶧��, random�� 0���� �����ؼ� +1 ����
//		
		
		
//		int dice = (int)(Math.random()*6)+1;//.java.lang ��Ű���� ���ԵǾ� import ���ص� �� (Math,System+����ƽ�̶� Ŭ���� ������ �ʾƵ���
//		System.out.println("�ֻ��� ��:"+dice);
	}
}
