package section02;
/*
 * Scanner 클래스
 * 	사용자로부터 데이터를 읽기 위해 사용되는 클래스
 * 	Scanner 클래스를 사용하면 키보드로 입력한 텍스트나 숫자를 읽을 수 있다
 * 
 */

import java.util.Scanner;

public class ScannerEx {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String name, address;	// 문자열 값을 담는 변수
		int age;	//정수 값을 담는 변수
		double weight;	//실수 값을 담는 변수
		
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요: ");
		name = scanner.next();		//name = "홍길동" 문자열
		address = scanner.next();		//address = "한양" 문자열
		age = scanner.nextInt();		//age = "20" 정수
		weight = scanner.nextDouble();		//weight = "70.000000" 실수
		
		System.out.printf("당신의 이름은 %s입니다\n", name);
		System.out.printf("당신의 주소는 %s입니다\n", address);
		System.out.printf("당신의 나이는 %d살 입니다\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다\n", weight);
		
		System.out.println("당신의 이름은" + name + "입니다");
		System.out.println("당신의 주소는" + address +"입니다");
		System.out.println("당신의 나이는" + age + "입니다");
		System.out.println("당신의 체중은" + weight +"입니다");
		
	}

}
