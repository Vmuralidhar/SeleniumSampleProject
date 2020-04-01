package TestNGDemos;

import org.testng.annotations.Test;

import utilPack1.Xls_Reader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;


public class DataProviderfromXL {
	
	 @Test(dataProvider="setDatafromXl")
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
	 public Object[][] setDatafromXl()
	 {
		 
		 Xls_Reader r1= new Xls_Reader("C:\\Users\\computer\\Desktop\\IOPack\\TestCase1.xlsx");
			
			int rowcount=r1.getRowCount("Login");
			int colcount=r1.getColumnCount("Login");
		
			Object[][] o1= new Object[rowcount][colcount];
		    System.out.println("Total rows "+rowcount);
		    System.out.println("Total cols "+colcount);
		    
		    for(int i=2;i<=rowcount;i++)
		    	for(int j=0;j<colcount;j++)
		    	{
		    		//System.out.println("value in username: "+r1.getCellData("Login", "UserName", i));
		    		System.out.println("value : "+r1.getCellData("Login", j, i));
		    			o1[i-2][j]=r1.getCellData("Login", j, i);    		
		    		//System.out.println("value in password: "+r1.getCellData("Login", "Password", i));
		    		
		    		
		    	}
		 
		 /*
		 o1[0][0]="mercury";
		 o1[0][1]="mercury";
		 o1[1][0]="mercury123";
		 o1[1][1]="mercury123";
		 o1[2][0]="muralidhar";
		 o1[2][1]="vadaga";.*/
		 
		 return o1;
		 
	 }


}
