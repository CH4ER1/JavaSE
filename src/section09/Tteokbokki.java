package section09;

public class Tteokbokki {
	
	//속성
	public String brand;
	public String riceCake;
	public String sauce;
	public boolean isCheese;
	public int spicyLv;
	
	public Tteokbokki() {
		this.brand = "배떡";
		this.riceCake = "밀떡";
		this.sauce = "마라로제";
		this.isCheese = true;
		this.spicyLv = 3;	
	}
	
	//오버로딩
	public Tteokbokki(String brand, String riceCake, String sauce, 
			boolean isCheese, int spicyLv) {
		this.brand = brand;
		this.riceCake = riceCake;
		this.sauce = sauce;
		this.isCheese = isCheese;
		this.spicyLv = spicyLv;		
	}
	
	public void printInfo() {
		System.out.println("brand: " + brand);
		System.out.println("ricecake: " + riceCake);
		System.out.println("sauce: " + sauce);
		System.out.println("isCheese: " + isCheese);
		System.out.println("spicyLv: " + spicyLv);
	}

}
