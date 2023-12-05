package section12;

import section12.access1.Cat;
import section12.access1.HouseCat;

/*
 * 인터페이스 (Interface)
 * 	추상 메서드의 집합으로 클래스에서 다중상속과 느슨한 결합을 지원하며, 
 * 	클래스의 동작을 정의하고 확장하는 데 사용됨
 * 
 */

public class InterfaceClass01 {

	public static void main(String[] args) {
//		Cat.PAW = 3; -> 인터페이스에 있는 변수는 무조건 스테틱 상수
		System.out.println(Cat.PAW);
		
		Cat cat1 = new HouseCat();
		cat1.eat();
		HouseCat cat2 = (HouseCat) cat1;
		cat2.play();
	}
}
