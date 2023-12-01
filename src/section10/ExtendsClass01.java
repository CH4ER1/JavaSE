package section10;

/*
 * 상속 (Inheritance)
 * 	부모 클래스 (슈퍼 클래스, 상위 클래스) 와 자식 클래스 (서브 클래스, 하위 클래스) 가 있으며,
 *	자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버 (변수, 메서드) 를 사용할 수 있음
 *
 *상속 방법
 *	class 자식 클래스명 extends 부모 클래스명
 * 
 */

public class ExtendsClass01 {
	
	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		coffee.bean = "브라질";
		System.out.println("coffee bean: " + coffee.bean);
		
		System.out.println("===================");
		
		Espresso espresso = new Espresso();
		espresso.brand = "스타벅스";
		espresso.bean = "에티오피아";
		
		System.out.println("espresso brand: " + espresso.brand);
		System.out.println("espresso bean: " + espresso.bean);
		
		
		
	}

}
