package section13;

/*
 * 지역 내부 클래스
 * 	메서드 내에서 선언되어 사용되는 클래스
 * 	클래스는 메서드 내에서만 사용 가능
 * 	메서드 종료 시 클래스도 종료
 * 
 * 
 */

public class OuterClass04 {
	
	private int speed = 10;
	public void getUnit (String name) {
		
		class Unit {
			public void move() {
				System.out.println(name + "이 " + speed + "의 속도로 이동합니다.");
			}
		}
		
		Unit unit = new Unit();
		unit.move();
		
	}

	public static void main(String[] args) {
		OuterClass04 outer = new OuterClass04();
		outer.getUnit("마린");
		
		
		
	}
}
