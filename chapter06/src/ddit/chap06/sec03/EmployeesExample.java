package ddit.chap06.sec03;

import java.util.List;
import java.util.Scanner;

//��������� ��ȸ�� �α����� �����ϴ� ���α׷��� �ۼ�
//������� : �����ȣ, �����, �μ���, ��ȭ��ȣ
//��ȸ������ �����ȣ ��ȸ, ����� ��ȸ, �μ��� ��ȸ, ��ü��ȸ
public class EmployeesExample {
	JDBCUtil jdbc = new JDBCUtil();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new EmployeesExample().init();

	}

	void init() {
		while (true) {
			System.out.println("[[�޴�]]");
			System.out.println("1.�α���");
			System.out.println("2.��ü��ȸ");
			System.out.println("3.�����ȣ[�����]");
			System.out.println("4.�����ȸ[�μ���]");
			System.out.println("9.����");
			System.out.println("--------------------------");
			System.out.println("����>>");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				login();
				break;
			case 2:
				select();
				break;
//			case 3:
//				selectOne();
//				break;
			case 4:
				selectList();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("������ȣ ���� ����");

			}
		}

	}

	public void login() {
		List<Object> param=new ArrayList<param>{
			
		}
		
		String sql="SELECT *FROM employees";
		Employee e1 = jdbc.selectList(sql);
		if (e1 != null) {
			System.out.println(e1.empName + "�� ȯ���մϴ�...");
		}

		}

	public void select() {
		List<Map<String,Object>>SelectList(){
			
		}
	}
	
	public void selectList() {
		System.out.println("�μ��� :");
		String deptName=sc.nextLine();

		List<Map<String,Object>> e1=jdbc.
	}
}
