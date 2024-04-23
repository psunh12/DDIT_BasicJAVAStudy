package ddit.chap11.sec02;
//StringBuffer Ŭ����
// - String class�� ������ ����(immutable) ������ ������ ���ڿ� ���� �������
// - �ֿ�޼���
// .append()-���� ���� ���� �Ű������� ������ �����͸� �߰�
// .delete(int start, int end) : start ��ġ���� end-1 �����ִ� �ڷḦ ����
// .indexOf(String str) : str���ڿ��� ���� ��ġ�� ��ȯ
// .insert(int offset, ������) : offset ��ġ�� '������'�� ����
// .toString() : ����� ���ڿ�(String) Ÿ������ ��ȯ
// SELECT  MEMBER.MEM_NAME AS "ȸ����"
//,   MEMBER.MEM_JOB AS "����"
//,   MEMBER.MEM_MILEAGE AS "���ϸ���"
//FROM MEMBER
//WHERE MEMBER.MEM_JOB <> '������'
//AND MEMBER.MEM_MILEAGE>ANY(SELECT MEMBER.MEM_MILEAGE
//                FROM MEMBER
//                WHERE MEMBER.MEM_JOB='������');
public class StringBufferFxample {

	public static void main(String[] args) {
		String sql ="SELECT MEMBER.MEM_NAME, \n";//���� ��ĭ �� ��������
		sql=sql+"MEMBER.MEM_JOB, \n";
		sql=sql+"MEMBER.MEM_MILEAGE \n";
		sql=sql+"FROM MEMBER \n";
		sql=sql+"WHERE MEMBER.MEM_JOB <> '������' \n";
		sql=sql+"AND MEMBER.MEM_MILEAGE>ANY(SELECT MEMBER.MEM_MILEAGE \n";
		sql=sql+"FROM MEMBER \n";
		sql=sql+"WHERE MEMBER.MEM_JOB <> '������'";
		
		System.out.println(sql);
		
		StringBuffer sb=new StringBuffer();
		sb.append("SELECT MEMBER.MEM_NAME, \n");
		sb.append("MEMBER.MEM_JOB, \n");
		sb.append("MEMBER.MEM_MILEAGE \n");
		sb.append("FROM MEMBER \n");
		
		System.out.println(sb);
	}

}
