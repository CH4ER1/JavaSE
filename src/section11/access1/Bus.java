package section11.access1;

public class Bus extends Car {

	@Override
	public void drive() {
		System.out.println("승객을 태우고 운전을 합니다");
	}
	
	public void onClickBell() {
		System.out.println("삑");
	}
}
