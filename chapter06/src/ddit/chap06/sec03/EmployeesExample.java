package ddit.chap06.sec03;

import java.util.List;
import java.util.Scanner;

//사원정보의 조회와 로그인을 수행하는 프로그램을 작성
//사원정보 : 사원번호, 사원명, 부서명, 전화번호
//조회조건은 사원번호 조회, 사원명 조회, 부서명 조회, 전체조회
public class EmployeesExample {
	JDBCUtil jdbc = new JDBCUtil();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new EmployeesExample().init();

	}

	void init() {
		while (true) {
			System.out.println("[[메뉴]]");
			System.out.println("1.로그인");
			System.out.println("2.전체조회");
			System.out.println("3.사원번호[사원명]");
			System.out.println("4.사원조회[부서명]");
			System.out.println("9.종료");
			System.out.println("--------------------------");
			System.out.println("선택>>");
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
				System.out.println("직업번호 선택 오류");

			}
		}

	}

	public void login() {
		List<Object> param=new ArrayList<param>{
			
		}
		
		String sql="SELECT *FROM employees";
		Employee e1 = jdbc.selectList(sql);
		if (e1 != null) {
			System.out.println(e1.empName + "님 환영합니다...");
		}

		}

	public void select() {
		List<Map<String,Object>>SelectList(){
			
		}
	}
	
	public void selectList() {
		System.out.println("부서명 :");
		String deptName=sc.nextLine();

		List<Map<String,Object>> e1=jdbc.
	}
}
