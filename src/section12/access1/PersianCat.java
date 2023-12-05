package section12.access1;

public class PersianCat implements Cat{

	@Override
	public void eat() {
		// 아무 것도 안 넣어도 됨
		System.out.println("교양있게 먹이를 먹어요");
	}

	@Override
	public void sleep() {
		System.out.println("잠을 우아하게 자요");
		
	}

	@Override
	public void hunt() {
		System.out.println("기품있고 도도하게 사냥을 해요");
		
	}

}
