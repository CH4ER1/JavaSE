package section14;

/*
 * Exception Class 종류
 * 	1. Unchecked Exception (Runtime Exception)
 * 		메서드 호출 시 예외 처리를 하지 않아도 컴파일 에러가 발생하지 않음
 * 		RuntimeException 상속 받은 Exception 클래스
 * 	2. Checked Exception
 * 		메서드 호출 시 예외 처리를 하지 않을 경우, 컴파일 에러 발생
 *  
 */
public class ExceptionClass04 {

	public static void main(String[] args) {
//		unCheckedMethod(); //Unchecked Exception
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //1초 동안 대기, Checked Exception
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void unCheckedMethod() {
		int num1 = 10;
		int num2 = 0;
		
		int result = num1 / num2;
		
		System.out.println("result: " + result);
		
	}
}









