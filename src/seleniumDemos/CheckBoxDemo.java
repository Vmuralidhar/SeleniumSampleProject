package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
			// //tagname[@attribute='value']
			String xpathvalue1="//span[@id='ContentHolder_lbFeatures_TG_D']";
						
			//a[@href='userName']
			//a href="mercurysignoff.php
			String xpathvalue2="//span[@id='ContentHolder_lbModels_10_D']";
			
			boolean SelectFlag=driver.findElement(By.xpath(xpathvalue1)).isSelected();			
			String CheckFlag=driver.findElement(By.xpath(xpathvalue1)).getAttribute("checked");
			String ClassValue=driver.findElement(By.xpath(xpathvalue1)).getAttribute("class");
			 System.out.println("Flag Value before"+SelectFlag);
			 System.out.println("Check Value before"+CheckFlag);
			 System.out.println("calss Value before"+ClassValue);
			 
			 if(SelectFlag==false)
			 {
			
				 driver.findElement(By.xpath(xpathvalue1)).click();
				 SelectFlag=driver.findElement(By.xpath(xpathvalue1)).isSelected();
				 System.out.println("Flag Value after click "+SelectFlag);
				 CheckFlag=driver.findElement(By.xpath(xpathvalue1)).getAttribute("checked");
				 System.out.println("CheckFlag Value after click "+CheckFlag);
				 ClassValue=driver.findElement(By.xpath(xpathvalue1)).getAttribute("class");
				 System.out.println("calss Value after"+ClassValue);
			 }
			
			
			
			driver.findElement(By.xpath(xpathvalue2)).click();

			/*					
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
			 
				}.*/			
			
		}

	}

