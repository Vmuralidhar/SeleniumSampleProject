package seleniumDemos;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemo {
	
	public static void main(String[] args) {
	String baseUrl = "http://jqueryui.com/droppable/";
	
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);    	    
	    driver.switchTo().frame(0);
	    
	   // driver.switchTo().frame(driver.findElement(By.name("viewport")));
	   
	    
	   	//click on drag
	   WebElement drag= driver.findElement(By.xpath("//*[@id='draggable']"));
	   
	   WebElement drop= driver.findElement(By.xpath("//*[@id='droppable']"));

	  Actions a1= new  Actions(driver);
	  a1.dragAndDrop(drag, drop);
	  //we need to perform
	  a1.perform();
	    
	}	    
	    

}
