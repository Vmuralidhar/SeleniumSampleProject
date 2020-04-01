
public class BudgetDemo {

	public static void main(String[] args) {

		int grossSal=10000;
		BudgetDemo b1= new BudgetDemo();
		int charges=b1.houseCharges(2000, 1000);
		System.out.println("Total Charges " +charges);
		int netSal=grossSal-charges;
		System.out.println("Net Sal " +netSal);
		int loanamount=1000+charges;
		System.out.println("loan amount " +loanamount);
	}
	int houseCharges(int houserent ,int childfee)
	{
		int totalcharges=houserent+childfee;
		return totalcharges;
	}

}
