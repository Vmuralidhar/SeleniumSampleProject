package seleniumDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;

public class ClosenQuitChrome {

	public static void main(String[] args) {
		//WebDriver driver=new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\computer\\Desktop\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
	//	System.setProperty("webdriver.ie.driver", "C:\\Users\\computer\\Desktop\\IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("http://meghanatravels.in/");
		//driver.close();
		
		driver.quit();
		


		

	}

}

