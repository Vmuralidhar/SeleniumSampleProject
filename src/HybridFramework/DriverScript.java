package HybridFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Properties;

import HybridFramework.ActionUtils;
import HybridFramework.ReadObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilPack1.Xls_Reader;

public class DriverScript {

ActionUtils Operation = new ActionUtils();
ReadObject Obj = new ReadObject();
public void ExecuteKeywords(Hashtable<String, String> h1)
{
	String keyword=null;
	String locatorType=null;
	String locatorValue=null;
	String data=null;
	
	Xls_Reader x1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\HybridWorkBook.xlsx");
	int rowcount=x1.getRowCount("TestCaseSheet1");
	int startrowcount=2;

    System.out.println("Total rows "+rowcount);
    
    for(int i=1;i<rowcount;i++)
    {
    	keyword=x1.getCellData("TestCaseSheet1", "KeyWord", startrowcount);
    	locatorType=x1.getCellData("TestCaseSheet1", "LocatorType", startrowcount);
    	locatorValue=x1.getCellData("TestCaseSheet1", "LocatorValue", startrowcount);
    	data=x1.getCellData("TestCaseSheet1", "Data", startrowcount);
    	if(keyword.equals("OPENBROWSER"))
    	{
    		Operation.openBrowser(data);
    		
    	}else if(keyword.equals("OPENURL"))
    	{
    		Operation.openUrl(data);
    	}else if(keyword.equals("ENTERDATA"))
    	{
    		//Operation.enterData(locatorType,p2.getProperty(locatorValue),h1.get(data)); 		
    		Operation.enterData(locatorType,Obj.p.getProperty(locatorValue),h1.get(data));
    	}else if(keyword.equals("CLICK"))
    	{
    		Operation.click(locatorType,Obj.p.getProperty(locatorValue));
    	}
    	else if(keyword.equals("SELECTDROPDOWN"))
    	{
    		Operation.selectDropdown(locatorType,Obj.p.getProperty(locatorValue),h1.get(data));
    	}
    	else if(keyword.equals("CLOSEBROWSER"))
    	{
    		Operation.closeBrowser();
    	}
    	startrowcount++;
    	   	
    }

	
	
}


}


