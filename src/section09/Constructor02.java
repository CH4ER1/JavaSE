package section09;

public class Constructor02 {
	
	public static void main(String[] args) {
		
		Tteokbokki tteokbokki = new Tteokbokki ("엽기떡볶이", "밀떡", "크림", false, 0);
		
		tteokbokki.printInfo();
		System.out.println();
		
		System.out.println("=======================");
		System.out.println();
		
		Tteokbokki tteokbokki2 = new Tteokbokki();
		tteokbokki2.printInfo();
		
	}

}
