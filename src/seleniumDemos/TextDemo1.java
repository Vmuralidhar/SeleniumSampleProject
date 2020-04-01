package seleniumDemos;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TextDemo1 {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		String ExpectedData="to continue to Gmail";
		
		String ActData=driver.findElement(By.xpath("//*[@id='headingSubtext']")).getText();
		System.out.println(ActData);
		
		if(ExpectedData.equals(ActData))
		{
			System.out.println("Data got matched");
		}
		else
		{
			System.out.println("Data not matched");
			throw new Exception("Data not matched");
		}
		

		System.out.println("Done");
	}

}
