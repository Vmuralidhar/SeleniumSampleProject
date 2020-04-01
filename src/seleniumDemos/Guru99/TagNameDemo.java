package seleniumDemos.Guru99;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameDemo {
	public static void main(String[] args) {
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        String tagName = "";
        
        driver.get(baseUrl);
        
        System.out.println(driver.getCurrentUrl());
        //System.out.println(driver.getPageSource());
        tagName = driver.findElement(By.id("email")).getTagName();
        String atrributeValue = driver.findElement(By.id("email")).getText();
        System.out.println(tagName);
        System.out.println(atrributeValue);
        
        //    tagname[attribute=attributevalue]
        driver.findElement(By.cssSelector("input[id=email]")).sendKeys("muralidhar.vadaga@gmail.com");
        
        driver.findElement(By.cssSelector("input[id=email]")).clear();
      // //tagname[@attribute='value']
        
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("muralidhar.vadaga@gmail.com");
              
        //driver.close();
        driver.quit();
        System.exit(0);
}
	}
