package section17;

/*
 * 람다 표현식 (Lambda)
 * 	익명 함수를 정의할 수 있는 간결한 방법을 제공
 * 	주로 함수형 인터페이스와 함께 사용
 * 	JAVA 8 이상 지원
 * 
 * 람다 표현식 사용 방법
 * (매개 변수) -> 코드 영역
 * 
 */

@FunctionalInterface 	// 생략 가능
interface MyLambdaFunction {
	int max (int a, int b); // 추상 메서드 하나만 가능
	
}

public class Lambda01 {

	public static void main(String[] args) {
		
		// 1. 익명 클래스로 표현
		MyLambdaFunction mlf = new MyLambdaFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}			
		};		
		System.out.println(mlf.max(23, 45));	
		
		// 2. 람다식을 이용하여 표현
		MyLambdaFunction mlf2 = (int a, int b) -> a > b ? a : b;
		System.out.println(mlf2.max(66, 42));		
		
		// 3. 람다식의 다른 방법
		MyLambdaFunction mlf3 = (int a, int b) -> { return a > b ? a : b; };
		System.out.println(mlf3.max(81, 66));
		
	}
}
