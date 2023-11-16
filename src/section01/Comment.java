package section01;
/*
 * 주석 
 * 코드에 영향을 주지 않는 개발자가 사용하는 메모 공간
 * 여러 줄로 주석을 쓸 수 있다
 */

//안녕하세요 반갑습니다 
//한 줄 주석
//한 줄 주석 단축기 = ctrl + /
public class Comment {
	public static void main(String[] args) {
		System.out.println("Hello, Java!");
		
		area(10); //아래에 있는 area 메서드 호출
		
	}
	/** JavaDoc 주석
	 * 
	 * 원의 넓이를 구하는 메서드
	 * @param r - 반지름 역할
	 */
	public static void area (int r ) {
//		원의 넓이를 구하는 코드
		double area = Math.PI * Math.pow(r, 2);
//		Math.PI == 원주율의 값
//		Math.pow(r,n) r의 값을 n제곱 하겠다
		System.out.println("원의 넓이: " +  area);
		
	}

}
