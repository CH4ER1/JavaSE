package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List (중요, 유사 배열)
 * 	컬렉션 프레임워크 중 하나인 인터페이스로, 순서가 있는 데이터 모음을 다루는 객체
 * 
 */

public class Collection02 {
	
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<String>();
		
		// 데이터 저장하기			인덱스 번호
		list.add("피카츄");		//	0
		list.add("라이츄");		//  1
		list.add("파이리");		//	2
		list.add("꼬부기");		//	3
		list.add("버터플");		//	4
		list.add("야도란");		//	5
		list.add("피존투");		//	6
		list.add("또가스");		//	7
		
		// 저장된 데이터를 특정 인덱스 값으로 얻어오기, 값이 사라지진 않음
		String pokemon = list.get(6);
		System.out.println("list[6]: " + pokemon);
		
		// 리스트 크기 출력하기
		System.out.println("저장된 데이터 개수: " + list.size());
		
		// 저장된 데이터 인덱스 번호로 삭제하기
		list.remove(3);
		System.out.println("list[3]: " + list.get(3));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("list: " + list.get(i));
		}
		
		System.out.println("==========================");
		
		// 특정 인덱스 데이터 삽입 (중간에 끼워넣기)
		list.add(4, "잠만보"); //3, 4 사이
		
		// 향상된 for문
		for (String name: list) {
			System.out.println("name: " + name);
		}
		
		System.out.println("===========================");
		
		//LinkedList: 삽입, 삭제가 쉬움
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("이브이");
		
		for (String mon: linkedList) {
			System.out.println("mon: " + mon);
		}
		
		System.out.println("===========================");
		
		// ArrayList와 동일한 기능 + Thread Safe
		Vector<String> vec = new Vector<String>();
		vec.add("아이언맨");
		vec.add("스파이더맨");
		
		for (String hero: vec) {
			System.out.println("hero: " + hero);
		}
	}

}
