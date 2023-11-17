package section03;

/*
 * 6. 비트 연산자
 * 	2진수로 표현된 두 비트 연산자
 * 
 * 	&: 대응되는 비트가 모두 1이면 1을 반환 (비트 AND 연산자) // 괄호 있어야 됨
 * 	|: 대응되는 비트 중 하나라도 1이면 1을 반환 (비트 OR 연산자) 
 *  ^: 대응되는 비트가 서로 다르면 1을 반환 (비트 XOR(Exclusive OR) 연산자)
 * 	~: 대응되는 비트가 1이면 0으로, 0이면 1로 반전 (비트 NOT 연산자)
 *  
 */

public class Operator06 {
	
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 5;
		System.out.println("num1 & num2: " + (num1 & num2));
		/* 3을 2진수로: 0011 (4비트로 가정)
		 * 5를 2진수로: 0101 (4비트로 가정)
		 * 			&	
		 * 			  0001 (둘 다 1일 때만 1 반환) 
		 */
		System.out.println("num1 | num2: " + (num1 | num2));
		/* 3을 2진수로: 0011 (4비트로 가정)
		 * 5를 2진수로: 0101 (4비트로 가정)
		 * 			|	
		 * 			  0111 (둘 중 하나라도 1이면 1 반환) 
		 */
		System.out.println("num1 ^ num2: " + (num1 ^ num2));
		/* 3을 2진수로: 0011 (4비트로 가정)
		 * 5를 2진수로: 0101 (4비트로 가정)
		 * 			^	
		 * 			  0110 (둘이 다를 때만 1 반환) 
		 */
		System.out.println("~num: " + ~num1);
		/*
		 * 2의 보수 사용
		 *	 
		 */
	}

}
