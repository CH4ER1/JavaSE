package section08;


public class Method04 {
	public static void main(String[] args) {
		
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		
		String[] pokemons = {"피카츄", "라이츄", "파이리"};
		printPokeMons (pokemons);
	}
	
	// 4. 매개변수 (인자) 배열 타입 O, 리턴 X
	public static void printPokeMons(String[] pokemons) {
		//public static void printPokeMons (String...pokemons)
		/*
		for (int i = 0; i < pokemons.length; i++) {
			System.out.println(pokemons[i]);
		} */
		// 향상된 for문
		for (String pokemon : pokemons) {
			System.out.println(pokemon);
		}
		
	}
}
