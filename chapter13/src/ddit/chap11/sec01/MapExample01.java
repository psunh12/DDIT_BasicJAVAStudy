package ddit.chap11.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample01 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();//int 사용불가-객체만 와야함
		//자료삽입
		map.put("홍길동", 85);
		map.put("이순신", 75);
		map.put("정몽주", 90);
		map.put("이청준", 70);
		
		
		Set<String> keySet=map.keySet();
		Iterator<String> iter=keySet.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println("키 : "+key+", 값 : "+ map.get(key));
		}
		
	}

}
