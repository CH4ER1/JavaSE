package section14;

import java.util.Scanner;

public class ExceptionClass06 {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("나이를 입력하세요");
			int age = scan.nextInt();
			
			if (age < 0) {
				throw new InputErrorException("입력이 잘못됐습니다");
			}
			if (age > 19) {
				System.out.println("성인입니다");
			} else if (age > 13) {
				System.out.println("청소년입니다");
			} else if (age > 7) {
				System.out.println("어린이입니다.");
			} else {
				System.out.println("유아입니다");
			}
		} catch (InputErrorException e) {
			System.out.println(e.getMessage());
		} finally {
			if (scan != null) scan.close();
		}
	}
}
