package section08;

/*
 * 메서드 (Method)
 * 	객체 지향 프로그래밍에서 하나의 특별한 목적의 작업을 수행하기 위한 설계된 코드의 집합
 * 	객체의 기능 역할
 * 	
 * 	메서드 구조
 * 	[접근제한자] [static] 반환타입 메서드 이름 ([매개변수타입 매개변수명]) {
 * 			실행 명령어 
 * 			[return 반환값;]
 * }
 * 
 * 
 */
public class Method01 {
	
	public static void main(String[] args) {
		hello();
//		Method01.hello();
	}
	
	// 1. 매개변수 (인자) X (hello 뒤 괄호값 X), 리턴 값 X -> 호출 시 실행하고 끝나는 메서드
	// 리턴 값 없을 때 void 사용
	public static void hello() {
		System.out.println("Hello, World!");
		//메인에서 호출해야 실행 가능
	}

}
