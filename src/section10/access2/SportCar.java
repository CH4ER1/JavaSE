package section10.access2;

import section10.access1.Car;

public class SportCar extends Car{
	
	private boolean isOpen;
	
	@Override
	public void printInfo() {
		System.out.println("오버라이드 model: " + model);
		System.out.println("오버라이드 color: " + color);
//		System.out.println("오버라이드 year: " + year); // default: 상속 관계에서도 접근 불가
//		System.out.println("오버라이드 brand: " + brand); // private: 상속 관계에서도 접근 불가
		System.out.println("오버라이드 isOpen: " + isOpen);
	}

}
