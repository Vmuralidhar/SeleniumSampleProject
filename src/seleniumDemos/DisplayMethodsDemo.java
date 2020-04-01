package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayMethodsDemo {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");		
//		driver.findElement(By.id("identifierId")).sendKeys("Selenium");
		String xpathvalue="//*[@name='identifier' and @id='identifierId']";

		boolean Displayflag=driver.findElement(By.xpath(xpathvalue)).isDisplayed();
		
		boolean Enableflag=driver.findElement(By.xpath(xpathvalue)).isEnabled();
		
		boolean selectflag=driver.findElement(By.xpath(xpathvalue)).isSelected();
		
		System.out.println("Display Flag "+Displayflag);
		
		System.out.println("Display Flag after method "+DisplayMethod(xpathvalue));
		System.out.println("Enable Flag "+Enableflag);
		
		System.out.println("Enable Flag after method "+EnableMethod(xpathvalue));
		
		System.out.println("Select Flag "+selectflag);
			
			
		}

		public static boolean DisplayMethod(String xpathvalue)
		{
			boolean Displayflag=driver.findElement(By.xpath(xpathvalue)).isDisplayed();
			return Displayflag;
		}
	
		public static boolean EnableMethod(String xpathvalue)
		{
			boolean Enableflag=driver.findElement(By.xpath(xpathvalue)).isEnabled();
			return Enableflag;
		}
		
	}

