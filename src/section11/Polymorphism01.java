package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 클래스에서 객체 타입 변환
 * 	서로 상속 관계에 있는 클래스 사이에서 변환할 수 있음
 * 
 *  1. 자동타입변환
 * 	부모 클래스(타입) 객체 변수명 = new 자식 클래스();
 * 	부모 클래스(타입) 객체 변수명 = 자식 객체 변수;
 * 
 *  2. 강제형변환
 * 	부모 타입으로 자동 타입 변환되었던 자식 객체를 다시 자식타입으로 변환할 때만 가능
 *
 *	자식 타입 변수 = (자식 타입) 부모 타입의 자식 객체;
 *
 * 다형성 (Polymorphism)
 * 	객체 지향 프로그래밍의 개념으로, 하나의 인터페이스나 클래스를 사용하여 
 * 	여러 다른 타입의 객체를 다룰 수 있는 능력을 말함
 *
 */

public class Polymorphism01 {

	public static void main(String[] args) {
		
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.onClickBell();
		
		Car car = new Bus();
		//Car 는 타입, 실제로 생성된 객체는 Bus
		
		car.drive();
//		car.onClickBell();
		//car 변수는 onClickBell()의 주솟값은 알아도 실행을 못 함 (문법상 오류)
		
		Bus bus2 = (Bus) car;
		bus2.drive();
		bus2.onClickBell();
	}
}
