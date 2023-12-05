package section12;

// 추상 클래스 선언
public abstract class Animal {
	
	private String name;
	public Animal (String name) {
		this.name = name;
	}
	
// 추상 메서드 선언 (구현 X)
	public abstract void makeSound();
	
// 일반 메서드
	public void eat() {
		System.out.println(name + "(이)가 먹이를 먹어요");
	}
}
