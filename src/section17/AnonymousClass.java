package section17;

interface Greeting {
	void greet();	// 추상 메서드
}

class GreetClass implements Greeting {

	@Override
	public void greet() {
		System.out.println("안녕하세요");		
	}	
}

class GreetEngCls implements Greeting {

	@Override
	public void greet() {
		System.out.println("Hello");		
	}
	
}

public class AnonymousClass {

	public static void main(String[] args) {

		GreetClass greet1 = new GreetClass();
		// Greeting greet1 = new GreetClass(); 부모 타입으로도 받을 수 있음 		
		greet1.greet();
		
		GreetEngCls greet2 = new GreetEngCls();
		// Greeting greet2 = new GreetEngCls(); 부모 타입으로도 받을 수 있음 
		greet2.greet();
		
		//익명 클래스
		Greeting greet3 = new Greeting() {
			// = Greeting greet3 = new 익명클래스 implements Greeting()

			@Override
			public void greet() {
				System.out.println("이름 없는 친구 안녕");
				
			}
			
		};
		
		greet3.greet();
	}

}
