package seleniumDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsDemo {

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
					
			int totalrbtGrp1=driver.findElements(By.xpath(rbtGrpXpath1)).size();
			int totalrbtGrp2=driver.findElements(By.xpath(rbtGrpXpath2)).size();
			
			
			System.out.println("Total Radio Buttons of the Group1 "+totalrbtGrp1);
			System.out.println("Total Radio Buttons of the Group2 "+totalrbtGrp2);
			
			String Xpath1="//input[@type='radio' and @value='oneway']";
			String Xpath2="//input[@type='radio' and @value='roundtrip']";
			String Xpath3="//input[@type='radio' and @value='First']";
			String Xpath4="//input[@type='radio' and @value='Business']";
			String Xpath5="//input[@type='radio' and @value='Coach']";
			
			//selecting the different radio buttons
			driver.findElement(By.xpath(Xpath1)).click();
			driver.findElement(By.xpath(Xpath2)).click();
			driver.findElement(By.xpath(Xpath3)).click();
			driver.findElement(By.xpath(Xpath4)).click();
			driver.findElement(By.xpath(Xpath5)).click();
			
			//signoff
			driver.findElement(By.xpath(xpathvalue4)).click();
			//registration
			driver.findElement(By.xpath(xpathvalue5)).click();
				
			
		}

	}

