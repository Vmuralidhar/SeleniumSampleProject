package TestNGDemos;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilPack1.ReadData;
import utilPack1.Xls_Reader;

public class DataDrivenXlDemo1 {
	
	@Test(dataProvider="setData")
	  public void loginTest(Hashtable<String, String> h1) {

				String userName=h1.get("UserName");
				String Password=h1.get("Password");
				
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
				//driver.quit();
				
			}

	  	 	 
	 @DataProvider
	 public Object[][] setData()
	 {
		// Object[][] o1= new Object[3][2];
		 Xls_Reader r1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\DataSheet1.xlsx");
		 		 		 
		 return ReadData.getData("Login2",r1);
		 
		 
	 }

}
