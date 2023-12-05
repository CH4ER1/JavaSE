package section11;

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
