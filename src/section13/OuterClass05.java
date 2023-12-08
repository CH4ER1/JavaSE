package section13;

import section11.access1.Car;
import section13.access1.Bird;

/*
 * 익명 클래스 (Anonymous Class)
 * 	다른 내부 클래스와 달리 이름이 없는 클래스
 * 	선언과 객체의 생성을 동시에 하기 때문에 단 한 번만 사용 가능 (일회용 클래스)
 *  
 */
public class OuterClass05 {
	
	public static void main(String[] args) {
		Bird bird = new Bird() {
	// = Bird bird = new @@@ implements Bird() 		
			//bird 인터페이스를 상속받은 익명 클래스
			
			@Override
			public void sing() {
				System.out.println("새가 노래를 해요");
			}
			
			@Override
			public void fly() {
				System.out.println("새가 하늘을 날아요");
			}
			public void printHello() {
				System.out.println("Hello Bird");
			}
		};
		
		bird.sing();
		bird.fly();
		new Car().drive();
		
		new Bird() {
			@Override
			public void sing() {
				System.out.println("새가 노래를 해요");
			}
						
			@Override
			public void fly() {
				System.out.println("새가 하늘을 날아요");
			}
			public void printHello() {
				System.out.println("Hello Bird");
			}
		}.printHello();
		
	}

}
