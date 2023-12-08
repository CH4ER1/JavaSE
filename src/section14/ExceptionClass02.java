package section14;

public class ExceptionClass02 {
	
	public static void main(String[] args) {
		String str = null;
		int num1 = 20;
		int num2 = 10;
		int result = 0;
		
		try {
			result = num1 / num2;
			System.out.println("result: " + result);		
			System.out.println("str 첫 번째 글자: " + str.charAt(0));
		} catch(ArithmeticException ae) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다");
		} catch (NullPointerException ne) {
			System.out.println("문자열 값이 비어있습니다");
		} catch(Exception e) {
			//Exception Class가 Arithmetic, NullPointer의 부모 클래스
			System.out.println("에러 발생, 관리자에게 문의하세요");
			e.printStackTrace();
		}
	}

}
