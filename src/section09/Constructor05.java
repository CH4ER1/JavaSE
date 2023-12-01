package section09;

class Fruit {
	String name = "사과"; //public 생략 가능 //귤
	int price;
	String origin;
	
	public Fruit() {	
		System.out.println("기본 생성자");		
		this.name = "망고";
		
	}
	
	public Fruit (String name) {	//귤
		this(); //this() 를 쓰려면 제일 위에 있어야 됨
		this.name = name;
		System.out.println("과일명: " + name);
	}
}

public class Constructor05 {

	public static void main(String[] args) {
	
		Fruit fruit = new Fruit("귤");		
		System.out.println(fruit.name);
		
		
	}
}
