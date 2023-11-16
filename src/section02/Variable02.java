package section02;

/*
 * 2. 문자형(char)
 * 	문자 한 글자 저장 가능한 변수
 * 	크기: 2byte
 * 	세계 각 나라의 문자를 숫자(0~65,535) 로 매핑해 둔 국제 표준 규약
 * 	각 문자는 1~2 byte의 크기를 가짐
 * 	선언 방법: char 변수명;
 
 */

public class Variable02 {
	
	public static void main(String[] args) {
		//char형 변수 선언 및 대입하기
		char ch1 = 'A'; //char 타입은 작은 따옴표로 입력, 큰 따옴표는 문자열
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		//System.out.printf("char 형 변수에 저장된 문자: %c\n", ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '뽥';
		System.out.println("char형 변수에 저장된 문자: " + ch2);
		System.out.printf("char형 변수에 저장된 문자: %c\n", ch3);
		
		int num = ch1; //char ch1 변수를 int 정수형 변수에 저장, 형변환
		System.out.println("대문자 A에 해당하는 숫자 코드: " + num);
		//System.out.printf("대문자 A에 해당하는 숫자 코드: %d", num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 아스키 코드: " + ch4);
	}

}
