package section03;

/*
 * 2. 증감연산자
 * 	++: 1씩 증가
 * 	--: 1씩 감소
 * 
 * 
 * 
 * 
 * 
 */

public class Operator02 {
	
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);	//num = 1;
		num++; //num = num + 1;
		System.out.println(num);	//num = 2;
		
		//전위 증감연산자 - print 명령어 실행 전 1 증가
		System.out.println(++num);	//num = 3;
		
		//후위 증감연산자 - print 명령어 실행 후 1 증가
		System.out.println(num++);	//num = 3;
		System.out.println(num);	//num = 4;
		
		System.out.println(--num);	//num = 3;
		System.out.println(num--);	//num = 3;
		System.out.println(num);	//num = 2;
		
		
	}

}
