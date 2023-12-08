package section13;

public class MyUtil {

	public String str1 = "일반 멤버 변수";
	public static String str2 = "정적 멤버 변수";
	
	public class HelloPrinter {
		public void printHello() {
			System.out.println("인스턴스 내부 클래스 HelloPrinter 입니다.");
			System.out.println(str1); //가능
			System.out.println(str2); //가능
		}
	}
	
	public static class Calculator {
		public void calc(int a, int b) {
			System.out.println("전달받은 두 정수의 합: " + (a + b));
//			System.out.println(str1); //불가능
			System.out.println(str2); //가능
		}
	}
}


