package section06;

public class Array05 {
	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		for (int i = 0; i < nums.length; i++) { // nums.length = 4;
			for (int j = 0; j < nums[i].length; j++) { // nums[i].length = 3;
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
			//ctrl+shift+f => 자동 정렬
		}
	}

}
