package TestNGDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITFileUploadDemo1 {
	public static void main(String[] args) {
		
		String baseUrl = "file:///C:/Users/computer/Desktop/IOPack/FileUploadDemo1.html";
		
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl); 
	
	    driver.findElement(By.xpath("//*[@id='420']")).sendKeys("C:\\Users\\computer\\Desktop\\IOPack\\.Objects.txt");
	
	
	}
}
