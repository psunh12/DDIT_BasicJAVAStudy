package ddit.chap05.sec02;
//�ִ�/�ּҰ��� ���ϱ�
//�ִ밪�� ���ϱ� ���� �����ϳ� ����
public class ArrayExample07 {

	public static void main(String[] args) {
		int[] num = {23, 41, 15, 60, 39, 52, 12};
		//�ִ밪
		int tmax=num[0];//�ӽ� �ְ��� �迭�� ù��
		int tmin=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(tmax<num[i]) tmax=num[i];
			if(tmin>num[i]) tmin=num[i];
			
		}
		System.out.println("�ִ밪:"+tmax);
		System.out.println("�ּҰ�:"+tmin);
	
	
	
	
	
	
	}

}
