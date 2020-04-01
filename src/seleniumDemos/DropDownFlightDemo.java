package seleniumDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownFlightDemo {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://newtours.demoaut.com/");
			// //tagname[@attribute='value']
			String xpathvalue1="//input[@name='userName']";
			
			
			//a[@href='userName']
			//a href="mercurysignoff.php
			String xpathvalue2="//input[@name='password']";
			String xpathvalue3="//input[@name='login']";
			driver.findElement(By.xpath(xpathvalue1)).sendKeys("mercury");
			driver.findElement(By.xpath(xpathvalue2)).sendKeys("mercury");
			driver.findElement(By.xpath(xpathvalue3)).click();
			
			//String drpDepartxpath="//select[@name='fromPort']";
			
			//finding no of Drop Downs
			
			List<WebElement> oDropdowsn = driver.findElements(By.tagName("select"));
			 
			 int iSize = oDropdowsn.size();
			 System.out.println("Total dropdowns:"+iSize);
			 		 
			 for(int i=0;i<iSize;i++){			 
				 // Store the checkbox name to the string variable, using 'Value' attribute			 
				String sValue = oDropdowsn.get(i).getAttribute("name");
				 //String sValue = oDropdowsn.get(i).getText();
				 System.out.println("name of drop downs"+ i+"th:"+sValue);
				
		}
			
			String drpDepartxpath="//select[@name='toPort']";
			
			
			WebElement we=driver.findElement(By.xpath(drpDepartxpath));
			
			//here we are passing WebElement DataType
			Select drpDepart=new Select (we);
			drpDepart.selectByValue("Frankfurt");
			drpDepart.selectByIndex(6);
			drpDepart.selectByVisibleText("New York");
			
			
			
			
			String SelectedValue=drpDepart.getFirstSelectedOption().getAttribute("value");
			System.out.println("Selected Value:"+SelectedValue);
			
			System.out.println("Selected Value by othet means:"+drpDepart.getFirstSelectedOption().getText());
			
			
			
			//drpDepart.getOptions().get(1)
			/*
			 for (int j = 0; j < drpDepart.getOptions(.size(); j++) {
			        System.out.println(drpDepart.getOptions().get(j).getText());
			    }.*/
			
			
			List<WebElement> dropDownList = we.findElements(By.tagName("option"));		
				
		    //Get all options
		  //  List<WebElement> dropDownList = drpDepart.getOptions();

		    //Get the length
		    System.out.println(dropDownList.size());

		    // Loop to print one by one
		    for (int j = 0; j < dropDownList.size(); j++) {
		        System.out.println(dropDownList.get(j).getText());
		    }

				    
		
			/*
			List<WebElement> oList = driver.findElements(By.xpath(drpDepartxpath));
		 
			 int iSize = oList.size();
			 System.out.println("Total Values in Drop Down:"+iSize);
			 
			 // Start the loop from first checkbox to last checkboxe
			 
			 for(int i=0;i<iSize;i++){			 
				 // Store the checkbox name to the string variable, using 'Value' attribute			 
				 String sValue = oList.get(i).getAttribute("value");				 
				 System.out.println("Value of "+ i+"th drop down"+sValue);
				 */
				
		}

	}


		

