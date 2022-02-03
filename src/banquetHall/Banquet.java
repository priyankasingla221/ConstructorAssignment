package banquetHall;


public class Banquet {
	double baseCost;
	double foodCost;
	double beveragesCost;
	double tip;
	double totalbasecost;
	double taxfortotalbasecost;
	double cesstaxfortotalbasecost;
	double noofguest;

	public Banquet(double baseCost, double foodCost, double beveragesCost, double tip) {
		
		this.foodCost = foodCost;
		this.beveragesCost = beveragesCost;
		this.tip = tip;
	}

	double calculateBaseCost(double totalBaseCost) {
		// Assuming that there are 3 package offered by carmens banquet hall starts from base  Charish for 2000$, beloved 3000$, Harmony 4000
		//values entered other than these will not give calculation result.
		totalbasecost = totalBaseCost;
		if (baseCost==2000 || baseCost == 3000 || baseCost ==4000 ) {
		
		totalbasecost = baseCost + foodCost + beveragesCost + tip;
		
		}
		else {
			System.out.println("Invalid base amount! Please choose one of the base prices listed above.");
			
		}
		return totalbasecost;

	}

	double calculatetax(double taxForTotalBaseCost) {

		taxfortotalbasecost = taxForTotalBaseCost;
		taxfortotalbasecost = totalbasecost * 0.15;
		System.out.println("Provincial HST/GST 15%");
		return taxfortotalbasecost;
	}

	double calculateCess(double noOfGuest, double cessTaxForTotalBaseCost) {
		noOfGuest = noofguest;
		cesstaxfortotalbasecost = cessTaxForTotalBaseCost;

		// Less than or equal to 40 guests, cess is 4%
		if (noOfGuest <= 40) {
			System.out.println("Cess Fee Charged 4%");
			cesstaxfortotalbasecost = totalbasecost * 0.04;
		}

		// More than 40 and up to 80 guests, cess is 8%
		else if (noOfGuest > 40 && noOfGuest <= 80) {
			System.out.println("Cess Fee Charged 8%");
			cesstaxfortotalbasecost = totalbasecost * 0.08;
		}

		// For more than 80 and less than 150 guests, cess is 10%
		else if (noOfGuest > 80 && noOfGuest < 150) {
			System.out.println("Cess Fee Charged 10%");
			cesstaxfortotalbasecost = totalbasecost * 0.10;
		}

		// For more than 150 guests, cess will be 12.5%
		else  {
			System.out.println("Cess Fee Charged 12.5%");
			cesstaxfortotalbasecost = totalbasecost * 0.125;

		}
		
		return cesstaxfortotalbasecost;
	}

	double calculateTheTotalCost(double calculatetotalcost) {
		calculatetotalcost = totalbasecost + taxfortotalbasecost + cesstaxfortotalbasecost;
		return calculatetotalcost;

	}

}
