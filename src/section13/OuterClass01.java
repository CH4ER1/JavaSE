package section13;
/*
 * 내부 클래스 (Inner Class)
 * 	클래스 안에 만들어진 또다른 클래스 (중첩 클래스)
 * 	외부 클래스와 밀접한 관계를 가짐
 * 
 */
public class OuterClass01 {
	public static void main(String[] args) {
		OuterClass01.InnerClass.info(); //객체 생성 없이 외부 클래스를 통해 접근 가능
		InnerClass.info(); // 같은 클래스 안에서는 바로 접근 가능
	}
	
	static class InnerClass {
		public static void info() {
			System.out.println("static 내부 클래스입니다.");
		}
	}

}
