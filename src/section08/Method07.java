package section08;

public class Method07 {
	public static void main(String[] args) {
		int [] values = {1, 2, 3, 4, 7, 12, 100};
		
		double[] result = summary(values);
		System.out.println("합계: " + result[0]);
		System.out.println("평균: " + result[1]);	
	}

	public static double [] summary(int[] values) {
		//result [0] : 합계, result [1] : 평균

		double[] result = new double[2];
		// 배열의 합
		int sum = 0;
		for (int val: values) {
			sum += val;
		}
		
		// 배열의 평균
		double avg = sum / (double)values.length;
		
		result[0] = sum;
		result[1] = avg;
		return result;
	}
}
