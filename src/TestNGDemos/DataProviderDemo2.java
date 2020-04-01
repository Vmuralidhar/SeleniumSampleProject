package TestNGDemos;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;


public class DataProviderDemo2 {
	
	 @Test(dataProvider="setData")
	  public void loginTest(String userName,String Password) {

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
				driver.findElement(By.xpath(xpathvalue1)).sendKeys(userName);
				driver.findElement(By.xpath(xpathvalue2)).sendKeys(Password);
				driver.findElement(By.xpath(xpathvalue3)).click();
				
				//signoff
				//driver.findElement(By.xpath(xpathvalue4)).click();

				driver.close();
				driver.quit();
				
			}

	  	 	 
	 @DataProvider
	 public Object[][] setData()
	 {
		 Object[][] o1= new Object[3][2];
		 
		 o1[0][0]="mercury";
		 o1[0][1]="mercury";
		 o1[1][0]="mercury123";
		 o1[1][1]="mercury123";
		 o1[2][0]="muralidhar";
		 o1[2][1]="vadaga";
		 
		 return o1;
		 
	 }
	 
	 @DataProvider
	 public Object[][] setData1()
	 {
		 Object[][] o1= new Object[3][2];
		 
		 o1[0][0]="mercury";
		 o1[0][1]="mercury";
		 o1[1][0]="mercury123";
		 o1[1][1]="mercury123";
		 o1[2][0]="muralidhar";
		 o1[2][1]="vadaga";
		 
		 return o1;
		 
	 }


}
