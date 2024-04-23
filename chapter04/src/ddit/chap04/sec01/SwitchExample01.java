package ddit.chap04.sec01;

import java.io.IOException;

public class SwitchExample01 {

	public static void main(String[] args) {
		//Ű����� �����ѱ��ڸ� �Է� �޾� �� ����
		//'c' �̸� db�� insert����
		//'r' �̸� select����
		//'u' �̸� update����
		//'d' �̸� delete���� �ۼ��ϰ�
		// �� �̿��� ���ڰ� �ԷµǸ� "�۾������� �߸��Ǿ����ϴ�"�� ���
		
		SwitchStatement ss =new SwitchStatement();
		try {
			ss.inputChoice();
		}catch(IOException e) {
			System.out.println("���ܹ߻� : "+e.getMessage());
		}
	}
}	

class SwitchStatement {
	String sql;
	
	public void inputChoice() throws IOException{
		
		System.out.println("[[�޴�]]");
		System.out.println("[c] �� ��");
		System.out.println("[r] �� ��");
		System.out.println("[u] �� ��");
		System.out.println("[d] �� ��");
		System.out.println("--------------");
		System.out.println("�۾���ȣ ���� : ");
		int choice =System.in.read();//Ű����� �ѱ��ڸ� �Է¹޾� ���������� ��ȯ���� ��ȯ(try catch ���)
		
		switch((char)choice) {
			case 'c' :
			case 'C' :
				sql=" INSERT INTO member(mem_id, mem_name, mem_add1, mem_hp)\n";
				sql = sql + "VALUES('a001', '������',' ������ �߱� ���� 846','010-1234-5678');" ;
				break;
				
			case 'r' :
			case 'R' :
				sql =" SELECT * \n FROM member\n";
				sql= sql + "WHERE mem_add LIKE '����%'";
				break;
				
			case 'u' :
			case 'U' :
				sql = "UPDATE member \n SET mem_mileage=mem_mileage +amt\n";
				sql=sql +"WHERE mem_id = 'a001'";
				break;
				
			case 'd' :
			case 'D' :
				sql = "DELETE FROM member WHERE mem_id = 'a001'\n";
				break;

			default :
				System.out.println("�۾���ȣ�� �߸� �����ϼ̽��ϴ�.");
				sql = "������ �۾� ����";		
		}
		System.out.println("������ �۾�");
		System.out.println(sql);
	}
}
