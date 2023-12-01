package section10;

public class Latte extends Espresso {
	//extends 다음에는 하나만 상속 가능 (클래스 하나 당 상속 하나)

	int water;
	int milk;	
	
	@Override //어노테이션, 생략 가능 (어노테이션에 따라 생략 유무 다름)
	public void printInfo() {
		super.printInfo(); // 부모 메서드 불러옴
		System.out.println("water: " + water);
		System.out.println("milk: " + milk);
		//부모 메서드에서 추가하는 부분
		
/*
* 	public void printInfo() {
*		System.out.println("brand: " + brand);
*		System.out.println("bean: " + bean);
*		}
* 		Espresso 에 있는 printInfo 출력
* 
*/
	}
}
