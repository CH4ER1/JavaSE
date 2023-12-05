package section11.access2;

public class Coffee extends Drink{

	public boolean isDecaf;
	public Coffee() {
		name = "Classic Milk Coffee";
		type = "Coffee";
		price = 2000;
		isDecaf = false;
		
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("isDecaf: " + isDecaf);
	}
}
