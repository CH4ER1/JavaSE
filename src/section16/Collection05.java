package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * no / name / mobile / address
 * 
 * 1 / 홍길동 / 0101111 / 서울특별시
 * 2 / 짱구	/ 0102222 / 떡잎마을
 * 3 / 둘리	/ 0103333 / 쌍문동
 * 4 / 도라에몽 / 0101234 / 강변마을
 * 
 * no: 1
 * name: 홍길동
 * mobile: 0101111
 * address: 서울특별시
 */

public class Collection05 {

	public static void main(String[] args) {
		ArrayList<Map<String, Object>> memberList = new ArrayList<Map<String, Object>>();
		
		Map<String, Object> member1 = new HashMap<String, Object>();
		Map<String, Object> member2 = new HashMap<String, Object>();
		HashMap<String, Object> member3 = new HashMap<String, Object>();
		HashMap<String, Object> member4 = new HashMap<String, Object>();
		
		member1.put("no", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "0101111");
		member1.put("address", "서울특별시");
		
		member2.put("no", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "0102222");
		member2.put("address", "떡잎마을");
		
		member3.put("no", 3);
		member3.put("name", "둘리");
		member3.put("mobile", "0103333");
		member3.put("address", "쌍문동");
		
		member4.put("no", 4);
		member4.put("name", "홍길동");
		member4.put("mobile", "0101111");
		member4.put("address", "강변마을");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		memberList.add(member4);
		
		System.out.println("no\tname\tmobile\taddress");
		for (int i = 0; i < memberList.size(); i++) {
			Map<String, Object> map = memberList.get(i);
			int no = (int) map.get("no");
			String name = (String) map.get("name");
			String mobile = (String) map.get("mobile");
			String address = (String) map.get("address");
			System.out.println(no + "\t" + name + "\t" + mobile + "\t" + address);
		}	
	}
}
