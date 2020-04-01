package seleniumDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindRadioButtons {

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
			
			String radioxpathvalue="//input[@type='radio']";
			
			////input[@type='radio' and @name='tripType']
			//input[@type='radio' and @name='servClass']
			
			int totalradiobuttons=driver.findElements(By.xpath(radioxpathvalue)).size();
			
			//String radiosize=
			System.out.println("Total Radio Buttons  "+totalradiobuttons);
			
			//<input type="radio" value="oneway" name="tripType"/>
			/*
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).sendKeys("mercury");.*/
			
			
			

			
			

		}

	}

