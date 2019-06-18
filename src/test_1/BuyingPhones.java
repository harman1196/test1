package test_1;

import java.util.Scanner;

public class BuyingPhones {

	public static void main(String[] args) {
		System.out.println("Enter the regular price of a phone: ");
		Scanner s = new Scanner(System.in);
		double price = s.nextDouble();
		double price2=price/2;
		System.out.println("regular price for phoneprice  " +price);
		System.out.println(" no. of phones is 3");
		System.out.println(" phone 1:- "+price);
		System.out.println(" phone 2:- "+price);
		System.out.println(" phone 3:- "+price2);
	}

}
