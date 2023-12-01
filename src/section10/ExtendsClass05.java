package section10;

/*
 * final 클래스
 * 	클래스 키워드 앞에 final 키워드 선언 시, 클래스 상속의 마지막임을 의미
 * 	상속 불가 클래스
 * 
 * 
 * 
 */
final class Cat {
	//더 이상 상속을 못 받음
	public String name;
	public void meow() {
		System.out.println("야옹");
	}	
	
}

//The type PersianCat cannot subclass the final class Cat
// class ##### extends Cat -> 컴파일 에러 
		//class PersianCat extends Cat {
		//	컴파일 에러!
		//}

public class ExtendsClass05 {

}
