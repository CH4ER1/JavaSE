package section10;

public class Espresso extends Coffee { 
	//Coffee 라는 부모 클래스 상속
	//부모 클래스에 있는 변수 재선언 안 해도 사용 가능

	public String brand;
	
	public void printInfo() {
		System.out.println("brand: " + brand);
		System.out.println("bean: " + bean);
	}
}
