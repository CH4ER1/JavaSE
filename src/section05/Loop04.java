package section05;

/*
 * 중첩 반복문
 * 	반복문 안의 반복문
 * 	중첩 조건문도 가능함
 * 
 * 바깥 쪽 for 문: 행
 * 안 쪽 for 문: 열
 */

public class Loop04 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 7; i++) { 
			
			/*
			 * i = 0, j = 0 print 				*
			 * i = 1, j = 0 1 print 			**
			 * i = 2, j = 0 1 2 print 			*** 
			 * i = 3, j = 0 1 2 3 print 		**** 
			 * i = 4, j = 0 1 2 3 4 print 		*****
			 * i = 5, j = 0 1 2 3 4 5 print 	******
			 * i = 6, j = 0 1 2 3 4 5 6 print 	******* 
			 * i = 7, for 문 종료
			 * 
			 */
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
	}

}
