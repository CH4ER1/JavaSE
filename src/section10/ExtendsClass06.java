package section10;

/*
 * final 메서드
 * 	메서드에서 final 선언하면 해당 메서드는 서브 클래스에서 오버라이딩 할 수 없음
 * 	오버라이딩 불가 메서드
 * 
 */

class Dog {
	public final void bark() { 
		//메서드 앞에 final이 붙으면 오버라이딩 불가
		System.out.println("멍멍");
	}	
	
}

//Cannot override the final method from Dog

//class Jindo extends Dog {
//	public void bark() {
//		
//	}
//}

public class ExtendsClass06 {

}
