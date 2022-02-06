package banquetHall;

import java.util.Scanner;

public class MainBanquet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Banquet obj = new Banquet();

		System.out.println("Welcome to Carmens!" + "\n" + " We Offer 3 Type of Packages:" + "\n" + "-Cherish : 2000"
				+ "\n" + "-Beloved : 3000" + "\n" + "-Harmoney : 4000");

		System.out.println("Please Enter Base Cost of the Package you wish to Book: ");
		obj.baseCost = sc.nextDouble();
		if (obj.baseCost == 2000 || obj.baseCost == 3000 || obj.baseCost == 4000) {
			System.out.println("Please Enter Food Cost: ");
			obj.foodCost = sc.nextDouble();
			System.out.println("Please Enter Beverages Cost: ");
			obj.beveragesCost = sc.nextDouble();
			System.out.println("Please Enter Tip: ");
			obj.tip = sc.nextDouble();

			System.out.println("Please enter Number of Guests: ");
			obj.noofguest = sc.nextInt();

			if (obj.noofguest != 0) {

				System.out.println("Base Cost Before Taxes: " + obj.calculateBaseCost(0));
				// System.out.println("Cess Charges: " + obj.calculateCess(0, 0));
				// System.out.println("HST/GST Calculated Taxes: " + obj.calculatetax(0));
				System.out.println("Total Booking cost After Taxes: " + obj.calculateTheTotalCost(0));
			} else {
				System.out.println("oops! Invalid number of guest");
			}
		} else {
			System.out.println("Invalid package amount!");
		}

	}
}
