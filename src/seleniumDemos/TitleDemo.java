package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TitleDemo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		// //tagname[@attribute='value']
		String xpathvalue1="//input[@name='userName']";
		
		
		//a[@href='userName']
		//a href="mercurysignoff.php
		String xpathvalue2="//input[@name='password']";
		String xpathvalue3="//input[@name='login']";
		driver.findElement(By.xpath(xpathvalue1)).sendKeys("mercury");
		driver.findElement(By.xpath(xpathvalue2)).sendKeys("mercury");
		driver.findElement(By.xpath(xpathvalue3)).click();
		
		String ExpectedTitle="Find a Flight: Mercury Tours:";
		String ActualTitle=driver.getTitle();
		System.out.println("Title of the page:"+ActualTitle);
		
		
		//if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		if(ActualTitle.equals(ExpectedTitle))	
		{
			System.out.println("passed and Title of the page:"+ActualTitle);		
		}else
		{
			System.out.println("failed:"+ActualTitle);
		}
		
		
		
	}
}
