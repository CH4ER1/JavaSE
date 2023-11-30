package section06;

public class ArrayAnswer {
	public static void main(String[] args) {
		
		int [][] array = new int [7][7];
		
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				int value = j + 1 + (i * 7);
				array[i][j] = value;
				System.out.print(array[i][j] + " ");
			} System.out.println();
		} System.out.println("===============");
		
		for (int i = 0; i < 13; i++) {
			
			if ( i < 7) {
				for (int j = 0; j < i + 1; j++) {
					if ( i % 2 == 0 ) {
						System.out.print(array[i-j][j] + " ");
					} else {
						System.out.print(array[j][i-j] + " ");
						}					
					}
				} else {
					for (int j = 0; j < 13 - i; j++) {
						if ( i % 2 == 0) {
							System.out.print(array[6-j][i-6+j] + " ");
						} else {
							System.out.print(array[i-6+j][6-j] + " ");							
						}
					}			
				}
				System.out.println();				
			}
		}
	}


