package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
//		driver.get("http://newtours.demoaut.com/");
		
//		driver.findElement(By.id("identifierId")).sendKeys("Selenium");

		boolean Displayflag=driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).isDisplayed();
		
		boolean Enableflag=driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).isEnabled();
		
		boolean selectflag=driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).isSelected();
		
		System.out.println("Select Flag "+selectflag);
		
		
		if(Displayflag==true & Enableflag==true)
		{
			System.out.println("UserName is displayed and enabled");
			driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).sendKeys("Selenium6");
			driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).clear();
			driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).sendKeys("dsfdsfsdfsfsd");
			
			String ActualUserName=driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).getAttribute("value");
			
			System.out.println("ActualUserName text value is:"+ActualUserName);
			
			//driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).sendKeys(Enter);;
			
			String ActData=driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).getAttribute("aria-label");
			
			System.out.println("Defualt text value is:"+ActData);
			
			String ExpectedData="Email or phone";
			
			
			if(ExpectedData.equals(ActData))
			{
				System.out.println("Data got matched");
			}
			else
			{
				System.out.println("Data not matched");
				throw new Exception("Data not matched");
			}
			
			
		}


	}

}
