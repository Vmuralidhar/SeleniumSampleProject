package TestNGDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StaticBlockDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println(System.getProperty("Date1"));
		System.out.println(System.getProperty("Date2"));
	
	}

	static
	{
		System.out.println("Static Block Execution");
		
		Date d1= new Date();		
		System.setProperty("Date1", "10 02 2017");
		System.setProperty("Date2", ""+d1);
	}
}
