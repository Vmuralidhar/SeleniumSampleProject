package seleniumDemos;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitDemo1 {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			System.out.println("11");
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			System.out.println("22");
			// //tagname[@attribute='value']
			String xpathvalue1="//span[@id='ContentHolder_lbFeatures_TG_D']";
			String xpathvalue2="//span[@id='ContentHolder_lbFeatures_Bluetooth_D']";
			String xpathvalue3="//span[@id='ContentHolder_lbModels_10_D']";
			System.out.println("33");								
			driver.findElement(By.xpath(xpathvalue1)).click();		
			driver.findElement(By.xpath(xpathvalue2)).click();
			System.out.println("44");
			driver.findElement(By.xpath(xpathvalue3)).click();
			driver.close();
				
		}

	}

