package section05;


	public class LoopHomeWork2 {
		public static void main(String[] args) {
			for (int k = 0; k < 3; k++) {
//				System.out.println("k = " + k);
				for (int i = 0; i < 9; i++) {
					for (int j = 0; j < 3; j++) {
						int dan = j + 2 + (k*3);
						if (dan == 10) break;
						int multiply = i + 1;					
						System.out.printf("%d X %d = %d\t", dan, multiply, dan*multiply);
					} System.out.println();
				}
		} System.out.println();
		}
	}
