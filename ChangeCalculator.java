package changeMaker;

import java.util.Scanner;

public class ChangeCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double price;
		double payment;
		
		System.out.println("What is the price?");
		price = keyboard.nextDouble();
		System.out.println("What is the payment?");
		payment = keyboard.nextDouble();
		
		double change = payment - price;
		
		System.out.println("Your change is $" + change);
		
		keyboard.close();
	}
}
