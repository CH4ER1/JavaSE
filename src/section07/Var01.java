package section07;

/*
 * 변수 (Variable)
 * 	데이터를 저장하고 관리하는 데 사용되는 식별자
 * 
 * 변수 선언 및 초기화
 * 	자료형 (Type) 변수명 = 갓 또는 참조값 (객체);
 * 	
 * 	1. 타입에 따른 변수
 * 		기본형 - 예약어로 되어 있다, 소문자로 시작, 직접 값을 저장하고 있음
 * 		EX) int, char, short, boolean, float, long, byte, double
 * 
 * 		참조형 - 기본형 외 나머지 전부, 참조(주소)값을 가짐, 통상적으로 대문자로 시작
 * 		EX) String, Scanner, Math
 * 
 * 	2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스 안에 선언된 변수 (멤버 변수, 필드)
 * 			   - 초기화 하지 않으면 default 값이 들어감
 * 			   - boolean default = false
 * 			   - 정수형 default = 0
 * 			   - 실수형 default = 0.0d, 0.0f
 * 			   - 참조형 = null
 * 
 * 		지역변수 - 메서드 또는 생성자 안에 선언된 변수
 * 				- 해당 메서드 안에서만 사용 가능
 * 				- 메서드 종료 시, 같이 소멸됨
 * 				- 매개변수도 지역변수이다
 * 				- 지역변수는 초기화 필수
 * 
 * 	3. 정적(static), 동적(Dynamic) 병수
 * 		지역변수 안에서는 static 사용 불가
 */

public class Var01 {
	
	// 전역변수, class에 종속
	// 기본형, 전역, 동적
	static int globalVar = 10;
	
	public static void localMethod() {
		//지역변수 선언, method에 종속, static X
		int localVar = 20; // 지역변수 초기화 필수
		Car car = new Car();
		System.out.println("전역변수 호출하기: " + globalVar);
		System.out.println("지역변수 호출하기: " + localVar);
	}
	
	public static void main(String[] args) {
		//지역변수, 참조형변수
		Var01 var01 = new Var01();
		
		System.out.println("전역변수 호출하기: " + globalVar);
		//System.out.println("지역변수 호출하기: " + localVar);
		//지역변수는 메서드(localMethod) 중괄호 안에서만 사용 가능
		
		localMethod();
	}

}
