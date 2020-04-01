package TestNGDemos;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportDemo1 {
	
	public static void main(String[] args) {
		String HtmlReports="C:\\Users\\computer\\Desktop\\ExtentReports\\Sample.html";
		
		ExtentReports report=new ExtentReports(HtmlReports);
		ExtentTest reportData=report.startTest("TestCase-1");
		// TODO Auto-generated method stub
		reportData.log(LogStatus.INFO, "report information");
		reportData.log(LogStatus.PASS, "report pass information");
		reportData.log(LogStatus.FAIL, "report fail information");
		reportData.log(LogStatus.WARNING, "report warning information");
		
		
		report.endTest(reportData);
		ExtentTest reportData1=report.startTest("TestCase-2");
		// TODO Auto-generated method stub
		reportData1.log(LogStatus.INFO, "report information");
		reportData1.log(LogStatus.PASS, "report fail information");
		reportData1.log(LogStatus.SKIP, "report skip information");
		report.endTest(reportData1);
		report.flush();

	}

}
