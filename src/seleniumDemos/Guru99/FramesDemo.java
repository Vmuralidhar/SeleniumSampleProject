package seleniumDemos.Guru99;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FramesDemo {
	  public static void main(String[] args) {
		  	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");  
		  	WebDriver driver = new FirefoxDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");


    //Assume driver is initialized properly. 
    List<WebElement> ele = driver.findElements(By.tagName("frame"));
    System.out.println("Number of frames in a page :" + ele.size());
    for(WebElement el : ele){
      //Returns the Id of a frame.
        System.out.println("Frame Id :" + el.getAttribute("id"));
      //Returns the Name of a frame.
        System.out.println("Frame name :" + el.getAttribute("name"));
    }
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close(); 
	    }
}