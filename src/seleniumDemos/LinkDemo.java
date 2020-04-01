package seleniumDemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkDemo {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://bbc.com/");
			//String xpathvalue=".//*[@id='u_0_l']";
			

			
			List<WebElement> oLinks = driver.findElements(By.tagName("a"));
			 
			 int iSize = oLinks.size();
			 System.out.println("Total Links:"+iSize);
			 
			 // Start the loop from first checkbox to last checkboxe
			 
			 for(int i=0;i<iSize;i++){			 
				 // Store the checkbox name to the string variable, using 'Value' attribute			 
				 //String sValue = oLinks.get(i).getAttribute("span");
				 String sValue = oLinks.get(i).getText();
				 System.out.println("Value of Link"+ i+"th:"+sValue);
				
		}

	}
}

