package section03;

/*
 * 4. 논리 연산자
 * 	&&: And 조건, 교집합 개념, 두 항 모두 true 일 때 true
 * 	||: Or 조건, 교집합 개념, 두 항 중 하나 이상 true 일 때 true
 * 	!: Not 조건, 여집합 개념, 논리(boolean) 값 반전시킴
 * 
 */

public class Operator04 {
	
	public static void main(String[] args) {
		
		boolean result = true && false; 
		// boolean result = true && true; 일 때만 result = true;
		
		System.out.println("result: " + result);
		System.out.println("result: " + !result); //result 값 반전
		
		int age = 28;
		String gender = "Male";
		//boolean result2 = age >= 19 && gender == "Male";
		
		if (age >= 19 && gender == "Male") {
			System.out.println("성인 남성입니다. ");
		} else {
			System.out.println("성인 남성이 아닙니다. ");
		}
		
		
		boolean result3 = true || false; // false || false 일 때만 false
		System.out.println("result3: " + result3);
		
		String brand = "LG 전자"; // 입력값
		if (brand == "LG 전자" || brand == "LG생활건강" || brand == "LG UPLUS") {
			System.out.println("LG 우승 세일 29% 할인 행사 중입니다. ");
		} else {
			System.out.println("할인 미적용 브랜드입니다. ");
		}
		
		boolean result4 = true && true && true || false;
		System.out.println("result 4: " + result4);
	}

}
