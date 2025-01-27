package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class TestGuru99MultipleSession {
    @Test    
    public void executSessionOne(){
            //First session of WebDriver
       // System.setProperty("webdriver.chrome.driver","chromedriver.exe");
           // WebDriver driver = new ChromeDriver();
    	WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            driver.close();
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
    	WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.close();
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
    	WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.close();
        
        }        
}
