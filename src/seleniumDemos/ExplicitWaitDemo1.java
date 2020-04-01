package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			// //tagname[@attribute='value']
			String xpathvalue1="//span[@id='ContentHolder_lbFeatures_TG_D']";
			String xpathvalue2="//span[@id='ContentHolder_lbModels_10_D']";
								
			driver.findElement(By.xpath(xpathvalue1)).click();
			WebDriverWait myWait = new WebDriverWait(driver, 10);
			myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathvalue2)));
			driver.findElement(By.xpath(xpathvalue2)).click();
			
	
			
		}

	}

