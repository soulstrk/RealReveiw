package review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PG_SetListMap {

	public static void main(String[] args) {
		/*Set<String> set1 = new HashSet<>();
		boolean flag = set1.add("hello");
		boolean flag1 = set1.add("Kim");
		boolean flag2 = set1.add("hello");
		
		System.out.println(set1.size());
		
		System.out.println(flag2);
		
		//하나하나 꺼낼땐 iterator()사용 해야함
		
		 Iterator<String> iter = set1.iterator();
		 while(iter.hasNext()) {
			 String str = iter.next();
			 System.out.println(str);
		 }*/ // Set과 iterator 설명
		//---------------------------------------
		
		/*List<String> list = new ArrayList<>();
		list.add("yong");
		list.add("kang");
		list.add("yong");
		
		System.out.println(list.size());
				
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/ // list 
		//-----------------------------------
		
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "kang");
		
		System.out.println(map.size());
		
		System.out.println(map.get("002"));
		
		Set<String> key = map.keySet();
		
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}

}
