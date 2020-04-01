package seleniumDemos.Guru99;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CheckBoxLinkSubmit {

	public static void main(String[] args) {

		// declaration and instantiation of objects/variables
		WebDriver driver ;
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		driver = new FirefoxDriver();

		//Create explicit wait.
		//WebDriverWait waiti= new WebDriverWait(driver,30)
		
		WebDriverWait myWait = new WebDriverWait(driver, 10);

		String baseUrl = "http://newtours.demoaut.com/";
		driver.get(baseUrl);

		//wait until text box load.
		//myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name))
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));

		// Enter value into textbox
		driver.findElement(By.name("userName")).sendKeys ("mercury");

		// Delete value from textbox
		driver.findElement(By.name("userName")).clear();

		// Access Links
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.partialLinkText("SIGN-ON")).click();

		// Enter value into textbox and SUBMIT
		driver.findElement(By.name("userName")).sendKeys ("mercury");
		driver.findElement(By.name("password")).sendKeys ("mercury");
		driver.findElement(By.name("password")).submit();

		// Select Radio Button
		driver.findElement(By.cssSelector("input[value=Business]")).click();
		//Select CheckBox
		
		/*
		String baseURL = "http://material.angularjs.org/latest/demo/checkbox";
		driver.get(baseURL);

		//Create an Explicit wait.
		WebDriverWait myWait2 = new WebDriverWait(driver, 10);
		myWait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='md-icon']")));

		List<WebElement> chkFBPersist = driver.findElements(By.xpath("//div[@class='md-icon']"));
		
		System.out.println(chkFBPersist.size());
		for (int i=0; i<chkFBPersist.size(); i++) {
			//System.out.println(chkFBPersist.get(i).getAttribute("value"));
			chkFBPersist.get(i).click();
			
			//System.out.println(chkFBPersist.isSelected());
		}.*/

		//driver.quit();
		//System.exit(0);
	}
}
