package TestNGDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class KeywordsDemo {
	
	static WebDriver driver;

		//driver=new FirefoxDriver();
		//driver.get("http://gmail.com");
	@Test
	
	public void openBrowser(String browserName) {
		try {
				if (browserName.equalsIgnoreCase("Firefox")) {
					driver = new FirefoxDriver();
				} else if (browserName.equalsIgnoreCase("Chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\computer\\Desktop\\\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("IE")) {
					System.setProperty("webdriver.ie.driver",
							"C:\\Users\\computer\\Desktop\\IEDriverServer.exe");
					driver = new InternetExplorerDriver();
				}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}
}
		

