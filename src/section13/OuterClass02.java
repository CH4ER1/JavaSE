package section13;

/*
 * 내부 클래스 컴파일
 * 	Outer$Inner.class
 * 	내부 클래스도 외부 클래스 안에 코드를 작성하지만 별도의 클래스이기에 컴파일 시 별도로 생성됨
 * 
 */
public class OuterClass02 {

	public static void main(String[] args) {
		
		new OuterClass02.InnerClass().info();
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
	}
	
	static class InnerClass {
		public void info() {
			System.out.println("static 내부 클래스의 일반 메서드입니다.");
		}
	}
}

