package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
//		driver.get("http://newtours.demoaut.com/");
		
//		driver.findElement(By.id("identifierId")).sendKeys("Selenium");
//		driver.findElement(By.name("identifier")).sendKeys("Selenium2");
		
//		driver.findElement(By.xpath("html/body/div/div/div[2]/div[2]/form/div[2]/div/div/div/div/div/div/div/input")).sendKeys("Selenium3");
		
//driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Selenium4");
//		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Selenium4");
		driver.findElement(By.xpath("//*[@name='identifier' and @id='identifierId']")).sendKeys("Selenium6");
		


	}

}
