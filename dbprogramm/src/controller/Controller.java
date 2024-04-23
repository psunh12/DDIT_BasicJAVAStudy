package controller;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import util.JDBCUtil;

//웹구조 코드
public class Controller {

	public static void main(String[] args) {
		new Controller().init();
	}
	public void init() {
		String sql="SELECT * FROM TEL_MEM ";
		
		JDBCUtil jdbc=JDBCUtil.getInstance();
		List<Map<String,Object>> res=jdbc.selectList(sql);	//list의 0번째에는 맵이 들어있다,전체값map에 저장

		Scanner sc=new Scanner(System.in);
		System.out.print("조회할 회원명 : ");
		String hname=sc.nextLine();//키보드 입력값 hname에 저장.
		System.out.println("----------------------------------");		
		

		
		for(int i=0; i<res.size();i++) {
			Map<String, Object> map=res.get(i);
			Set<String> key = map.keySet();

			if(map.get("MEM_NAME").equals(hname)) {//키에 해당되는 값 꺼내옴.= 이름이 꺼내져온다, 입력받은값이랑 이름이 같다면
				Iterator<String> iter=key.iterator();
				
				while (iter.hasNext()) {
					String col =iter.next();
					System.out.print(col+" : ");
					System.out.println(map.get(col));
				
				}
				break;//while 종료
			}
			
			
//			Iterator<String> iter=key.iterator();
			
//			while (iter.hasNext()) {
//				String col=iter.next();//컬럼네임(문자열)
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
