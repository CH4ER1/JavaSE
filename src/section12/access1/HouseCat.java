package section12.access1;

public class HouseCat implements Cat, Playable {
	//인터페이스는 다중상속 가능, 대신 오버라이딩 필수
	
	@Override
	public void eat() {
		System.out.println("경계를 하며 먹이를 먹어요");		
	}

	@Override
	public void sleep() {
		System.out.println("밤에 잠을 안 자요");		
	}

	@Override
	public void hunt() {
		System.out.println("쥐를 사냥해서 집사에게 선물을 해요");		
	}

	@Override
	public void play() {
		System.out.println("냥냥펀치");
		
	}

}
