package section03;

/*
 * 연산자(Operator)
 * 	프로그램에서 데이터를 처리하여 산출하는 것
 * 	연산에 사용되는 표시나 기호를 연산자(Operator)라고 함
 * 
 * 	1. 산술연산자
 * 	+, -, *(곱하기), /(나누기), %(나머지)
 * 
 * 
 */

public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		//두 수의 합
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
		
		/*
		 * 정수 + 정수 => 정수
		 * 문자열 + 숫자 => 문자열 ('+' 연결 연산자)
		 * 
		 */
		String sumStr = num1 + "+" + num2 + "=" + sum; //'+'가 연결 연산자 역할; 문자와 변수 연결
		System.out.println("sumStr: " + sumStr);
		//두 수의 곱
		int multiply = num1 * num2;
		System.out.println("multiply: " + multiply);
		
		//두 수의 나눗셈
		int devide = num1 / num2;
		System.out.println("devide: " + devide);
		
		//두 수의 나머지
		int result = 19 % 3;
		System.out.println("result: " + result);
	
	}

}
