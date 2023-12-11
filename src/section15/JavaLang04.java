package section15;

/*
 * StringBuffer	- Thread Safe O
 * StringBuilder - Thread Safe X
 * 문자열을 동적으로 다루기 위한 클래스
 * 문자열이 변경되어도 주솟값 동일
 * 
 */

public class JavaLang04 {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.append("def"); //문자열 뒤에 추가
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.insert(1, "가나다"); //1번 문자열 앞에 삽입
		System.out.println(sb);
		
		sb.delete(2, 4); //2번, 3번 문자열 삭제
		System.out.println(sb);
		
		sb.reverse(); //뒤집기
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello,");
		sb2.append(" Java");
		System.out.println(sb2);
		
		
	}

}
