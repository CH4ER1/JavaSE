package section02;

/*
 * 형변환(cast)
 * 	1. 업캐스팅
 * 		- 표현 범위가 큰 데이터형으로 변환
 * 		- 자동으로 가능
 * 		- 데이터 손실이 없음
 * 
 * 	2. 다운캐스팅
 * 		- 표현 범위가 더 작은 데이터형으로 변환
 * 		-명시적으로 해야 됨
 * 		- 데이터 손실이 있을 수 있음
 * 
 */

public class Variable07 {
	
	public static void main(String[] args) {
		
		//업캐스팅
		byte iByte = 10;
		int iInt = iByte; //자동으로 형변환
		System.out.println("iInt: " + iInt);
		
		float iFloat = 10.1f;
		double iDouble = iFloat; //자동으로 형변환, 부동소수점 오차 有
		System.out.println("iDouble: " + iDouble);
		
		//다운캐스팅
		int iInt2 = 130;
		//byte iByte2 = iInt2;
		//System.out.println("iByte: " + iByte); //컴파일에러
		byte iByte2 = (byte)iInt2; //int를 byte로 형변환
		System.out.println("iByte2: " + iByte2); //오버플로우, 데이터 손실 有
		
		//실수 -> 정수 형변환
		float iFloat2 = 3.1415f;
		int iInt3 = (int)iFloat2;	//float를 int로 형변환
		System.out.println("iInt3: " + iInt3);
		
		
	}

}
