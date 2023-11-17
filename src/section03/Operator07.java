package section03;

/*
 * 7. 쉬프트 연산자
 * 	<<: 지정한 수만큼 비트를 전부 왼쪽으로 이동
 * 	>>: 지정한 수만큼 비트를 전부 오른쪽으로 이동
 * 
 */
public class Operator07 {
	public static void main(String[] args) {
		
		int x = 3;
		int y = 7;
		
		System.out.println(x << 2); //0011 << 2 -> 1100
		System.out.println(y >> 2);	//0111 >> 2 -> 0001, 부호비트 신경 X
		
		
	}

}
