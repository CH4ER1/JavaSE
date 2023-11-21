package section05;

/*
 * 3. for 문
 * 	초기식, 조건식, 증감식을 이용하여 반복적으로 실행하는 명령어
 * 
 * for (초기식; 조건식; 증감식) {
 * 		반복 수행할 실행 명령어
 * }
 *  
 */

public class Loop03 {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
//실행 순서: 1. 초기식 2. 조건식 3. 실행명령어 4. 증감식 5. 조건식 ... (조건식이 거짓이 될 때까지)
			System.out.println(i);
		}
		System.out.println(); // 한 줄 띄우기
		
		int j = 1;
		while (j <= 10) {
			System.out.println(j);
			j++;
		}
	}

}
