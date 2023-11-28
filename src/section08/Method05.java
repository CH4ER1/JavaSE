package section08;

public class Method05 {
	public static void main(String[] args) {
		
		String name = getName();
		System.out.println("name: " + name);
		
		System.out.println("getName(): " + getName());
		
		
	}
	// 5. 매개변수 (인자) X, 리턴값 O -> 메서드 실행하여 연산 결과값 반환
	public static String getName() {
		String name = "홍길동";
		//main 에 있는 String name 의 변수랑 다름
		return name;
//		return "홍길동";
	}

}
