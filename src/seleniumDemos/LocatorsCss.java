package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsCss {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");

		//driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).sendKeys("Selenium6");
		
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("murali");
		
		


	}

}
