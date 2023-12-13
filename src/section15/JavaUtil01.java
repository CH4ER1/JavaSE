package section15;

import java.util.Random;

/*
 * 자바 유틸 패키지 (java.util)
 * 	자바에서 유용한 유틸 클래스, 인터페이스 등을 포함하는 패키지
 * 
 * 랜덤 클래스 (Random Class)
 * 	 난수를 생성해주는 클래스
 * 
 */

public class JavaUtil01 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		//0~99 사이 정수 중 난수 반환
		int ranNum = ran.nextInt(100);
		System.out.println("random: " + ranNum);
		
		double ranDouble = ran.nextDouble();
		System.out.println("randouble: " + ranDouble);
		//nextDouble: 0이상 1미만의 double 난수 반환
		
		if (ranDouble < 0.3) {
			System.out.println("강화에 성공했습니다.");
		} else {
			System.out.println("강화에 실패했습니다.");
		}
		
	}
}
