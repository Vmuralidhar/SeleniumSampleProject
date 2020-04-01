package TestNGDemos;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotDemo1 {

	public static void main(String[] args) throws IOException {
	
		String baseUrl = "http://jqueryui.com/droppable/";
		
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);
	    
	    Date d1=new Date();
		System.out.println(d1);
		SimpleDateFormat s1=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
		String newDateformat=s1.format(d1);
		
	    File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    String name="screenshot_"+newDateformat+".png";
	    FileUtils.copyFile(scrFile, new File("C:\\Users\\computer\\Desktop\\ExtentReports\\"+name));
	}

}
