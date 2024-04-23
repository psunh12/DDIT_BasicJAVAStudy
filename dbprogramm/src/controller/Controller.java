package controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import util.JDBCUtil;

//������ �ڵ�
public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	public void init() {
		String sql="SELECT * FROM TEL_MEM ";
		
		JDBCUtil jdbc=JDBCUtil.getInstance();
		List<Map<String,Object>> res=jdbc.selectList(sql);	//list�� 0��°���� ���� ����ִ�,��ü��map�� ����

		Scanner sc=new Scanner(System.in);
		System.out.print("��ȸ�� ȸ���� : ");
		String hname=sc.nextLine();//Ű���� �Է°� hname�� ����.
		System.out.println("----------------------------------");		
		

		
		for(int i=0; i<res.size();i++) {
			Map<String, Object> map=res.get(i);
			Set<String> key = map.keySet();

			if(map.get("MEM_NAME").equals(hname)) {//Ű�� �ش�Ǵ� �� ������.= �̸��� �������´�, �Է¹������̶� �̸��� ���ٸ�
				Iterator<String> iter=key.iterator();
				
				while (iter.hasNext()) {
					String col =iter.next();
					System.out.print(col+" : ");
					System.out.println(map.get(col));
				
				}
				break;//while ����
			}
			
			
//			Iterator<String> iter=key.iterator();
			
//			while (iter.hasNext()) {
//				String col=iter.next();//�÷�����(���ڿ�)
//				Object val = map.get(col);
//				System.out.print(val+"\t");
//				
//				
//				
//			}
//			
//			System.out.println();
		}
		System.out.println("----------------------------------");
	}

}
