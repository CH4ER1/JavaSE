package section15;

public class JavaLang07 {
	
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 1000;
		
		//compareTo
		if (num1.compareTo(num2) > 0) {
			System.out.println("num1이 num2보다 큽니다");
		} else if (num1.compareTo(num2) == 0) {
			System.out.println("num1과 num2는 같습니다");
		} else {
			System.out.println("num1은 num2보다 작습니다");
		}
		
		System.out.println("INT MAX: " + Integer.MAX_VALUE);
		System.out.println("INT MIN: " + Integer.MIN_VALUE);
		System.out.println("DOUBLE MAX: " + Double.MAX_VALUE);
		System.out.println("DOUBLE MIN: " + Double.MIN_VALUE);
		
		//is로 시작하면 보통 boolean 타입이 많음
		System.out.println("문자인가요? " + Character.isLetter('A'));
		System.out.println("숫자인가요? " + Character.isDigit('5'));
		System.out.println("공백인가요? " + Character.isWhitespace(' '));
		
	}

}
