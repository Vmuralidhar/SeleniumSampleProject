package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class KeywordsDemo1 {
	
	static WebDriver driver;	
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
		



