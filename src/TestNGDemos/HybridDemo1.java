package TestNGDemos;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utilPack1.Xls_Reader;

public class HybridDemo1 {

static WebDriver driver;
Properties p2;
public HybridDemo1() throws Exception
{	
	p2= new Properties();
	FileInputStream f2=new FileInputStream("C:\\Users\\computer\\Desktop\\IOPack\\ObjectsLocators.properties");
	p2.load(f2);

}

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
    		openBrowser(data);
    	}else if(keyword.equals("OPENURL"))
    	{
    		openUrl(data);
    	}else if(keyword.equals("ENTERDATA"))
    	{
    		enterData(locatorType,p2.getProperty(locatorValue),h1.get(data));
    	}else if(keyword.equals("CLICK"))
    	{
    		click(locatorType,p2.getProperty(locatorValue));
    	}
    	else if(keyword.equals("CLOSEBROWSER"))
    	{
    		closeBrowser();
    	}
    	startrowcount++;
    	   	
    }

	
	
}

public void openBrowser(String browserName) {
	try 
	{
		if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\computer\\Desktop\\\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\computer\\Desktop\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	} catch (WebDriverException e) {
		System.out.println(e.getMessage());
	}
}

		
public void click(String locatorType,String locatorValue)	
{
	try 
	{
		WebElement element=null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element=driver.findElement(By.xpath(locatorValue));
		}else if (locatorType.equalsIgnoreCase("name")) {
			
			element=driver.findElement(By.name(locatorValue));
		}else if (locatorType.equalsIgnoreCase("id")) {
			
			element=driver.findElement(By.id(locatorValue));
		}
		element.click();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}

}

public void enterData(String locatorType,String locatorValue,String data)	
{
	try 
	{
		WebElement element=null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element=driver.findElement(By.xpath(locatorValue));
		}else if (locatorType.equalsIgnoreCase("name")) {
			
			element=driver.findElement(By.name(locatorValue));
		}else if (locatorType.equalsIgnoreCase("id")) {
			
			element=driver.findElement(By.id(locatorValue));
		}
		element.sendKeys(data);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
		
public void openUrl(String url)
{
	try
	{
		driver.get(url);
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}

public void closeBrowser()
{
	try
	{
		driver.close();
		driver.quit();
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}


