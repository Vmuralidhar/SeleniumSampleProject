package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectRadioButtons {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			// //tagname[@attribute='value']
			String xpathvalue1="//input[@name='userName']";
			
			
			//a[@href='userName']
			//a href="mercurysignoff.php
			String xpathvalue2="//input[@name='password']";
			String xpathvalue3="//input[@name='login']";
			String xpathvalue4="//a[@href='mercurysignoff.php']";
			String xpathvalue5="//a[@href='mercuryregister.php']";
			driver.findElement(By.xpath(xpathvalue1)).sendKeys("mercury");
			driver.findElement(By.xpath(xpathvalue2)).sendKeys("mercury");
			driver.findElement(By.xpath(xpathvalue3)).click();
			
			//String radioxpathvalue="//input[@type='radio']";
			
			String rbtGrpXpath1="//input[@type='radio' and @name='tripType']";
			String rbtGrpXpath2="//input[@type='radio' and @name='servClass']";
								
			List<WebElement> oRadio = driver.findElements(By.xpath(rbtGrpXpath1));
			
			//oRadio.get(1).click();
	
			 // This will tell you the number of checkboxes are present
			 
			 int iSize = oRadio.size();
			 System.out.println("Total radio buttons:"+iSize);
			 
			 // Start the loop from first checkbox to last checkboxe
			 
			 for(int i=0;i<iSize;i++){			 
				 // Store the checkbox name to the string variable, using 'Value' attribute			 
				 String sValue = oRadio.get(i).getAttribute("value");				 
				 System.out.println("Value of "+ i+"th Radio button "+sValue);
		 
				 if (sValue.equalsIgnoreCase("roundtrip")){			 
					 oRadio.get(i).click();			 
					 // This will take the execution out of for loop			 
					 break;			 
					 }
			 
				}
		
			
			//signoff
			//driver.findElement(By.xpath(xpathvalue4)).click();			
			
		}

	}

