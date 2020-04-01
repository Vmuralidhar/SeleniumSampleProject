package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownAkbar {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.akbartravels.com");
			// //tagname[@attribute='value']
			String xpathvalue1="//*[@id='fromArrow']";
			
			boolean SelectFlag=driver.findElement(By.xpath(xpathvalue1)).isSelected();
			
			String ClassValue=driver.findElement(By.xpath(xpathvalue1)).getAttribute("class");
			
			 System.out.println("Flag Value before:"+ClassValue);

			 
			 
		}

	}

