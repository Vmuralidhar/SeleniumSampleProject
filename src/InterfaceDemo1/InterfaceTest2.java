package InterfaceDemo1;

public class InterfaceTest2 {
	Bank b1;

	public static void main(String[] args) {
		
		InterfaceTest2 i1= new InterfaceTest2();
		i1.testBalance("CanADA");
		

	}
	
	public void testBalance(String data)
	{
		if(data.equalsIgnoreCase("Us"))
		{
			b1=new USBank();
		}
		else if(data.equalsIgnoreCase("uK"))
		{
			b1=new UKBank();
		}
		else if(data.equalsIgnoreCase("CaNada"))
		{
			b1=new CanadaBank();
		}	
		b1.totalBalance();
	}

}
