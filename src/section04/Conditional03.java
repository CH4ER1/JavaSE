package section04;

/*
 * 1-3 if ~ else if ~ else 문
 * 	if (조건식 1) {
 * 		조건식 1이 true 일 때 실행 명령어
 * 	} else if (조건식 2) {
 * 		조건식 2가 true 일 때 실행 명령어
 * 	} else {
 * 		조건식 1,2 모두 false 일 때 실행 명령어
 * }
 *  else if 는 여러 개 사용할 수 있다
 *  명령어가 한 줄일 경우 중괄호 생략 가능
 */

public class Conditional03 {
	
	public static void main(String[] args) {
		
		//double num = 101.5;
		int num = 23;
		
		if (num % 3 == 0) {
			System.out.println("num % 3 == 0");
		} else if (num % 3 == 1) {
			System.out.println("num % 3 == 1");
		} else if (num % 3 == 2) {
			System.out.println("num % 3 == 2");
		} else {
			System.out.println("num은 정수가 아닙니다.");
		}
		
	}

}
