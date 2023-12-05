package section12;

/*
 * 추상 클래스 (Abstract Class)
 * 	일부 메서드가 구현되지 않은 추상 메서드가 존재하는 클래스
 * 	abstract 키워드를 사용하여 선언
 *	객체 생성 불가 상속 후 추상 메서드 오버라이드 후 사용 가능 
 * 
 */
public class AbstractClass {

	public static void main(String[] args) {
		Dog dog = new Dog("늘이");
		dog.eat();
		dog.makeSound();
		
	}
}
