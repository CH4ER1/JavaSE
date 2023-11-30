package section09;


/*
 * 생성자 (Constructor)
 * 	객체를 생성할 때 실행되는 반환값이 없는 메서드
 * 	클래스 명과 동일함
 * 	객체 초기화 목적에 주로 사용됨
 * 
 */
public class Constructor01 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "이방인";
		book1.price = 9000;
		book1.totalPage = 280;
		book1.author = "알베르 카뮈";
		
		book1.printInfo();
		
		System.out.println("===========================");
		
		Book book2 = new Book();
		book2.printInfo();
		
	}
}
