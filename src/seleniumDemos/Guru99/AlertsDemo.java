package seleniumDemos.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsDemo {

	 public static void main(String[] args) {
	    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        String alertMessage = "";

	        driver.get("http://jsbin.com/usidix/1");
	        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
	        alertMessage = driver.switchTo().alert().getText();
	        driver.switchTo().alert().accept();
	        
	        //driver.switchTo().alert().accept();
	       
	        System.out.println(alertMessage);
	        driver.quit();
	       
	    }
}
