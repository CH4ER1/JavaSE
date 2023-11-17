package section03;

/*
 * 8. 삼항 연산자
 * 	조건식 ? 조건식이 참일 경우 반환 : 조건식이 거짓일 경우 반환
 * 
 */

public class Operator08 {
	public static void main(String[] args) {
		
		int num = 32;
		String result = num >= 0 ? "num은 양수" : "num은 음수";
		//조건식 num >= 0이 True면 "num은 양수" 출력
		//조건식 num >= 0이 False면 "num은 음수" 출력
		//한 줄 IF문
		System.out.println("result: " + result);
		
		int num2 = 17;
		
		String result2 = null; //주소값 0
		if (num2>=0) {
			result2 = "num2는 양수";
		} else {
			result2 = "num2는 음수;";
		}
		System.out.println("result: " + result2);
	}

}
