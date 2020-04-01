package seleniumDemos;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class PopUpWindowDemo {

		public static void main(String[] args) {
		    String baseUrl = "https://www.naukri.com/";
		    WebDriver driver = new FirefoxDriver();
		    driver.get(baseUrl);
		    //driver.close();
		    //driver.quit();
		    
		    
		    String xpathvalue="html/body/div[5]/div/div[1]/div[1]/div/ul/li[1]/a/img";
		    
		   	//click on apply now
		    driver.findElement(By.xpath(xpathvalue)).click();
		    
		    Set<String> Popups=driver.getWindowHandles();
		    
		   
		    System.out.println("Total Popus:"+Popups.size());
		    Iterator<String> iterations= Popups.iterator();
		    
		    String parentwindow=iterations.next();
		    System.out.println("parentwindow :"+parentwindow);
		    
		    String childwindow1=iterations.next();
		    System.out.println("child1 :"+childwindow1);
		    
		    String childwindow2=iterations.next();
		    System.out.println("child2 :"+childwindow2);
		    //closing first window..ie amazon
		    driver.switchTo().window(childwindow1).close();
		    //switching to cognizant window
		    driver.switchTo().window(childwindow2);
		   
		    //contact us
		    driver.findElement(By.xpath("//*[@id='menu-item-25']/a")).click();
		    		    		    		    
}
}


