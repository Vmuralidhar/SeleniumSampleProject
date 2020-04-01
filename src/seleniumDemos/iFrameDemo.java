package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrameDemo {
	
	public static void main(String[] args) {
		
	    String baseUrl = "http://only-testing-blog.blogspot.in/2015/01/iframe1.html";
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);
	    String ExpVal="Saturday, 3 January 2015";
	    
	    
	   // driver.switchTo().frame("frame1");
	   // driver.switchTo().frame(0);
	    
	    driver.switchTo().frame(driver.findElement(By.id("frame1")));
	    
	    String xpathvalue="//*[@id='Blog1']/div[1]/div/h2/span";
	    
	    String ActVal=driver.findElement(By.xpath(xpathvalue)).getText();
	    

	    System.out.println(" Act Value "+ActVal);
	    
	    if(ExpVal.equals(ActVal))
	    {
	    	System.out.println(" passed and Act Value "+ActVal);
	    }else
	    {
	    	System.out.println(" failed and Act Value "+ActVal);
	    }
	    
	    driver.switchTo().defaultContent();
	
		String xpathvalue2="//*[@id='text1']";
		
		driver.findElement(By.xpath(xpathvalue2)).sendKeys("Hyderabad");

	}    
	
	    
	}

