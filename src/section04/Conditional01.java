package section04;

/*
 * 제어문
 * 	프로그램 실행 흐름을 제어하기 위해 사용되는 명령어
 * 	
 * 조건문
 * 	- 조건식에 따라서 프로그램의 흐름을 제어할 수 있는 명령어
 * 
 * 1. if문
 * 	if(조건식){
 * 		조건식이 true 일 때 실행 명령어
 * }
 * 	
 *	if(조건식)
 *		조건식이 true 일 때 실행 명령어 (명령어가 하나일 경우 중괄호 생략 가능)
 * 독립적인 사건일 때 if else 대신 if 사용
 */

public class Conditional01 {
	public static void main(String[] args) {
		int num = 39;
		
		/*if (num % 2 == 0) {
			System.out.println("num은 짝수입니다."); */
			
		if (num % 2 == 0) 
			System.out.println("num은 짝수입니다.");
		//명령어가 하나이기 때문에 중괄호 생략 가능
			
		if (num % 2 != 0) {
			System.out.println("num은 홀수입니다.");
		}
		
	
	}
	

}
