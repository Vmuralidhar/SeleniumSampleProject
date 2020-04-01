package seleniumDemos;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideDemo {
	
	public static void main(String[] args) {
	String baseUrl = "http://jqueryui.com/slider/";
	
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);    	    
	    driver.switchTo().frame(0);
	    
	   // driver.switchTo().frame(driver.findElement(By.name("viewport")));
	   
	    
	   	//click on drag
	   WebElement slide= driver.findElement(By.xpath("//*[@id='slider']/span"));
	   


	  Actions a1= new  Actions(driver);
	  a1.dragAndDropBy(slide, 150, 0);

	  //we need to perform
	  a1.perform();
	    
	}	    
	    

}
