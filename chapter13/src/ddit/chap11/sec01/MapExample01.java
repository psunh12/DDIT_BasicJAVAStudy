package ddit.chap11.sec01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample01 {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();//int ���Ұ�-��ü�� �;���
		//�ڷ����
		map.put("ȫ�浿", 85);
		map.put("�̼���", 75);
		map.put("������", 90);
		map.put("��û��", 70);
		
		
		Set<String> keySet=map.keySet();
		Iterator<String> iter=keySet.iterator();
		
		while(iter.hasNext()) {
			String key=iter.next();
			System.out.println("Ű : "+key+", �� : "+ map.get(key));
		}
		
	}

}
