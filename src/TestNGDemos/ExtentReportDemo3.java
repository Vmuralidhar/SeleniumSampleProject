package TestNGDemos;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo3 {
	
	public static void main(String[] args) {
		String HtmlReports="C:\\Users\\computer\\Desktop\\ExtentReports\\Sample.html";
		
		ExtentReports report=new ExtentReports(HtmlReports);
		ExtentTest reportData=report.startTest("TestCase-1");
		// TODO Auto-generated method stub
		reportData.log(LogStatus.INFO, "report information");
		reportData.log(LogStatus.PASS, "report pass information");
		reportData.log(LogStatus.FAIL, "report fail information");
		reportData.log(LogStatus.WARNING, "report warning information");
		
		 Date d1=new Date();
			System.out.println(d1);
			SimpleDateFormat s1=new SimpleDateFormat("dd_MM_yyyy hh_mm_ss");
			String newDateformat=s1.format(d1);
			

		    String name="C:\\Users\\computer\\Desktop\\ExtentReports\\"+"screenshot_"+newDateformat+".png";
	
		   // String image=reportData1.addScreenCapture(name);
			
			
		report.endTest(reportData);
		ExtentTest reportData1=report.startTest("TestCase-2");
		// TODO Auto-generated method stub
		reportData1.log(LogStatus.INFO, "report information");
		 String image=reportData1.addScreenCapture(name);
		reportData1.log(LogStatus.PASS, "report fail information",image);
		

		
		reportData1.log(LogStatus.SKIP, "report skip information");
		report.endTest(reportData1);
		
	
		
		report.flush();

	}

}
