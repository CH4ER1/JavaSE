package section16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map
 * 	키, 값 쌍으로 데이터를 저장하는 자료 구조
 * 	키(Key): 중복 허용 X, 순서 보장 X
 * 	값(Value): 중복 허용 O
 * 
 */

public class Collection04 {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 90);
		map.put("Son", 100);
		map.put("Alice", 90); // 값 수정
	
		// map 값 가져오기
		int score = map.get("Alice");
		System.out.println("Allice Score: " + score);
		
		// 특정 키의 존재 여부 확인
		if (map.containsKey("Son")) {
			System.out.println("Son Score: " + map.get("Son"));
		}
		
		// 전체 키의 값 가져오기
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			System.out.println("key: " + key);
			System.out.println("value: " + value);
		}
		
		System.out.println("=====================");
		
		map.remove("David");
		
		//entrySet()
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry: entries) {
			System.out.println("entry Key: " + entry.getKey());
			System.out.println("entry Value: " + entry.getValue() );
		}

	}

}
