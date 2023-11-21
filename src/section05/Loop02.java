package section05;

/*
 * 2. do ~ while 문
 * 	while 문과 비슷하지만, 조건에 상관 없이 최초 한 번은 무조건 실행
 * 
 */

public class Loop02 {
	public static void main(String[] args) {
		
		int count = 1;
//		System.out.println(count);
//		while (count <= 100) {
//			System.out.println(count);
//			count++;
//		}
		
		do {			
			System.out.println(count);
			count++;
			//while 조건과 관계 없이 무조건 최초 한 번은 do 문 실행
		} while (count <= 100);
		
		
	}

}
