package section06;

/*
 * 배열 (Array)
 * 	같은 자료형의 여러 데이터를 저장할 수 있는 객체
 * 
 */
public class Array01 {
	
	public static void main(String[] args) {
		
		// 정수 10개를 담을 수 있는 배열 객체 생성
		int[] nums = new int[10]; //대괄호의 위치는 상관 없음
		//int nums[] = new int[10]; -> 가능
		int[] nums2 = null;
		
		//실수 10개를 담을 수 있는 배열 객체 생성
		double[] dnum = new double[10];
		
		//문자열 10개를 담을 수 있는 배열 객체 생성
		String[] str = new String[10];
		
		System.out.println(nums); //[I@58ceff1 <- 16진수로 메모리 주소값 출력
		System.out.println(nums2); //null
	}
}
