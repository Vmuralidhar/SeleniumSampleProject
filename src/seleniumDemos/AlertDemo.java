package seleniumDemos;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AlertDemo {

	public static void main(String[] args) {
	    String baseUrl = "http://www.meghanatravels.in/";
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl);
	    
	    //String xpathvalue=".//img[@alt='Image is not uploaded yet']";
	    
	    //String xpathvalue="//*[@id='light']/div/ul[1]/li[1]/img";
	    
	    String xpathvalue="//*[@id='close']/img";
	   
	    driver.findElement(By.xpath(xpathvalue)).click();
	    driver.findElement(By.xpath("//*[@id='ect']/span")).click();
	    /*
	    try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}.*/
	    
		WebDriverWait myWait = new WebDriverWait(driver, 10);

		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='cancel-ticket']/form/div[2]/div[3]/input")));
	   
	    //driver.findElement(By.xpath("//input[@name='commit' and @type='submit' and @value='Submit']")).submit();
	    driver.findElement(By.xpath("//*[@id='cancel-ticket']/form/div[2]/div[3]/input")).click();
	    
	    
	   // Alert alert=driver.switchTo().alert();
	    

	    String alerttext=driver.switchTo().alert().getText();
	    
	    System.out.println(" alert text Value:"+alerttext);
	    
	    driver.switchTo().alert().accept();
	    
	    String textvalue=driver.findElement(By.xpath("//*[@id='main-content']/table/tbody/tr[2]/td/div/span[2]/b")).getText();
	    
	    System.out.println(" Outer text Value:"+textvalue);
	    
	
	}

}
