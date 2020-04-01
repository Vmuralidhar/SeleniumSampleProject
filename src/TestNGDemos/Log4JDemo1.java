package TestNGDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import org.testng.log4testng.Logger;

public class Log4JDemo1 {
	
	public static void main(String[] args) {
		Logger logger=Logger.getLogger("Class Name");
		PropertyConfigurator.configure("C:\\Users\\computer\\Desktop\\Logger\\log4j.properties");
		logger.debug("Debug-Step");
		logger.info("information info");
		logger.warn("warning");
		logger.error("error");
		logger.fatal("fatal");
	
	}
	
	
	static
	{

		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hhmmss");
		System.setProperty("current.date", dateFormat.format(new Date()));
		
	}
	
}




/*

Debug---D
information---I
warnings----W
error----E
fatal---F
 */

