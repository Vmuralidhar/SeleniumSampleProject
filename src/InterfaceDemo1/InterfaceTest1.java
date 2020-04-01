package InterfaceDemo1;

public class InterfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank b1=new Bank();
		
		Bank b1=new CanadaBank();
		b1.totalBalance();
		b1=new USBank();
		b1.totalBalance();
		b1=new UKBank();
		b1.totalBalance();//using one variable we can assign different classes
			
		System.out.println("ROI: "+b1.rateOfInterest()); 

	}

}
