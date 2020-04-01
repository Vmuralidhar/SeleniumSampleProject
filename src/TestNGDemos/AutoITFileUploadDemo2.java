package TestNGDemos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITFileUploadDemo2 {
	public static void main(String[] args) throws IOException {
		
		String baseUrl = "file:///C:/Users/computer/Desktop/IOPack/FileUploadDemo1.html";
		
	    WebDriver driver = new FirefoxDriver();
	    driver.get(baseUrl); 
	
	    //driver.findElement(By.xpath("//*[@id='420']")).sendKeys("C:\\Users\\computer\\Desktop\\IOPack\\.Objects.txt");
	    
	    driver.findElement(By.xpath("//*[@id='420']")).click();
	    //Runtime.getRuntime("C:\\Users\\computer\\Desktop\\AutoITDemos\\FireFoxUpload.exe");
	    Runtime.getRuntime().exec("C:\\Users\\computer\\Desktop\\AutoITDemos\\FireFoxUpload.exe");
	      	
	}
}
