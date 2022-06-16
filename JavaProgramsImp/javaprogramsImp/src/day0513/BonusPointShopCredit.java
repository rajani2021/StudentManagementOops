package day0513;

import java.util.Scanner;

public class BonusPointShopCredit {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Items : ");
		int numberOfItems = sc.nextInt();
		double totalPrice = 0.0;
		double itemPrice = 0.0;
		int bonusPoint = 0;
		double shopCredit = 0;
		System.out.println("Enter " + numberOfItems + " Items with price and refund :");
		for (int i = 1; i <= numberOfItems; i++) {
			System.out.println("Enter item " + i + "'s price : ");
			itemPrice = sc.nextDouble();
			totalPrice += itemPrice;
		}
		System.out.println("Total Price = " + totalPrice);
		if (totalPrice > 0) {
			bonusPoint = (int) totalPrice / 10;
		} else {
			shopCredit = totalPrice;
		}
		System.out.println("Total Amount = " + totalPrice);
		System.out.println("Bonus Point = " + bonusPoint);
		System.out.println("Shop Credit = " + shopCredit);
		System.out.println("Main method starts");
	}
}