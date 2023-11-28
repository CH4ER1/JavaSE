package section08;

public class Method06 {
	public static void main(String[] args) {
		
		
		int max = max (10, 36);
		System.out.println("MAX: " + max);	
		
		int max2 = max (1, 2, 3);
		System.out.println("MAX2: " + max2);
		
	}
	// 6. 매개변수(인자) O, 리턴값 O -> 인자값을 받아 연산 후 결과값 반환 메서드
	public static int max(int a, int b) {
		int max = a > b ? a : b; //삼항연산자, a > b 가 참이면 a값 반환, 거짓이면 b값 반환
		return max; 
//		return a> b ? a : b;
	}
	public static int max (int a, int b, int c) {
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		return max;
	}

}
