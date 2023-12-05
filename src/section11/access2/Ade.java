package section11.access2;

public class Ade extends Drink {

	private boolean isZero;
	public Ade() {
		name = "Coca-Cola";
		type = "Ade";
		price = 1900;
		isZero = true;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("isZero: " + isZero);
	}
}
