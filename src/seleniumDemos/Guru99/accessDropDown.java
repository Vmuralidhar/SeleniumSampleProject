package seleniumDemos.Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class accessDropDown {
	
	public static void main(String[] args) { 
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(1);
 }

}
