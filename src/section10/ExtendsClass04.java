package section10;

/*
 * super()
 * 	부모 클래스의 생성자를 의미함
 * 
 * 
 * 
 * 
 * 
 * 
 */
class Car {
	String model;
	String color;
	
	public Car () {
		System.out.println("Car 생성자");
	}
}

class SportCar extends Car {

	public SportCar() {
		super(); // 매개변수가 없으면 생략 가능, 가장 첫째줄에 써야 됨
		System.out.println("SportsCar 생성자");		
	}
}

public class ExtendsClass04 {

	public static void main(String[] args) {
		SportCar sCar = new SportCar();		
	}
}
