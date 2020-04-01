
public class WrapperDemo2 {

	public static void main(String[] args) {
		int  airmiles=3000;
		String FlightCharges="400";
		int FlightCharges2=Integer.parseInt(FlightCharges);//It will convert to numerical values
		System.out.println(FlightCharges2);
		if(airmiles>=FlightCharges2)
		{
			System.out.println("Book ticket");
		}else
		{
			System.out.println("cannot Book ticket");
		}
		
		String FlightCharges3="$40,000";
		//int FlightCharges4=Integer.parseInt(FlightCharges3);//number format exception
		FlightCharges3=FlightCharges3.replaceAll("[^0-9]","");//replacing all non numerical(numeric are 0-9) values with nothing
		int FlightCharges4=Integer.parseInt(FlightCharges3);
		System.out.println(FlightCharges3);
		System.out.println(FlightCharges4);
		if(airmiles>=FlightCharges4)
		{
			System.out.println("Book ticket");
		}else
		{
			System.out.println("cannot Book ticket");
		}
		
		
	}

}
