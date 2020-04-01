package seleniumDemos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonDemo {

		public static void main(String[] args) {
			WebDriver driver=new FirefoxDriver();
			driver.get("http://facebook.com");
			String xpathvalue=".//*[@id='u_0_l']";
			boolean Displayflag=driver.findElement(By.xpath(xpathvalue)).isDisplayed();
			
			boolean Enableflag=driver.findElement(By.xpath(xpathvalue)).isEnabled();
			
			boolean selectflag=driver.findElement(By.xpath(xpathvalue)).isSelected();
			
			System.out.println("Displayflag Flag "+Displayflag);
			
			
			if(Displayflag==true & Enableflag==true)
			{
				System.out.println("Creat account button displayed and enabled");
				//String ButtonName=driver.findElement(By.xpath(xpathvalue)).getAttribute("value");
				String ButtonName=driver.findElement(By.xpath(xpathvalue)).getText();
				System.out.println("Button Name is "+ButtonName);
				
				driver.findElement(By.xpath(xpathvalue)).click();
				
				
				
			}


		}

	}

