package TestNGDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStampDemo1 {

	public static void main(String[] args) throws ParseException {

		Date d1=new Date();
		System.out.println(d1);
		SimpleDateFormat s1=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String newDateformat=s1.format(d1);
		System.out.println(newDateformat);
		
		String givenDate="27 05 1985";
		SimpleDateFormat s3=new SimpleDateFormat("dd MM yyyy");

		Date newDate=s3.parse(givenDate);
		
		SimpleDateFormat s4=new SimpleDateFormat("d_MMM_yyyy");
		
		
		String newDateformat2=s4.format(newDate);
		System.out.println(newDateformat2);
		
		
	}

}
