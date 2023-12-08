package section14;

/*
 * 예외 (Exception)
 * 	자바 프로그램 구동 중에 나타나는 오류
 * 	문법적으로는 문제 없어 보이지만, 실제 운영 중에 생기는 오류
 * 
 * 예외 처리 방법: try ~ catch
 * 	try {
 * 		실행 코드
 * 	} catch (익셉션클래스 매개변수명) {
 * 		예외 발생 시 실행 코드
 * }
 * 
 */
public class ExceptionClass01 {

	public static void main(String[] args) {
		/* If 문으로 예외 처리하기
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		result = num1 / num2; //Exception in thread "main": / by zero
		if (num2 == 0) {
			System.out.println("에러 발생. 관리자에게 문의하세요");
		} else {
		System.out.println("result: " + result);
		} */
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1 / num2; 	//result는 try문 안에서만 사용 가능
			System.out.println("result: " + result);
		} catch (Exception e) {
			System.out.println("에러 발생. 관리자에게 문의하세요");
			System.out.println("에러 메세지: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}









