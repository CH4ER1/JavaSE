package section02;

/*
 * 5. String형 (문자열)
 * 	자바에서 문자열을 저장할 수 있는 타입
 * 	선언 방법
 * 		String 변수형; 
 * 참조형 변수
 * 
 * 기본자료형 (Primitive type)
 * 	- 실제 데이터 값을 저장; 정수, 실수, 논리 타입으로 분류된 8가지 자료형
 * 	- 각각 저장 크기가 다르며, 기본 값이 정해져 있음
 * 	ex) int, short, long, double, float, char, boolean, byte
 * 
 * 참조자료형 (Reference type)
 * 	- 데이터가 저장되어 있는 메모리 번지를 저장
 * 	- 기본자료형을 제외한 나머지 사용자 정의 자료형을 의미
 * 	- 기본값이 정해져 있지 않기 때문에 null 값이 존재
 * 	- 클래스 코드로 되어있음
 * 	- 속성(값-변수), 기능(메서드) 보유
 * 	ex) String
 * 
 * 
 */

public class Variable06 {
	
	static String str2;
	
	public static void main(String[] args) {
		//String 변수 선언 및 초기화
		String str = "안녕하세요";
		System.out.println("str: "+ str);
		System.out.println("str2: "+ str2); //str2: null -> 초기화 안 해서 null값 나옴
		//System.out.printf("str: %s\n", str);
		
		/* charAt(@)
		 * h e l l o
		 * 0 1 2 3 4 => 인덱스 번호
		 * 
		 */
		
		String hello = "hello";
		System.out.println("1번 인덱스 문자: " + hello.charAt(1)); //1번 인덱스 문자: e
		System.out.println("hello.replace: " + hello.replace("o", "")); //hello의 o를 공백으로 대체
		System.out.println(System.identityHashCode(hello));
		
		
	}

}
