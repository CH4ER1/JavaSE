package section07;

/*
 * 객체 지향 프로그래밍 (Object Oriented Programming)
 * 	프로그램을 작성할 때, 데이터와 데이터를 연산하는 메서드를 객체 (하나의 논리적 단위) 로 묶는 방식의 프로그래밍
 * 
 * 객체 (object)
 * 	물리적으로 존재하거나, 추상적으로 생각할 수 있는 것
 * 	식별이 가능하고, 정의 가능한 것
 * 
 * EX1) 물리적인 객체: 컴퓨터, 모니터, 키보드, 마우스, 자동차, 사람, 강아지, 고양이, 토끼, 너구리, 커피 ...
 * 
 * EX2) 추상적인 객체: 물건 구매 주문 (주문 번호로 식별), 게임 유닛, 영수증, 재무제표
 * 
 * 객체의 구성 요소
 * 	1) 속성 - 변수
 * 	2) 기능 - 메서드
 * 	3) 생성자 - 객체 초기화
 * 
 * EX) 티모 객체 
 * 		속성 1) HP - 300
 * 			2) MP - 200
 * 			3) SPEED - 5
 * 
 * 		기능 1) 실명 - 상대 챔프 일시적 침묵 + 독 데미지
 * 			2) 신속한 이동 - 3초 간 SPEED + 2
 * 
 * 클래스(Class)
 * 	객체를 생성하기 위한 제작 설명서
 * 	Class 로 작성된 코드를 읽어 인스턴스화 (객체화) -> 메모리에 저장 또는 load 
 * 	- 붕어빵 틀, 와플 기계
 * 
 * 클래스의 구조
 * 	[접근 제한자 ex: public] class 클래스명 [extends 부모 클래스] [implements 인터페이스] //대괄호 생략 가능 {
 * 		[생성자] => 초기화
 * 		변수 (멤버 변수, 인스턴스 변수, 필드) => 속성
 * 		메서드 (멤버 메서드, 인스턴스 메서드) => 기능
 * 	}
 * 
 * 객체화 방법 - new 연산자로 객체화 가능
 * 	클래스명 (타입) 변수명 = new 클래스 ();
 * 	
 */

public class OOP01 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car(); //car1은 Car의 주솟값을 가지고 있음; Car car1 = 7c30a502;
		Car car2 = new Car(); //Car car2 = 6e8dacdf;
		
		System.out.println("=== car1 ===");
		System.out.println(car1);
		System.out.println(car1.model);
		System.out.println(car1.price);
		System.out.println(car1.fuelEfficiency);
		
		System.out.println("=== car2 ===");
		car2.price = 4000; // 변경 또는 대입
		System.out.println(car2);
		System.out.println(car2.model);
		System.out.println(car2.price);
		System.out.println(car2.fuelEfficiency);
		
	}

}
