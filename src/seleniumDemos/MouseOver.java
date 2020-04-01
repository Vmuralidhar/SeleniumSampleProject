package seleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {
	
	public static void main(String[] args) {
		String baseUrl = "http://amazon.in/";
		
		   WebDriver driver = new FirefoxDriver();
		   driver.get(baseUrl);    	   	   
		   WebElement Element1= driver.findElement(By.xpath("//*[@id='nav-link-shopall']/span[2]/span"));
		   WebElement Element2= driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span[1]"));
		   
		   WebElement Element3= driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[5]/div[1]/div/a[1]/span"));   

		  Actions a1= new  Actions(driver);
		  a1.moveToElement(Element1);
		  //we need to perform
		  a1.perform();
		  //shop-->Books->All Books
		  
			WebDriverWait myWait = new WebDriverWait(driver, 10);

			myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span[1]")));
		  a1.moveToElement(Element2);
		  //we need to perform
		  a1.perform();
		  Element3.click();
		  
		  System.out.println("Title of page :"+driver.getTitle());
		   
		    
		}	    

}


