package seleniumDemos.Guru99;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageDemo {

	public static void main(String[] args) {
        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
       // System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        
        System.out.println("Title is:"+driver.getTitle());
        //verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals("Facebook – log in or sign up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }
}
}
