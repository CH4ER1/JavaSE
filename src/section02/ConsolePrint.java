package section02;
/*
 * 출력문
 * 	: 데이터를 화면에 출력하는 방법
 * 
 * 	System.out.Println(): 괄호 안 내용 출력 후 행 바꿈 
 * I(아이 아님, 엘)
 * 	System.out.Print(): 괄호 안 내용 출력 후 행 바꿈 X
 * 	System.out.printf(): 문자열 서식 문자를 이용해 형식화된 내용 출력, 행 바꿈 X
 * 
 * 
 * 서식문자
 * 	%d : 정수(10진수)
 * 	%o: 정수(8진수)
 * 	%x: 정수(16진수)
 * 	%f: 실수
 * 	%s: 문자열 "Hello"
 * 	%c: 문자 (한 글자) 'H'
 * 
 */

public class ConsolePrint {
	//자바 프로그램 시작을 의미하는 메인 메서드
	public static void main(String[] args) {
		//print예제
		System.out.print("Hello, World!");
		//print는 줄바꿈 X
		System.out.println("Java World!");
		//println은 줄바꿈 O
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 11, 14);
		//printf는 서식 문자 이용해 형식화
		System.out.printf("안녕하세요\n");
		System.out.println("오늘은 " + 11 + "월 " + 14 + "일 입니다. ");
		System.out.printf("%d 은 첫 번째, %.1f은 두 번째, %s은 세 번째\n", 1, 2.0, "셋");
		
	}

}
