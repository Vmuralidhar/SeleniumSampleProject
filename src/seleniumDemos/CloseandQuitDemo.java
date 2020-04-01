package seleniumDemos;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class CloseandQuitDemo {

		public static void main(String[] args) {
		    String baseUrl = "https://www.naukri.com/";
		    WebDriver driver = new FirefoxDriver();
		    driver.get(baseUrl);
		    //driver.close();
		    driver.quit();
		    		    
}
}


