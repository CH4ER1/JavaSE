package section02;

/*
 * 1. 논리형(boolean)
 * 	true 또는 false 두 가지 값을 가지는 기본 자료형
 * 	크기: 1byte
 * 	선언 방법: boolean 변수명;
 * 
 * 
 * 
 */

public class Variable01 {
	public static void main(String[] args) {
		//논리형 변수 선언하기
		boolean isBool; //선언 먼저 하고 대입을 나중에 해도 됨
		isBool = true; //처음 값 대입 => 변수 초기화, 전역 변수가 생기면 초기화 안 해도 됨
		System.out.println("논리형 변수에 저장된 값: " + isBool);
		//System.out.printf("논리형 변수에 저장된 값: %s\n", isBool);
		
		//논리형 변수 값 변경하기
		isBool = false;
		System.out.println("논리형 변수에 저장된 값: " + isBool);
		//System.out.printf("논리형 변수에 저장된 값: %s\n", isBool);
		
		//조건문에 논리형 변수 사용하기
		if(isBool) { //if (괄호) 괄호의 값이 true면 if문 실행
			System.out.println("isBool 값은 true 입니다.");
		} else { //if(괄호) 괄호의 값이 false면 else문 실행
			System.out.println("isBool 값은 false 입니다");
		}
		
	}

}
