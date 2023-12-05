package section11;
/*
 * instanceof 연산자 (중요)
 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스의 여부를 확인하는 연산자
 * 
 */
import java.util.Scanner;

import section11.access2.Ade;
import section11.access2.Coffee;
import section11.access2.Drink;

public class Polymorphism03 {

	public static void main(String[] args) {
		
		Scanner scan = null;
		
		while(true) {
			int inputNum = 0;
			scan = new Scanner (System.in);
			System.out.println("1. Coca-Cola Zero");
			System.out.println("2. Classic Milk Coffee");
			System.out.println("0. finish");
			System.out.println("Choose your beverage >>>");
			
			inputNum = scan.nextInt();
			if (inputNum == 0) break;
			
			Drink drink = getDrink(inputNum);
			drink.printInfo();

			if (drink instanceof Ade) {
				Ade ade = (Ade) drink;
				System.out.println("제로콜라입니까? " + ade.isZero);
			} else if (drink instanceof Coffee) {
				Coffee coffee = (Coffee) drink;
				System.out.println("디카페인 커피입니까? " + coffee.isDecaf);
			}
			System.out.println();
		}
	} // 메인 메서드 종료
	
	public static Drink getDrink(int inputNum) {
		Drink drink = null;
		if (inputNum == 1) {
			drink = new Ade();
		} else if (inputNum == 2) {
			drink = new Coffee();
		}
		return drink;
	}
}
