package section05;

public class LoopHW5 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j =1; j < 10; j++) {
				int k = i * j;
				System.out.println(i + "X" + j + "=" + k);
			}
			System.out.println();
		}
	}
}
