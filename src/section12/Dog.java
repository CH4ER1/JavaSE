package section12;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override //Animal에는 추상 메서드가 있어서 오버라이드 필수
	public void makeSound() {
		System.out.println("멍멍멍");
		
	}
	

}
