package ddit.chap06.sec03;
//���� ������ �ڷḦ �Է¹޾� �ﰢ���� ���̸� ��ȯ�ϴ� �޼���(getTtiagelArea())�� �ۼ�
//�������� ������ ������ ����.
//(int,float),(double, int),(int,int)
public class OverLoadEx01 {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("�ﰢ�� ���� = "+t.getTriangleArea(15));
		System.out.println("�ﰢ�� ���� = "+t.getTriangleArea(15,31.5f));
	}

}


class Triangle{
	float	getTriangleArea(int width, float height) {
		float res=width*height/2;
		return res;
	}

	double	getTriangleArea(int width, double height) {
		return width*height/2;
	}
	double	getTriangleArea(int height, int width) {
		return width*height/2.0;
	}
	double	getTriangleArea(int height) {
		return height*height/2.0;//���ﰢ��
	}

}