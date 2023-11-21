package section04;

/*
 * 2. switch ~ case 문
 * 	주어진 변수 값에 따라 case로 분기 실행 명령어 
 * 
 * break가 없으면 해당 실행문 아래까지 전부 실행됨
 */

public class Conditional04 {
	
	public static void main(String[] args) {
		
		char key = 's';
		
		switch (key) {
			case 'w':
				System.out.println("앞으로 이동!");
				break;
			case 'a': 
				System.out.println("좌측으로 이동!");
				break;
			case 's':
				System.out.println("뒤로 이동!");
				break;
			case 'd':
				System.out.println("우측으로 이동!");
				break;
			
			default:
				System.out.println("Hold!");
				break;
		}
		
	}

}
