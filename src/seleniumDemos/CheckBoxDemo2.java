package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo2 {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://www.calculator.net/mortgage-calculator.html");
			// //tagname[@attribute='value']
			String xpathvalue1="//*[@id='caddoptional']";
			
			boolean SelectFlag=driver.findElement(By.xpath(xpathvalue1)).isSelected();
			
			String CheckFlag=driver.findElement(By.xpath(xpathvalue1)).getAttribute("checked");
			
			 System.out.println("Flag Value before:"+SelectFlag);
			 System.out.println("Check flag Value before:"+CheckFlag);
			 
			 if(SelectFlag==false)
			 {						
				 System.out.println("Check box is not seleteced "+SelectFlag);

			 }else
			 {
				 System.out.println("Check box is already selected and selected flag is:"+SelectFlag);
				 driver.findElement(By.xpath(xpathvalue1)).click();
				 SelectFlag=driver.findElement(By.xpath(xpathvalue1)).isSelected();
				 CheckFlag=driver.findElement(By.xpath(xpathvalue1)).getAttribute("checked");
				 System.out.println("Flag Value after unchekcing or click "+SelectFlag);
				 System.out.println("CheckFlag Value after unchecking or click "+CheckFlag);
				 
				 
			 }
					
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

