package section02;

/*
 * 4. 실수형
 * 	실수를 저장할 수 있는 자료형
 * 	
 * 	float (4byte): 부등소수점 형식으로, 소수점 7자리 표현
 * 	double (8byte): 부등소수점 형식으로, 소수점 15자리 표현
 * 
 * 리터럴(literal)
 * 	숫자, 문자 등 프로그램에서 사용되는 값 그대로 나타내는 상수 값이나 데이터 표현을 의미 
 * 
 */

public class Variable04 {
	public static void main(String[] args) {
		
		double marathon = 42.195d;
		// double은 값의 d 생략 가능, 실수 리터럴 double 인식
		// double marathon = 42.195;
		
		float half_marathon = 21.0975f;
		//float 값의 f 생략 불가능
		//float half_marathon = 21.0975; (X)
		System.out.println("마라톤은 " + marathon + "km를 달립니다. ");
		System.out.printf("하프 마라톤은 %f km를 달립니다.\n", half_marathon);
		
		
	}
	
	
	

}
