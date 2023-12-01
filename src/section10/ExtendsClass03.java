package section10;

/*
 * super 키워드
 * 	슈퍼 클래스의 멤버를 참조하는 키워드
 * 
 * 오버라이딩 (override / overriding) 키워드 (중요!!!!!!)
 * 	상속받은 메서드(부모 클래스)를 자식 클래스에서 재정의하는 것을 말함
 * 
 * 어노테이션 (Annotation)
 * 	자바 프로그래밍 언어에서 메타정보를 첨부하는 방법 중 하나
 * 
 * 
 */
public class ExtendsClass03 {
	public static void main(String[] args) {
		Latte latte = new Latte();
		latte.bean = "칠레";
		latte.brand = "네스카페";
		latte.water = 200;
		latte.milk = 100;
		
		latte.printInfo();
		
	}

}
